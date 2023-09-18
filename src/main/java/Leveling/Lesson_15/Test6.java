package Leveling.Lesson_15;

public class Test6 {
    public static void main(String[] args) {
        int i =1;

        do {// в отличие от обычного while, тело цикла do while обработается хотя бы 1 раз, вне зависимости от результатов проверки условия
            System.out.println(i);
            i++;
        }
        while (i==10);
    }
}
