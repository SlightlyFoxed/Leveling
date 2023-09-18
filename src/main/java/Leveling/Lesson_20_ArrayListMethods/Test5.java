package Leveling.Lesson_20_ArrayListMethods;

import java.util.HashMap;
import java.util.Map;

public class Test5 {
    public static void main(String[] args) {
        //Map это не коллекция. Это пары. Пара ключа и значения key/value
        //Map реализует два класса: HashMap и TreeMap
        Map<Integer,String> map = new HashMap<>();
        map.put(777,"Ivanov Mikhail");//777 это ключ к значению "Ivanov Mikhail"
        map.put(778,"Tregulov Zaur");
        map.put(779,"Sidorova Maria");
        map.put(780,"Petrov Petr");
        map.put(779,"Roberto Carlos");//Если добавить на map элемент с уже использованным ключем, то значение к которому тот обращался будет перезаписано.
        //Дубликаты не поддерживаются с точки зрения ключа.
        map.put(781,"Tregulov Zaur");//При этом всегда можно добавить элемент на map с одинаковым значением, если ключ не использовался повторно
        //Дубликаты поддерживаются с точки зрения значения
        map.remove(779); //метод для удаления элемента из map
        System.out.println("map = " + map);
    }
}
