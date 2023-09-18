package Leveling.Lesson_28;
import java.time.*;
public class Test6 {
    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2022,Month.SEPTEMBER,1);
        //Period p = Period.ofMonths(1).ofDays(10);
        //При создании объекта класса Period не работает method chaining метода of. При попытке method chaining только последний метод of имеет значение
        Period p = Period.ofMonths(3);//Происходит то же самое, что и при method chaining
        p = Period.ofDays(10);
        System.out.println(nachalo.plus(p));
    }
}
