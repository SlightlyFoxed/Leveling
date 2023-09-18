package Leveling.Homework;
import java.util.ArrayList;
import java.util.Collections;
public class Lesson_20 {
    public static ArrayList<String> abc (String ... s){

        ArrayList<String> list = new ArrayList <> ();
        for(int i = 0;i<s.length;i++){
            if (!list.contains(s[i])) {//Если элемент с таким же значением уже присутствует в ArrayList, то он не добавляется
                list.add(s[i]);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        abc("C","D","A","B","A");
    }
}
