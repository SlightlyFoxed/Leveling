package Leveling.Lesson_20;
import java.util.ArrayList;
public class Test2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("poka");//метод .add позволяет добавить в объект любой элемент. В данном случае String
        list.add("privet");
        list.add("ok");
        list.add(1,"hello");//Можно указать на какой индекс добавить элемент. Следующие элементы сместятся по индексу на 1.
        //list.add(5,"ok");//Если указать индекс, превосходящий размер ArrayList, будет ошибка IndexOutOfBoundException с указанием индекса и размера.
        for (String s: list){
            System.out.print(s +" ");
        }
        System.out.println();
        System.out.println(list.get(3));//Метод возвращает элемент ArrayList на указанном индексе такого же типа данных как и ArrayList
        for (int i = 0; i<list.size();i++){//С помощью этого метода и классического for можно вывести все элементы ArrayList
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list.set(1,"!!!");// Заменяет на указанном индексе элемент на указанный в параметре.работает как метод .replace
        for (String s: list) {
            System.out.print(s + " ");
        }
        System.out.println();
        list.remove("poka");//Метод позволяет удалить объект сравнивая его значение с помощью .equals из ArrayList.В output будет true если объект успешно удален
        for (String s: list) {//даже если в параметре будет запись list.remove(new String ("poka")),результат будет тем же, потому что объекты сравниваются по содержанию
            System.out.print(s + " ");//Когда объект удаляется, индексы объектов стоящих после него смещаются на 1 в начало
        }
        System.out.println();
        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("Sidorov");
        list.addAll(list2);//Метод позволяет добавить объекты в конец из другого ArrayList такого же типа данных
        for (String s: list) {
            System.out.print(s + " ");
        }
        System.out.println();
        list.addAll(1,list2);//Можно указать на какой индекс начнут добавляться элементы другого ArrayList
        for (String s: list) {
            System.out.print(s + " ");
        }
        System.out.println();

        list2.set(1,"Ivanov");//Если начать изменять элемент ArrayList list2, то в ArrayList list не изменится значение элемента,
        // так как по прежнему ArrayList list будет ссылаться на старый объект
        for (String s: list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
