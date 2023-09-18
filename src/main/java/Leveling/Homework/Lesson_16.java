package Leveling.Homework;

public class Lesson_16 {
    public static void mail (String s){
        char c1;
        for (int i = 0; i < s.length();i++){
            c1 = s.charAt(i);
            if (c1 ==';'){
                int i1 = s.indexOf('@');
                int i2 = s.indexOf('.');
                String s1 = s.substring(i1+1,i2);
                System.out.println(s1);
                i = s.indexOf(';',i+1);
                int i3 = s.indexOf('@',i1+1);
                int i4 = s.indexOf('.',i2+1);
                String s2 = s.substring(i3+1,i4);
                System.out.println(s2);
                i = s.indexOf(';',i+1);
                int i5 = s.indexOf('@',i3+1);
                int i6 = s.indexOf('.',i4+1);
                String s3 = s.substring(i5+1,i6);
                System.out.println(s3);
                break;

            }

        }


    }
    public static void main(String[] args) {
        mail("ya@yahoo.com; on@mail.ru; ona@gmail.com");

    }
}
