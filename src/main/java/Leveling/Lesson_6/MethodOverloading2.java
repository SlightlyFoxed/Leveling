package Leveling.Lesson_6;

public class MethodOverloading2 {//Return type перегруженных методов так же может быть разным. Он может как ничего не возвращать, так и наоборот
    //Access modifier так же может быть одинаковым или различным
    //Методы, отличающиеся ТОЛЬКО Return type или Access modifier не являются overloaded
    int sum (int i1, int i2){
        return i1 + i2;
    }

    String sum (String s1, String s2){
        return s1 + s2;
    }
}

class MethodOverloading2Test{
    public static void main(String[] args) {
        MethodOverloading2 mO2 = new MethodOverloading2();
        int a = mO2.sum(5,7);
        System.out.println(a);
        String s = mO2.sum("Hello"," My Friend");
        System.out.println(s);
    }
}
