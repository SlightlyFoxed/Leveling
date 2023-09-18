package Leveling.Lesson_5;


public class Car3 {
    Car3(String cvet, String motor){//User defined конструктор. взамен дефолтного. При создании конструктора сразу пишу его параметры которые он будет принимать
        color = cvet;
        engine = motor;
        System.out.println("Цвет машины: " + color + " Мотор машины: " +engine);
        //В теле конструктора можно указать чтобы информация об объекте выводилась сразу же при его создании
    }
    Car3() {//конструктор идентичный дефолтному.За исключением того что был написан а не создан компилятором автоматически при создании объекта.
        // Дефолтный параметров не принимает, тело пустое.
        System.out.println("Car was created");// в теле указал что будет происходить при создании объекта
        color = "black";//Так же в теле можно сразу указать какие значения будут принимать параметры
        engine = "v12";//Но в этом случае, при создании нового объекта, который будет подходить по параметрам, значения параметров станут такими же!
    }
    String color;
    String engine;

}
class Car3Test {
    public static void main(String[] args) {
        Car3 car1 = new Car3("white","4AGE");
        Car3 car2 = new Car3();
        System.out.println(car2.color);
        System.out.println(car2.engine);
        Car3 car3 = new Car3();
        car3.engine = "v6";//Значения параметров все еще можно поменять после создания
        System.out.println(car3.color);
        System.out.println(car3.engine);

    }
}
