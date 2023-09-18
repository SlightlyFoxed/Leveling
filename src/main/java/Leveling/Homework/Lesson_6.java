package Leveling.Homework;

public class Lesson_6 {
    int sum (){
        return 0;
    }
    int sum (int a){
        return a;
    }
    int sum (int a,int b){
        return a + b;
    }
    int sum (int a,int b,int c){
        return sum(a, b) + c;
    }
    int sum (int a,int b,int c,int d){
        return sum(a,b,c) + d;
    }
}
class Lesson_6Test {
    public static void main(String[] args) {
        Lesson_6 lT = new Lesson_6();
        int a1 = lT.sum();
        System.out.println(a1);
        int a2 = lT.sum(10);
        System.out.println(a2);
        int a3 = lT.sum(13,15);
        System.out.println(a3);
        int a4 = lT.sum(11,28,35);
        System.out.println(a4);
        int a5 = lT.sum(4,6,9,7);
        System.out.println(a5);
    }
}
