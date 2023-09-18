package Leveling.Lesson_29.Lambdas_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        List <String >list = List.of("privet", "poka", "kak dela?","vse normalno");
        /*for (String s:list) {
            System.out.println(s);
        }*/
        list.forEach(s -> System.out.println(s));//Вместо использования обычного foreach цикла, можно использовать лямбда выражение совместно с методом forEach

        ArrayList <Integer> al = new ArrayList<>();
        al.add(2);
        al.add(6);
        al.add(4);
        al.add(5);
        al.add(3);
        al.add(7);
        al.add(1);
        //al.removeIf(element -> element % 3 == 0);//удаляет элементы которые делятся на 3 без остатка
        /*Predicate <Integer> p = element -> element % 3 == 0;//Аналогичный метод записи верхней строки
        al.removeIf(p);*/
        System.out.println(al);
        al.sort((x, y) -> x.compareTo(y));//метод compareTo сравнивает два аргумента и возвращает отрицательное значение, ноль или положительное значение
        //Отрицательное значение возвращает когда первый аргумент меньше второго, ноль когда они равны, и положительное когда первый аргумент больше второго
        //Если необходимо отсортировать коллекцию в обратном порядке, то нужно добавить минус к x.compareTo (-x.compareTo(y))
        //Переменные которые определены в секции объявления переменных (x, y), их область видимости это всё лямбда выражение.Дальше они перестают быть видны
        System.out.println(al);
    }
}
