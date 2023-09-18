package Leveling.Lesson_29.Lambdas_2;

import java.util.ArrayList;
import java.util.function.Supplier;//Supplier - это поставщик.Supplier ничего не принимает в параметры но возвращает объект типа T
import java.util.function.Consumer;//Consumer - это потребитель.Consumer принимает в параметр объект типа Т но ничего не возвращает

public class Car {
    String model;
    String color;
    double engine;

    Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String toString() {//Перезаписанный метод toString
        return "Our car is " + model + ", color is " + color + ", and engine = " + engine;
    }
}

class Test10 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {//в параметрах метода, по аналогии с Predicate, используется интерфейс Supplier
        //Supplier так же является generics.
        ArrayList<Car> aL = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            aL.add(carSupplier.get());//в Supplier есть его единственный абстрактный метод get(). вызываем его.
        }
        return aL;
    }

    public static void changeCar(Car car, Consumer<Car> consumer) {
        consumer.accept(car);//consumer вызывает метод accept и в параметр принимает car.
        // Что конкретно будет делать метод accept можно задать при использовании этого метода
    }

    public static void main(String[] args) { //метод get не принимает параметров и должен вернуть объект типа Т (В этом случае Car)
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan Tiida", "silver metallic", 1.6));
        System.out.println("ourCars: " + ourCars);

        changeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 2.4;
            System.out.println("updated car: " + car);
        });
        //Альтернативный способ записи Consumer
        Consumer<Car> consumer = car -> {//Создан объект Consumer-а и сразу же указано как должен работать метод accept.
            // А метод accept будет принимать в себя параметр, который уже указан, это <Car>
            car.color = "red";
            car.engine = 2.4;
            System.out.println("updated car: " + car);
        };
        consumer.accept(ourCars.get(0));//Затем, когда вызывается метод accept, в параметре указывается какой объект нужно изменить
        System.out.println("ourCars: " + ourCars);
    }
}
