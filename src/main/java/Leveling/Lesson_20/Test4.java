package Leveling.Lesson_20;
import java.util.ArrayList;
public class Test4 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(1,new StringBuilder("hello"));
        for (StringBuilder s: list){
            System.out.print(s +" ");
        }
        System.out.println();
        ArrayList <StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Petrov"));
        list2.add(new StringBuilder("Sidorov"));

        list.addAll(list2);
        for (StringBuilder s: list) {
            System.out.print(s + " ");
        }
        System.out.println();

        list2.get(1).append("!");//В случае с StringBuilder изменения содержимого элемента будут видны в обоих ArrayList,так как ссылаются они на один и тот же объект
        for (StringBuilder s: list) {
            System.out.print(s + " ");
        }
        System.out.println();
        //list.clear();//Метод позволяет быстро очистить ArrayList

        for (StringBuilder s: list) {
            System.out.print(s + " ");
        }
    }
}

