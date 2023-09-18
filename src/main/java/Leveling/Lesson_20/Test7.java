package Leveling.Lesson_20;
import java.util.ArrayList;
public class Test7 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList <StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        ArrayList <StringBuilder> list3 = list1;
        ArrayList <StringBuilder> list2 =(ArrayList <StringBuilder>)list1.clone();//Метод клонирует другой ArrayList.
        // При этом ЭЛЕМЕНТЫ этих ArrayList-ов будут ссылаться на одни и те же объекты
        System.out.println(list1.get(0) == list2.get(0));//true, так как элементы ссылаются на одни и те же объекты
        System.out.println(list2 == list1);//false, так как list2 который равен клонированию list1 и list1 ссылаются на разные объекты
        System.out.println(list3 == list1);//true, так как list3 и list1 ссылаются на один и тот же объект
        // При этом они будут ссылаться на одни и те же объекты
        list1.get(0).append("!!!");//При изменении значения элемента, изменения отобразятся в обоих ArrayList-ах
        list1.set(0,new StringBuilder("D"));//Но при ЗАМЕНЕ элемента, другой ArrayList изменений не примет и будет так же ссылаться на свой объект
        System.out.println(list2.get(0));

    }
}
