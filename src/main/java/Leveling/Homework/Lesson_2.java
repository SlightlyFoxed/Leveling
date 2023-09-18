package Leveling.Homework;

public class Lesson_2 {
    public static void main(String[] args) {
        byte b1= 12;
        byte b2= 0b1100;
        byte b3= 014;
        byte b4= 0xC;

        short s1 = 1300;
        short s2 =0b010100010100;
        short s3 = 02424;
        short s4 = 0x514;

        int a1 = 0;
        int a2 = 0b0;
        int a3 = 00;
        int a4 = 0x0;

        long l1 = 123456789L;
        long l2 = 0b0111010110111100110100010101L;
        long l3 = 0726746425L;
        long l4 = 0x75BCD15L;


        System.out.println(b1+" "+ b2+" "+ b3+" "+ b4 + " " + s1+" "+ s2+" "+ s3+" "+ s4 +" "+ a1+" "+ a2+" "+ a3+" "+ a4 +" " + l1+" "+ l2+" "+ l3+" "+ l4);

        float f1 = 5.54f;
        float f2 = 2.2f;
        double d1 = 445.554;
        double d2 = 3.54d;
        boolean bu1 = true;
        boolean bu2 = false;
        System.out.println(f1+" "+ f2+" "+ d1+" "+ d2+" "+ bu1+" "+ bu2);
        char c1= 'b';
        char c2=2435;
        char c3 = '\u0983';
        char c4 = 56574;
        System.out.println(c1+" "+ c2+" "+ c3+" "+ c4);



    }
}
