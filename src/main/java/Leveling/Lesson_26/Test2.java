package Leveling.Lesson_26;
import java.util.ArrayList;
public class Test2 {
    //Autoboxing это конвертирование примитивных типов данных в соответствующий wrapper класс
    //Unboxing это конвертирование объекта типа wrapper класс в соответствующий примитивный тип данных
    //Метод parse позволяет конвертировать подходящее значение типа данных String в соответствующий примитивный тип данных
    //Метод valueOf позволяет создавать новый объект wrapper класса того типа, на котором данный метод был вызван
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();//Autoboxing это автоматический процесс конвертирования примитивного типа данных в референсный тип данных
        list.add(5);
        int a = list.get(0);//Процесс Unboxing
        System.out.println(a);
        Number b = new Integer(10);//Класс Number является супер классом для численных wrapper классов
        int c = (int) b;//Используя класс Number, потребуется casting

        String s1 = "50";//Если значение String будет неправильного формата, например " 50" то выйдет ошибка NumberFormatException. Пробелов быть не должно.
        String s2 = "true";//Любое другое значение помимо "true", например - "dfhstrue" он будет воспринимать как false
        String s3 = "3.14";
        int i1 = Integer.parseInt(s1);//Метод parse относится ко всем wrapper классам и является static.поэтому вызвать его можно и не создавая объект wrapper класса
        boolean b1 = Boolean.parseBoolean(s2);
        double d = Double.parseDouble(s3);
        System.out.println(b1);
        System.out.println(i1);
        System.out.println(d);
        System.out.println();
        Integer i3 = Integer.valueOf(10);
        Double d2 = Double.valueOf(s3);//Метод valueOf может принимать в себя различные параметры, в том числе String. Главное чтобы значение было подходящим
        System.out.println(i3);
        System.out.println(d2);


        Long l = 50l;//Создан объект класса Long, с помощью Autoboxing. 50l конвертируется в референс тип Long
    }
}
