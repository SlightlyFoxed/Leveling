package Leveling.Lesson_16;

public class Car {
    String color;
    String engine;
    Car (String color, String engine){
        this.color = color;
        this.engine = engine;
    }
    final static int a = 5;

    public Car abc (String cvet) {
        Car c10 = new Car(cvet, "V4");
        return c10;
    }

    public static void main(String[] args) {
        Car c = new Car ("red","v6");
        Car c2 = c.abc("black");
        System.out.println(c.color);
    }



}
class CarTest{
    final static Car c = new Car ("red","v8");

    public static void main(String[] args) {

        //c = new Car ("red","v10"); //не смотря на то что невозможно изменить final переменную, в случае с объектом возможно менять его параметры
        c.color = "black";
    }
}
