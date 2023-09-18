package Leveling.Lesson_20;
import java.util.ArrayList;
public class Test5 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("poka");
        list.add(sb1);
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuilder("hello"));
        for (StringBuilder sb :list){
            System.out.print(sb + " ");
        }
        System.out.println();
        System.out.println(list.indexOf(new StringBuilder("privet")));//Метод позволяет найти индекс по значению элемента.
        // В этом случае создается новый объект, поэтому метод не может его найти и в выводе будет -1 (искомый объект не обнаружен)
        System.out.println(list.indexOf(sb1));//Для того, чтобы метод работал с StringBuilder, необходимо обращаться к объекту по его референсу.
        System.out.println(list.contains(sb1));//Используя короткое имя объекта (его референс), метод работает, так как это один и тот же объект
        System.out.println(list.toString());//Метод показывает как выглядит объект класса ArrayList на экране в виде строки
        // Метод позволяет не пользоваться циклом for или foreach для вывода ArrayList
    }
}
