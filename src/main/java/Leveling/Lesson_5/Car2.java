package Leveling.Lesson_5;

public class Car2 {
    String color;
    String engine;
    int speed;

    int trottle (int skorost) {
        speed += skorost;
        return speed;
    }
    int brake (int skorost) {
        speed -= skorost;
        return speed;
    }
    void showInfo(){
        System.out.println("cvet "+ color + " motor " + engine + " skorost " + speed);
    }
}
class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "black";
        c1.engine = "v6";
        c1.speed = 60;
        c1.showInfo();
        c1.trottle(20);
        c1.showInfo();
        c1.brake(80);
        c1.showInfo();
    }
}