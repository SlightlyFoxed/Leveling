package Leveling.Lesson_20_ArrayListMethods;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("all = " + al1);
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("one");
        al2.add("three");
        al2.add("four");
        //al2.add("ten");
        boolean result = al1.containsAll(al2);//Метод узнаёт содержит ли первый ArrayList все элементы второго ArrayList. Возвращает true или false
        System.out.println(result);

        List <String> sublist = al1.subList(1,4);//Метод создает отрывок ArrayList в виде List. в параметрах указываются индекс первого элемента,
        // с которого нужно чтобы начинался лист и индекс элемента каким лист будет заканчиваться. при этом последний элемент в листе отображен не будет
        System.out.println("sublist = " + sublist);//Сам sublist не существует отдельно от ArrayList.Он лишь является его представлением(view или взгляд в ArrayList)
        sublist.add("ten");
        System.out.println("all = " + al1);//Элемент добавился как ArrayList так и в sublist и он добавился на последнюю позицию sublist
        System.out.println("sublist = " + sublist);
        //Если провести подобную операцию но уже на ArrayList а затем вызвать вывод sublist, то будет ошибка ConcurrentModificationException
        al1.add("million");
        System.out.println("all = " + al1);//с самим ArrayList все нормально после добавления
        //System.out.println("sublist = " + sublist);//sublist же вызывает ошибку ConcurrentModificationException.
        //Потому что все структурные модификации в этом случае должны быть сделаны с помощью представления (view) ArrayList
        //Если делать структурные модификации над ArrayList напрямую и затем пытаться использовать представление sublist,то появится ошибка ConcurrentModificationException



    }
}
