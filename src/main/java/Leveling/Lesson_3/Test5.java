package Leveling.Lesson_3;

public class Test5 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(!a);//! оператор отрицания.

        int a1 = 10;
        int b1 = 5;
        boolean c = !(a1>b1);
        System.out.println(c);

        int a2 = 10;
        int b2 = 50;
        int c2 =99;
        int d2 = 100;

        //boolean e = a2 < b2 && c2++ == d2;// true && false
        //boolean e = a2 > b2 && c2++ == d2; //как только первое сравнение вернет false то дальнейшее выражение не проверяется и переменная с2 не будет увеличиваться
        boolean e1 = a2 > b2 || ++c2 == d2;
        //boolean e1 = a2 < b2 || ++c2 == d2;//как только первое сравнение вернет true то дальнейшее выражение не проверяется и переменная с2 не будет увеличиваться
        //System.out.println(e);
        System.out.println(c2);
        System.out.println(e1);
        // чтобы Short circuit перестал работать, и все выражение продолжало работать, можно использовать оператор & и | (bitwise оператор)
        //Но результат true или false останется прежним
        //Так же bitwise операторы & и | позволяют работать с числами, но они будут переведены в бинарный код и затем обработаны по логике оператора
        //Итог в бинарном коде будет переведен обратно в десятеричную систему и будет показан в выводе.
         int x = 10;//1010 в бинарном коде
         int y = 5; //0101 в бинарном коде
        System.out.println(x&y);//0
        System.out.println(x|y);//15 в бинарном коде 1111
        // оператор ^ (bitwise exclusive or) вернет true только в том случе если все будут false и только один true.
        boolean v1 = false;
        boolean v2 = false;
        boolean v3 = true;
        boolean v4 = false;
        System.out.println(v1^v2^v3^v4);

    }
}
