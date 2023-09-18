package Leveling.Homework;

public class Lesson_8_1 {

    static double Umnojenie (double a1, double b1, double c1){
        double result = a1*b1*c1;
        System.out.println(result);
        return result;
    }
    static void CeloeOst(double a, double b){
        double Celoe = a/b;
        double Ostatok = a%b;
        System.out.println("Celoe chastnoe = "+ Celoe);
        System.out.println("Ostatok = "+ Ostatok );
    }
}
class Lesson_8_1Test{
    public static void main(String[] args) {
        Lesson_8_1.Umnojenie(5.0,6.5,7.3);
        Lesson_8_1.Umnojenie(4.8,1.2,3.5);
        Lesson_8_1.CeloeOst(50.0,4.5);
        Lesson_8_1.CeloeOst(65,3.5);
    }
}
