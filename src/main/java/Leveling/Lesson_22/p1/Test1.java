package Leveling.Lesson_22.p1;
import Leveling.Lesson_22.Chelovek;
public class Test1 {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName(new StringBuilder("Kolya")); //Благодаря public методам можно работать с private переменными даже из другого класса
        c.setVes(50);
        c.setVozrast(15);
        System.out.println(c.getName());
        System.out.println(c.getVozrast());
        System.out.println(c.getVes());
    }
}
