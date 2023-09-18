package Leveling.Lesson_26;

public class Test4 {

    static void abc(String s){
        System.out.println("A");
    }
    static void abc(String ... s){
        System.out.println("B");
    }
    static void abc(Object s){
        System.out.println("C");
    }
    static void abc(String s1, String s2){
        System.out.println("D");
    }

    static void def(Long a) {
        System.out.println("E");
    }
    static void def(Long... a) {
        System.out.println("F");
    }
    static void def(long... a) {
        System.out.println("G");
    }
    static void def(Object... a) {
        System.out.println("H");
    }
    static void def(Integer a) {
        System.out.println("I");
    }


    public static void main(String[] args) {
        Test4 t = new Test4();
        t.abc("ok");//Приоритет для этого параметра будет следующий: A,C,B. оставшийся метод не подойдет.
        t.abc("ok","!!!");//Приоритет для этого параметра будет следующий:D,B. остальные не подходят
        t.abc("ok","!!!","???");//Подходит только B
        t.def(50l);//Приоритет для этого параметра будет следующий: E,F
        t.def(50);//Приоритет для этого параметра будет следующий:I,G,H.
        // Методы с Long не подходят, так как конвертация типов данных для соответствия параметр листу метода не может происходить в два этапа
    }
}
