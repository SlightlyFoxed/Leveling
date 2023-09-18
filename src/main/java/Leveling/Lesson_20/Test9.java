package Leveling.Lesson_20;
import java.util.ArrayList;
import java.util.Collections;//Для обращения к короткому имени импортируется класс Collections
public class Test9 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList <String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);
        ArrayList <String> list2 = list1;
        ArrayList <String> list3 = new ArrayList<>();
        list3.add(s3);
        list3.add(s1);
        list3.add(s4);
        list3.add(s2);
        ArrayList <String> list4 = new ArrayList<>();
        list4.add(s1);
        list4.add(s4);
        list4.add(s2);
        list4.add(s3);

        System.out.println(list1);
        //Collections.sort(list1);//Метод для сортировки ArrayList. возвращает void
        System.out.println(list1);
        System.out.println(list1.equals(list2));//Метод для сравнения элементов двух ArrayList. Проверяется количество элементов и их порядок в ArrayList
        System.out.println(list1.equals(list3));//Метод .equals в классе ArrayList перезаписан
        System.out.println(list1.equals(list4));//false если порядок элементов отличается
        //Два ArrayList считаются одинаковыми если они содержат одинаковые элементы и их количество и порядок в котором находятся элементы так же не менялись
    }
}
