package Leveling.Lesson_28;
import java.time.*;
public class Test7 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2022,Month.SEPTEMBER,1,10,30,26);
        LocalTime lt = LocalTime.of(10,30);
        Duration d = Duration.ofMinutes(3);//Класс Duration предназначен для работы с LocalTime и LocalDateTime, объектами у которых есть временная часть.
        //Даже если применить метод Duration.ofDays к LocalDate это вызовет Exception. UnsupportedTemporalTypeException
        System.out.println(lt.plus(d));//метод Duration.ofDays можно применить к LocalTime,
        // но так как он содержит информацию только о времени, дни прибавятся, но время останется прежним
        Period p = Period.ofMonths(3);
        Duration d2 = Duration.ofDays(10);
        Duration d3 = Duration.ofHours(5);
        Duration d4 = Duration.ofMinutes(15);
        Duration d5 = Duration.ofSeconds(24);
        Duration d6 = Duration.ofMillis(3365);
        Duration d7 = Duration.ofNanos(3885448);
        System.out.println(ldt.plus(p).plus(d3));//в LocalDateTime можно использовать как Period так и Duration
        //Методы plus и minus могут быть использованы для прибавления и отнимания объекта класса Duration к/от объектов класса LocalTime LocalDateTime.
        //При попытке использования методов plus или minus для сложения или отнимания объекта класса Duration к/от объекта класса LocalDate будет выброшен Exception
        //При создании объекта класса Duration не работает method chaining метода of. При попытке method chaining только последний метод of имеет значение

    }
}
