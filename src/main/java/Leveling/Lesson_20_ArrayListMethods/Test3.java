package Leveling.Lesson_20_ArrayListMethods;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("all = " + al1);
        Object [] array = al1.toArray();//Метод переводит ArrayList в массив типа Object. Все элементы ArrayList будут содержаться в массиве array
        String [] array2 = al1.toArray(new String[5]);//Метод переводит ArrayList в массив того типа данных, который указан
        for (String s: array2){
            System.out.println(s);
        }
        ArrayList<String> al3 = new ArrayList<>();
        al3.add("one");
        al3.add("two");
        al3.add("three");
        al3.add("four");
        al3.add("five");
        List <String> list = List.of("odin","dva","tri");//При создании листа используется метод .of, и в параметрах указываются элементы, из которых он будет состоять
        System.out.println("list = " +list);//List НЕВОЗМОЖНО модифицировать или как то изменять.
        //list.add("fjfdgh");//Если попытаться видоизменить List то это вызовет ошибку UnsupportedOperationException
        List <String> list2 = List.copyOf(al3);//Этот метод принимает в параметр коллекцию и возвращает НЕ МОДИФИЦИРУЕМЫЙ List
        System.out.println("list2 = " +list2);
        //List НЕ может содержать элементы null. Будет ошибка NullPointerException
    }
}
