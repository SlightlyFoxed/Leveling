package Leveling.Lesson_8;

public class Car {
    String color = "blue";
    String engine = "V6";

}
class Human {
    String name = "Ivan";
    final Car c = new Car();//final можно применить и к референсным типам данных. Создан объект Car

    public static void main(String[] args) {
        Human h1 = new Human();
        //h1.c = new Car();//так как переменная _с_ с модификатором final то невозможно изменить его адрес
        //h1.c = new Car();
        h1.c.engine = "V8";//при этом все езе можно изменить какие либо переменные в объекте

    }
}