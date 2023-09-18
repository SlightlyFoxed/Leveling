package Leveling.Homework.p4;
import Leveling.Homework.p1.A;
import Leveling.Homework.p1.p2.B;
import Leveling.Homework.p1.p2.p3.C;
import Leveling.Homework.p4.p5.E;

public class D {
    A a1 = new A();
    C c1 = new C();
    E e1 = new E();
    public int sum (){
        return a1.ab +a1.ac + B.a + B.b +c1.c+e1.x;
    }

    public static void main(String[] args) {
        D d1 = new D();
        System.out.println(d1.sum());


        }
    }

