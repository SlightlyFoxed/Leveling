package Leveling.Lesson_6;

public class MethodOverloading {
    // Перегруженные методы имеют одинаковые имена и разный список параметров
    //Разный по типам данных.
    //Разный по количеству.
    //Разный по порядку
    void show(int i1){//чтобы не создавать методы с разным названием для каждого типа данных, можно назвать их одним именем и использовать в дальнейшем без привязки к типу данных
        System.out.println(i1);//Компилятор будет автоматически сравнивать методы по количеству и типу данных принимаемых методом
    }

    void show(int a, int b){
        System.out.println(a);
    }
    void show (boolean b1){
        System.out.println(b1);
    }
    void show (String s1){
        System.out.println(s1);
    }
    void show (String s2,int a){
        System.out.println(s2 + " " + a);
    }
    void show (int a,String s2){
        System.out.println("bye");
    }
}


class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        mO.show(a);
        boolean b =true;
        mO.show(b);
        String s = "Hello";
        mO.show(s);
        String s2 = "hi";
        mO.show("yes",10);
        mO.show(10,"hi");
    }
}