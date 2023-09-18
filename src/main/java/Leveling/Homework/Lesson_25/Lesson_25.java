package Leveling.Homework.Lesson_25;

public class Lesson_25 {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("Bob");
        Animal a2 = new Pingvin("Bobby");
        Animal a3 = new Lev("Leva");
        Speakable s1 = new Lev("Levka");
        Speakable s2 = new Pingvin("Prapor");
        Bird b1 = new Pingvin("Kovalsky");
        Fish f1 = new Mechenosec("Kekw");
        Mechenosec m = new Mechenosec("Larry");
        Mammal mam = new Lev("Koshka");
        Lev l1 = new Lev("Kisa");
        Pingvin p1 = new Pingvin("Hlopa");

        Speakable[] array1 = {s1,s2,b1,mam,l1,p1};
        for (Speakable s : array1){
            if (s instanceof Lev){
                Lev l = (Lev)s;
                System.out.println(l.name);
                l.speak();
                l.eat();
                l.run();
                l.sleep();
            }else if(s instanceof Pingvin){
                Pingvin p = (Pingvin)s;
                System.out.println(p.name);
                p.speak();
                p.sleep();
                p.eat();
                p.fly();
            }
            System.out.println("*******");
        }
        System.out.println();
        Animal [] array2 = {a1,a2,a3,b1,f1,m,mam,l1,p1};
        for (Animal a:array2){
            if (a instanceof Mechenosec){
                Mechenosec m1 = (Mechenosec)a;
                System.out.println(m1.name);
                m1.eat();
                m1.sleep();
                m1.swim();
            } else if (a instanceof Pingvin) {
                Pingvin p = (Pingvin)a;
                System.out.println(p.name);
                p.sleep();
                p.eat();
                p.fly();
                p.speak();
            }else if (a instanceof Lev){
                Lev l = (Lev)a;
                System.out.println(l.name);
                l.speak();
                l.eat();
                l.sleep();
                l.run();
            }
            System.out.println("*******");
        }
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
abstract class Bird extends Animal implements Speakable {
    Bird (String name) {
        super(name);
        this.name = name;
    }
    abstract void fly ();
    public void speak () {
        System.out.println(name + "sings");
    }
}
abstract class Mammal extends Animal implements Speakable {
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
