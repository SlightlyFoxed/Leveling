package Leveling.Homework;

public class Lesson_8_2 {
    static final double Pi = 3.14;

    public double PloshadKruga (double radius){
        double PK = Pi*radius*radius;
        return PK;
    }
    public static double DlinaOkr (double radius2){
        double DO = 2 * Pi *radius2;
        return DO;
    }
    public void radInfo (double radius3){
        System.out.println("Radius = "+radius3);
        System.out.println("Ploshad kruga = "+ PloshadKruga(radius3));
        System.out.println("Dlina okrujnosti = "+DlinaOkr(radius3));

    }
}
class Lesson_8_2Test{
    public static void main(String[] args) {
        Lesson_8_2 rI = new Lesson_8_2();
        System.out.println("Ploshad kruga = " + rI.PloshadKruga(5.5));
        rI.radInfo(1.6);
        System.out.println("Dlina okrujnosti = " + Lesson_8_2.DlinaOkr(2.5));

    }
}
