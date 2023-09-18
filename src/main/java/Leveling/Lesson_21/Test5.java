package Leveling.Lesson_21;

public class Test5 {
    void abc (int i){//При вызове метода, требующего в параметр тип данных int можно использовать тип данных char
        System.out.println(i);
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        char c = 'a';
        t.abc(c);//Так как в основе char лежит int, который определяет порядковый номер символа
        System.out.println('b' + 10);
    }
}
