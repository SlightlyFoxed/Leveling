package Leveling.Lesson_30;

import java.util.ArrayList;
//Parameterized class
public class GenericsTest {
    public static void main(String[] args) {
        Info <String> info1 = new Info<>("privet");
        System.out.println(info1);
        String s = info1.getValue();
        System.out.println(s);
        Info <Integer> info2 = new Info<>(100);
        System.out.println(info2);
        Integer i = info2.getValue();
        System.out.println(i);
    }
    public void abc (Info <String> info) {
        String s = info.getValue();
    }
    /*public void abc (Info <Integer> info) {//После type erasure параметры метода выглядят как (Info info), потому что информация о generics стирается
    // поэтому для overloaded методов дженерик класс не подходит
        Integer i = info.getValue();
    }*/
}

//<T>- это Type Placeholder (заполнитель типа). Он временно исполняет роль какого то типа данных, который потом будет заменен на существующий действительный тип
class Info <T> {//Благодаря такой записи, при создании объекта этого класса, можно подставить свой тип данных и он заменит <T>(Type Placeholder).
    private T value;//Переменная _value_ типа Т, который в дальнейшем может быть заменен на множество типов
    public Info (T value){
        this.value = value;
    }

    public String toString (){
        return "[{"+ value +"}]";
    }
    public T getValue () {
        return value;
    }
}
class Parent {
    public void abc (Info <String> info) {
        String s = info.getValue();
    }
}
class Child extends Parent {
    /*public void abc (Info <Integer> info) {//При кастинге в саб классе возникнут проблемы после type erasure, поэтому компилятор не позволит перезаписать метод
        Integer i = info.getValue();
    }*/
}