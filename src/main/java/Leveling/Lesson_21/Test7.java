package Leveling.Lesson_21;

public class Test7 {
    public void abc (int a, double b){
        System.out.println("privet");
    }
    public void abc (double a, int b){
        System.out.println("poka");
    }

    public static void main(String[] args) {
        Test7 t = new Test7();
        t.abc(1.0,2);
        t.abc(1,2.0);
        //t.abc(1,2);В таком случае компилятор не поймет какой метод имеется в виду, так как оба параметра подходят.

    }
}
