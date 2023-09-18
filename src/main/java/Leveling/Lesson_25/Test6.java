package Leveling.Lesson_25;

public class Test6 {
}
class Test10 {
    int a = 5;
    void abc(){
        System.out.println("ok1");
    }
}
class Test20 extends Test10 {
    int a = 10;
    void abc(){
        System.out.println("ok2");
    }
}
class Test30 extends Test10 {
    int a = 15;
    void abc(){
        super.abc();//Вызывается метод супер класса Test20
        System.out.println("ok3");
    }

    public static void main(String[] args) {
        Test30 t = new Test30();
        System.out.println(((Test10)t).a);//Casting для того, чтобы вызвать переменную предка супер класса
    }
}