package Leveling.Lesson_26;

public class Test7 {
    public static void main(String[] args) {
        //Animal a = new Animal();//Сработают все инициализаторы и конструктор класса Animal
        Lion l = new Lion();//Сработают все инициализаторы и конструкторы всех классов родителей
        //Сначала срабатывают все статические инициализаторы каждого класса, затем не статический и конструктор для каждого класса
    }
}
class Animal {
    Animal () {System.out.println("Constructor of Animal");}
    static {System.out.println("Static init in Animal");}
    {System.out.println("Non-static init in Animal");}
}
class Mammal extends Animal {
    Mammal () {System.out.println("Constructor of Mammal");}
    static {System.out.println("Static init in Mammal");}
    {System.out.println("Non-static init in Mammal");}
}
class Lion extends Mammal {
    Lion () {System.out.println("Constructor of Lion");}
    static {System.out.println("Static init in Lion");}
    {System.out.println("Non-static init in Lion");}
}

