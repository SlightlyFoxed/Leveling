package Leveling.Lesson_20_ArrayListMethods.Lesson_24;

public class Test7 {
}
interface I5 {
    private static void method1 (){
        System.out.println("static method1");
    }
    private void method2() {//Если добавит private access modifier к методу в интерфейсе, то он перестает быть абстрактным и необходимо написать его тело.
        System.out.println("non-static method");
    }
    default void method3 () {
        method1();
        method2();
    }
    static void method4 () {
        method1();
        //method2();////private non-static метод НЕ может быть использован внутри private static методов
    }
}
//Начиная с Java 9
//private interface метод не может быть абстрактным
//private interface метод может быть использован только внутри интерфейса
//private static метод может быть использован внутри static или non-static методов внутри того же интерфейса
//private non-static метод НЕ может быть использован внутри private static методов