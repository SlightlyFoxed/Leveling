package Leveling.Lesson_20;
import java.util.ArrayList;
public class Test6 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add(new String("poka"));
        list.add(new String("privet"));
        list.add(new String("ok"));
        list.add(new String("privet"));
        list.add(new String("hello"));
        for (String s :list){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list.indexOf(new String("privet")));//Метод позволяет найти индекс по значению элемента.
        System.out.println(list.lastIndexOf(new String("privet")));//Метод позволяет найти самый последний индекс на котором найден искомый объект
        //Если объект не найден, в выводе будет -1
        System.out.println(list.size());//Метод показывает размер ArrayList
        System.out.println(list.isEmpty());//Метод проверяет пустой ли ArrayList. Если size равен 0, то пустой и в выводе будет true
        //list.clear();
        //System.out.println(list.isEmpty());
        System.out.println(list.contains("poka"));//c помощью этого метода ArrayList сравнивает свои элементы с искомым элементом.возвращает boolean
        //.contains  использует .equals
        System.out.println(list.toString());
    }
}
