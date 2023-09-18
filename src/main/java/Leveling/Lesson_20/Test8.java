package Leveling.Lesson_20;
import java.util.Arrays;
import java.util.*;//Можно импортировать все классы
public class Test8 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        Object [] array1 = list1.toArray();//Метод переводит ArrayList toArray в Object [] массив
        for (Object o : array1) {//При создании массива его элементы будут ссылаться на те же объекты,на которые и ссылаются элементы ArrayList.Аналогично с клоном
            System.out.print(o+ " ");
        }
        System.out.println();
//Массиву StringBuilder присваивается массив StringBuilder, который создается из ArrayList с применением метода .toArray,
// в параметре которого указан этот StringBuilder массив (array2), в который будут добавлены элементы ArrayList
        StringBuilder [] array2 = list1.toArray(new StringBuilder[1]);//Метод переводит ArrayList toArray в массив того типа данных, который указан
        for (StringBuilder sb:array2){//Если указать в размере массива большее число, чем элементов в нем,
            // то в выводе будут отображены элементы, а оставшиеся места будут заполнены null
            System.out.print(sb + " ");//Если указать в размере массива меньшее число, чем элементов в нем,
            // то массив автоматически увеличит свой размер под количество элементов
        }
        System.out.println();
        System.out.println(array2.length);//При том что длина была указана 1 при создании массива, она увеличилась до количества элементов
        StringBuilder [] array = {sb2,sb3,sb3,sb3};
        List<StringBuilder> list8 = Arrays.asList(array);//метод asList вызывается с помощью класса Arrays, в параметрах указывается массив определенного типа,
        // на выходе получается List(список) этого же типа
        System.out.println(list8);//При этом List будет всегда той же длины что и массив.Он полностью связан с массивом
        // ЛЮБЫЕ изменения или замены объектов в массиве будут отображены в List, в отличие от методов .clone и .toArray
        array[0].append("!!!");
        System.out.println(list8);// ЛЮБЫЕ изменения или замены объектов в массиве будут отображены в List
        array[0] =new StringBuilder("!!!!");
        System.out.println(list8);// ЛЮБЫЕ изменения или замены объектов в массиве будут отображены в List
    }
}
