package Leveling.Lesson_20;
import java.util.ArrayList;//Чтобы использовать короткое имя, необходимо импортировать класс ArrayList
import java.util.List;
public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();//Создан объект типа ArrayList. В него можно добавлять любые элементы любых типов данных, кроме примитивных
        list.add("privet");//метод .add позволяет добавить в объект любой элемент. В данном случае String
        Car c = new Car();
        list.add(c);//Добавляю объект класса Car
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("ok"));//добавлен StringBuilder
        //В ArrayList можно добавлять различные типы данных потому, что в его основе находится массив типа данных Object

        ArrayList <String> list2 = new ArrayList<String>();//В ArrayList можно поставить ограничение на тип данных, которые можно в него добавлять
        ArrayList<String> list5 = new ArrayList<>(list2);//В параметры так же можно записать другой ArrayList
        System.out.println(list2 == list5);//При этом они будут ссылаться на разные объекты, а не на тот же ArrayList.и потому их равенство будет возвращать false
        list2.add("poka");
        ArrayList <StringBuilder> list3 = new ArrayList<>(50);//в параметры ArrayList можно записать его вместимость. При заполнении будет увеличиваться.
        List <StringBuilder> list4 = new ArrayList<>();//Эта запись так же корректна. Для ее использования необходимо импортировать класс List
        list4.add(new StringBuilder("ok"));
        //size это реальный размер ArrayList а capacity это возможность вместить элементы

    }
}
class Car{}
class Student{}