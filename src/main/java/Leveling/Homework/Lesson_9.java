package Leveling.Homework;

public class Lesson_9 {
    public static void abc () {//Метод для создания двух объектов
        String s1 = new String("ABC");
        String s2 = new String("DEF");
    }
    public static void main(String[] args) {
        Lesson_9 l9 = new Lesson_9();//создан объект
        abc();//созданы два объекта и сразу же прекратили существование, так как они существуют исключительно внутри метода abc
        abc();//созданы два объекта и сразу же прекратили существование, так как они существуют исключительно внутри метода abc
        String s1 = new String("ABC");//Создан объект
        abc();//созданы два объекта и сразу же прекратили существование, так как они существуют исключительно внутри метода abc
    }
}
