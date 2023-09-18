package Leveling.Lesson_16;

public class Test6 {
    public static void main(String[] args) {
        String s = "PRIvet:2";
        String s1 = s.toLowerCase();//Делает все большие буквы маленькими
        System.out.println(s1);

        String s2 = s.toUpperCase();//Делает все маленькие буквы большими
        System.out.println(s2);

        boolean b = s.contains(":2");//Отвечает на вопрос- Содержит ли объект данные символы? возвращает true или false
        System.out.println(b);
    }
}
