package Leveling.Lesson_15;

public class Test4 {
    public static void main(String[] args) {
        int a = 5;

        while (a++ < 10){//Если в условии использовать a++ то в выводе переменная _a_ будет равна 12,
            // так как даже после того как условие после проверки возвращает false, переменная все равно увеличится на 1, но тело цикла работать не будет
            a++;
        }
        System.out.println(a);
    }
}
