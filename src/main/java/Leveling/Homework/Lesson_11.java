package Leveling.Homework;

public class Lesson_11 {
}
class Car {
    String color;
    String engine;
    int numberOfDoors;
    public Car(String color, String engine, int numberOfDoors){
        this.color = color;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }
}
class CarTest {
     void changeDoor(Car c, int numberOfDoors){
        c.numberOfDoors = numberOfDoors;
    }
    void swapColor(Car c1, Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("black", "v6", 4);
        Car car2 = new Car("white", "v8", 2);
        System.out.println(car1.numberOfDoors);
        ct.changeDoor(car1,3);
        ct.swapColor(car1,car2);
        System.out.println("Информация о первой машине : Цвет :" + car1.color + " Мотор :" + car1.engine + " Количество дверей : " +car1.numberOfDoors);
        System.out.println("Информация о второй машине : Цвет :" + car2.color + " Мотор :" + car2.engine + " Количество дверей : " +car2.numberOfDoors);



    }
}
