package Leveling.Lesson_27;

public class Test19 {
    //Распространенные саб классы Error

    static {//ExceptionInInitializerError саб класс LinkageError.
        //int a = Integer.parseInt("12e");//ExceptionInInitializerError выбрасывается когда в СТАТИЧЕСКИХ инициализаторах возникает RuntimeException
        //строчка выше вообще выбрасывает NumberFormatException,но из за того,
        // что она находится в статическом инициализаторе,это приведет к ExceptionInInitializerError
        //ExceptionInInitializerError применима ко всему что связано с static
    }
    //StackOverflowError саб класс VirtualMachineError
    //OutOfMemoryError саб класс VirtualMachineError//Выбрасывается когда закончилась память из за огромного количества созданных объектов
    //NoClassDefFoundError саб класс LinkageError//Означает что java не может найти какой либо класс runtime, уже во время запуска программы

    public static void main(String[] args) {

    }

}
