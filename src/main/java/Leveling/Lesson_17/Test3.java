package Leveling.Lesson_17;

public class Test3 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuffer sb2 = new StringBuffer("Good bye!");

        String s1 = new String(sb1);//В параметре конструктора String можно использовать StringBuilder
        String s2 = new String(sb2);//В параметре конструктора String можно использовать StringBuffer
        System.out.println(s1);
        System.out.println(s2);
    }
}
