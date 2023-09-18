package Leveling.Lesson_29;

public class Test4 {
    static void def (Test5 t) {
        System.out.println(t.abc("privet"));
    }

    public static void main(String[] args) {
        def(x -> x.length());
        def(x ->{x = "ok";return x.length();});//можно изменить значение x сразу в лямбда выражении
    }
}
interface Test5{
    int abc (String s);
}
