package Leveling.Lesson_28;

import java.time.*;

public class Test3 {
    //ОБЪЕКТЫ ДАННЫХ ТРЕХ КЛАССОВ ЯВЛЯЮТСЯ IMMUTABLE
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2022,5,23);
        System.out.println(ld1);
        System.out.println();
        ld1 = ld1.plusDays(9);//plusDays прибавляет дни. Так как объекты этих классов immutable, необходимо либо обновлять значение переменной,
        // либо присваивать это значение новой переменной LocalDate ld2 = ld1.plusDays(5);. В противном случае значение переменной останется тем же
        System.out.println(ld1);
        System.out.println();
        ld1 = ld1.minusDays(2);//minusDays отнимает дни
        System.out.println(ld1);
        System.out.println();
        ld1 = ld1.plusWeeks(3);//plusWeeks прибавляет недели
        ld1 = ld1.minusWeeks(2);//minusWeeks отнимает недели
        ld1 = ld1.plusMonths(4);//plusMonths прибавляет месяцы
        ld1 = ld1.minusMonths(1);//minusMonths отнимает месяцы
        ld1 = ld1.plusYears(6);//plusYears прибавляет годы
        ld1 = ld1.minusYears(14);//minusYears отнимает годы


        LocalTime lt1 = LocalTime.of(15,30,14,878488875);
        System.out.println(lt1);
        lt1 = lt1.plusHours(4);//прибавляет часы
        lt1 = lt1.minusHours(8);//отнимает часы
        lt1 = lt1.plusMinutes(15);//прибавляет минуты
        lt1 = lt1.minusMinutes(25);//отнимает минуты
        lt1 = lt1.plusSeconds(26);//прибавляет секунды
        lt1 = lt1.minusSeconds(12);//отнимает секунды
        lt1 = lt1.plusNanos(878499455);//прибавляет наносекунды
        lt1 = lt1.minusNanos(878488875);//отнимает наносекунды
        System.out.println(lt1);
        //Все эти методы можно использовать с помощью method chaining
        lt1 = lt1.plusHours(4).plusMinutes(15).plusSeconds(26);
        System.out.println(lt1);
        System.out.println();
//Методы LocalDateTime охватывают методы LocalDate и LocalTime и в оутпуте возвращают LocalDateTime
        LocalDateTime ldt1 = LocalDateTime.of(2022,6,21,23,59);
        System.out.println(ldt1);
        ldt1 = ldt1.plusYears(4).minusMonths(8).plusMinutes(180000);
        System.out.println(ldt1);

    }
}
