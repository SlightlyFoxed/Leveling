package Leveling.Lesson_16;

public class Test9 {//ОПРЕДЕЛЕНИЕ РАВЕНСТВА String
    public static void main(String[] args) {
        String s1 = new String("ok");
        String s2 = new String("ok");
        System.out.println(s1 == s2);// false, так как даже при одинаковом значении, переменные все равно ссылаются на разные объекты
        System.out.println(s1.equals(s2));//Для сравнения объектов необходимо пользоваться методом .equals
        // По дефолту метод equals и == одно и то же, но в классе String метод equals перезаписан, то есть изменен, что не делает его тем же что и ==
        String s3 = "privet";//Занесение объекта "privet" в String Pool
        String s4 = "privet";//Так как объект "privet" уже есть в String Pool, новый объект не создается а s4 просто начинает ссылаться на тот же объект что и s3
        System.out.println(s3 == s4);//Поэтому данное выражение возвращает true
        System.out.println(s3.equals(s4));
        System.out.println(s1!=s4);

        String s10 = "Kak Dela?";
        String s11 = "kak dela?";
        System.out.println(s10.equals(s11));//Так как регистр символов разный, объекты при сравнении возвращают false
        System.out.println(s10.equalsIgnoreCase(s11));//Метод сравнивает длину и символы, игнорируя их регистр.

    }
}
