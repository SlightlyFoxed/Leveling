package Leveling.Lesson_2;

public class ScaleOfNotation {
    public static void main(String[] args) {
        int a1 = 60;// десятеричная система счисления
        int a2 = 0B111100;// для того чтобы записать число в двоичной системе необходимо перед значением поставить 0B или 0b
        int a3 = 0b111100;
        int a4 = 074;// восьмеричная система.необходимо писать с нуля
        int a5 = 0x3c;//шестнадцатеричная система. писать с 0X
        int a6 = 0x3C;
        //underscore "_" нельзя использовать в начале и конце, так же до и после точки в дробных числах, до и после L,l,D,d,F,f, до после и между 0X,0x,0B,0b,
        System.out.println(a2);
    }
}
