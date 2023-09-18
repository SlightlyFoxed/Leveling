package Leveling.Homework;

public class Lesson_17 {
    public static boolean ravenstvo (StringBuilder sb1, StringBuilder sb2){
        char c1;
        char c2;
        if (sb1.length() == sb2.length()){
            for (int i = 0; i< sb1.length();i++){
                if (sb1.charAt(i) == sb2.charAt(i)){
                    System.out.println("Значения объектов совпадают");
                    return true;
                }return false;
            }
        }return false;
    }

    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("Hello everyone!");
        StringBuilder sb4 = new StringBuilder("Hello everyone!");
        StringBuilder sb5 = new StringBuilder("hello everyone!");
        StringBuilder sb6 = new StringBuilder("Hello everyone");

        System.out.println(ravenstvo(sb3,sb4));
        System.out.println(ravenstvo(sb5,sb6));
    }
}
