package Leveling.Lesson_20_ArrayListMethods;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("all = "+ al1);
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("one");
        al2.add("three");
        al2.add("four");
        al2.add("ten");


        al1.removeAll(al2);//метод позволяет удалить из первого ArrayList все элементы, которые находятся во втором ArrayList, записанного в параметре метода
        System.out.println("all = "+ al1);//Метод нашел похожие элементы из второго ArrayList и удалил их из первого ArrayList

        ArrayList<String> al3 = new ArrayList<>();
        al3.add("one");
        al3.add("two");
        al3.add("three");
        al3.add("four");
        al3.add("five");
        System.out.println("all = "+ al3);
        ArrayList<String> al4 = new ArrayList<>();
        al4.add("one");
        al4.add("three");
        al4.add("four");
        al4.add("ten");
        al3.retainAll(al4);//Метод противоположный .removeAll. Он сохраняет элементы которые совпадают у первого и второго ArrayList и удаляет остальные
        System.out.println("all = "+ al3);


    }
}
