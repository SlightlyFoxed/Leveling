package Leveling.Lesson_3;

public class Test6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int c = (++a - b) * 2;//оператор ++ выполняется до * если не поставить в ()
        System.out.println(c);
        //Последовательность выполнения операторов
        //++ -- !
        //* / %
        //+ -
        //< <= > >=
        //== !=
        //&& ||
        //= += -= *= /= %=
    }
}
