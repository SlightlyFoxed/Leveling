package Leveling.Lesson_3;

public class Test7 {
    public static void main(String[] args) {

        char c = 'a';
        int i = 10;
        int i1 = c;
        //short s = c;// выражение не возможно так как char не помещается по значениям в диапазон short а так же не может принимать отрицательных значений

        System.out.println(i + c);//так как каждому символу соответствует порядковый номер в юникоде, выражение равняется 10 + 97(а)
    }
}
