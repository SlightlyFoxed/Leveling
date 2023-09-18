package Leveling.Lesson_28;

import java.time.*;

public class Test5 {
    static void smenaDejurnogo (LocalDate nachalo, LocalDate konec, Period p){//nachalo-начало учебного года, konec-конец учебного года.
        // Period - период через который будет меняться дежурный
        LocalDate data = nachalo;
        while (data.isBefore(konec)){//Пока дата раньше чем наступил конец учебного года, дежурный меняется через равный период времени
            System.out.println("Nastupila data " + data + ". Pora menyat dejurnogo");
            data = data.plus(p);// к дате прибавляется период через который будет меняться дежурный
        }
    }

    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2022,Month.SEPTEMBER,1);
        LocalDate konec = LocalDate.of(2023,Month.MAY,31);
        Period p = Period.ofWeeks(2);
        smenaDejurnogo(nachalo,konec,p);
    }
    //Класс Period имеет конструктор с access modifier private. Методы of возвращают объект типа Period
    //public static Period.ofDays
    //public static Period.ofWeeks
    //public static Period.ofMonth
    //public static Period.ofYears
    //public static Period.of(Years,Month,Days)
    //Методы plus и minus могут быть использованы для прибавления и отнимания периодов к/от объектов класса LocalDate LocalDateTime.
    // При попытке использования методов plus или minus для сложения или отнимания периода к/от объекта класса LocalTime будет выброшен Exception
    // А именно UnsupportedTemporalTypeException
    //При создании объекта класса Period не работает method chaining метода of. При попытке method chaining только последний метод of имеет значение
}
