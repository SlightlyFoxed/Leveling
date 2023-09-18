package Leveling.Lesson_20_ArrayListMethods;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList <String> al1 = new ArrayList<>();//<String>(дженерики) в ArrayList необходимо указывать, так как это ТИПОБЕЗОПАСНОСТЬ.
        //Типобезопасность не позволит допустить попадание других типов данных в ArrayList, и компилятор сразу укажет на это
        //Когда дженерики не используются, то работа идет с raw type, так как неизвестно какой тип данных содержит коллекция
        //al1.add(new Test4());
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        for (Object o: al1){
            System.out.println("Number = "+ o + " and length = " + ((String)o).length());
        }
    }
}
