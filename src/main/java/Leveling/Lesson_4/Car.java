package Leveling.Lesson_4;

public class Car {
    String color = "red";
    String engine = "V6";

}
class CarTest {
    public static void main(String[] args) {


        Car car1 = new Car();
        car1.color = "black";
        car1.engine = "V8";
        Car car2 = new Car();
        Car car3 = car1;//Переменные могут ссылаться на один и тот же объект. Но переменная не может ссылаться на два объекта
        System.out.println("Cvet " + car1.color);
        System.out.println("Motor " + car1.engine);
    }
}
