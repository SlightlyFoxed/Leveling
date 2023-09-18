package Leveling.Homework.Lesson_24;

public class Lesson_24 {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("Larry");
        System.out.println(m.name);
        m.swim();
        m.sleep();
        m.eat();
        Speakable s = new Pingvin("Prapor");
        s.speak();
        Animal a = new Lev("Leva");
        System.out.println(a.name);
        a.sleep();
        a.eat();
        Mammal mam = new Lev("Leva2");
        System.out.println(mam.name);
        mam.run();
        mam.sleep();
        mam.eat();
        mam.speak();
    }
}
abstract class Animal {
    String name;
    Animal (String name) {
        this.name = name;
    }
    abstract void eat();
    abstract void sleep ();
}
abstract class Fish extends Animal {
    String name;
    Fish (String name) {
        super(name);
        this.name = name;
    }
    public void sleep () {
        System.out.println("Всегда интересно наблюдать как спят рыбы");
    }
    abstract void swim();
}
abstract class Bird extends Animal implements Speakable{
    Bird (String name) {
        super(name);
        this.name = name;
    }
    abstract void fly ();
    public void speak () {
        System.out.println(name + "sings");
    }
}
abstract class Mammal extends Animal implements Speakable{
    Mammal (String name) {
        super(name);
        this.name = name;
    }
    abstract void run ();
}
interface Speakable {
    default void speak(){
        System.out.println("Somebody speaks");
    }
}
class Mechenosec extends Fish {
    Mechenosec (String name) {
        super(name);
        this.name = name;
    }
    public void swim () {
        System.out.println("Меченосец красивая рыба, которая быстро плавает");
    }
    public void eat () {
        System.out.println("Меченосец не хищная рыба, и она есть обычный рыбий корм!");
    }
}
class Pingvin extends Bird {
    Pingvin (String name) {
        super(name);
        this.name = name;
    }
    public void eat () {
        System.out.println("Пингвин любит есть рыбу!");
    }
    public void sleep () {
        System.out.println("Пингвины спят прижавшись друг к другу!");
    }
    public void fly () {
        System.out.println("Пингвины не умеют летать!");
    }
    public void speak () {
        System.out.println("Пингвины не умеют петь как соловьи");
    }
}
class Lev extends Mammal {
    Lev (String name) {
        super(name);
        this.name = name;
    }
    public void eat () {
        System.out.println("Лев, как любой хищник, любит мясо!");
    }
    public void sleep () {
        System.out.println("Большую часть дня, лев спит!");
    }
    public void run () {
        System.out.println("Лев-это не самая быстрая кошка!");
    }
}
