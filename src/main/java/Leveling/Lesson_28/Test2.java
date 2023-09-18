package Leveling.Lesson_28;

public class Test2 {
    Car c = Car.createCar();//Объект создан без конструктора
}
class Car {
    private Car (){}

    static Car createCar(){
        return new Car();
    }//Этот статический метод будет заменять конструктор класса Car
}
