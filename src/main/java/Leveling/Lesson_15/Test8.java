package Leveling.Lesson_15;

public class Test8 {
    public static void main(String[] args) {
        //do {}while (true); Минимальная реализация бесконечного цикла

        do {
            System.out.println("hello");
        } while (5 == 10);//Если в случае с обычным while была бы ошибка компилятора, unreachable statement, do while позволяет записать это условие.
    }
}
