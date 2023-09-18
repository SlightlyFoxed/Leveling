package Leveling.Lesson_20;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;//Для обращения к короткому имени импортируется класс Iterator
import java.util.ListIterator;
public class Test10 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);

        Iterator<String> it = list1.iterator();//Iterator это повторитель. С его помощью можно пройтись по каждому элементу ArrayList
        while (it.hasNext()){//Пока есть последующий элемент, тело будет выполняться
            System.out.println(it.next());
        }
        Iterator<String> it1 = list1.listIterator();//listIterator работает так же как Iterator
        while (it.hasNext()){ //В отличие от foreach, с помощью Iterator можно удалить элемент из ArrayList
            it1.next();//it1.next выдает элемент
            it1.remove();//it1.remove его удаляет
        }

    }
}