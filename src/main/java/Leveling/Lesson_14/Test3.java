package Leveling.Lesson_14;

public class Test3 {
    public static void main(String[] args) {

        for (int i = 2; i <= 30; i = i + 2) {//цикл для вывода четных чисел от 1 до 30
            System.out.println(i);
        }
        int j = 10;
        if (j < 3) {//Это выражение является Unreachable statement. Но в цикле if то, что компилятор допускает это сделать, является исключением из правил.
            System.out.println("menshe 3");
        }
    }
}
