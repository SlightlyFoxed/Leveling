package Leveling.Lesson_16;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "Hello World";// Объекты класса String являются Immutable. то есть их нельзя изменить.
        String s2 = "Urrraaaaaa!!!";
        String s3 = s1.concat(s2).trim().replace("Uraaaaa!!!", "УРА").substring(6,10);//Method chaining выполняется слева направо по порядку
        System.out.println(s3);
        System.out.println(s1.substring(s1.indexOf('W')));
    }
}
