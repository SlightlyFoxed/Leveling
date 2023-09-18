package Leveling.Lesson_27;

public class Test1 {
    public static void main(String[] args) {
        Animal an = new Tiger();
        System.out.println(an.a);//Compile time так как это переменные
        System.out.println(an.b);//Compile time так как это переменные
        an.abc();//Run time
        an.def();//Compile time так как метод статический
    }
}
class Animal {
    int a = 5;
    static int b = 10;
    void abc(){
        System.out.println("Non-static method iz classa Animal");
    }
    static void def(){
        System.out.println("Static method iz classa Animal");
    }
}
class Tiger extends Animal {
    int a = 15;
    static int b = 20;
    void abc(){
        System.out.println("Non-static method iz classa Tiger");
    }
    static void def(){
        System.out.println("Static method iz classa Tiger");
    }
}
