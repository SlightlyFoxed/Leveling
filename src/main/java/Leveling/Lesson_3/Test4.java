package Leveling.Lesson_3;

public class Test4 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 5;
        boolean b1 = a>b;
        boolean b2= b<=c;
        boolean b3 = b==c;
        boolean b4 = b!=a;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        boolean x =true;
        boolean y = true;
        boolean z = false;

        boolean result = x && y && z;//всегда false если хотя бы одна переменна false
        boolean result1 = x || y || z;// всегда true если хотя бы одна переменна true
        //Short circuit
        //если хотя бы одно выражение false для && то дальнейшие проверки не выполняются.Для || true.


    }
}
