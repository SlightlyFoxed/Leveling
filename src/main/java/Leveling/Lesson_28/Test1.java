package Leveling.Lesson_28;
import java.time.*;
public class Test1 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());//Текущая дата
        System.out.println(LocalTime.now());//Текущее время
        System.out.println(LocalDateTime.now());//Текущие дата и время
        System.out.println();

        //Объекты этих трех классов создать с помощью конструктора невозможно, так как конструктор у них имеет access modifier private.
        // Для этого есть метод of, который возвращает объект соответствующего типа.
        LocalDate ld1 = LocalDate.of(2022,5,23);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2022,Month.MAY,23);//Вместо численного показателя месяца можно выбрать с помощью Enumeration константу месяца
        System.out.println(ld2);
        LocalTime lt1 = LocalTime.of(15,30);
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.of(15,30,58);
        System.out.println(lt2);
        LocalTime lt3 = LocalTime.of(15,30,47,225448842);
        System.out.println(lt3);
        LocalDateTime ldt1 = LocalDateTime.of(2022,6,21,23,59);
        System.out.println(ldt1);
        LocalDateTime ldt2 = LocalDateTime.of(2022,Month.APRIL,21,23,59,59);
        System.out.println(ldt2);
        LocalDateTime ldt3 = LocalDateTime.of(2022,Month.APRIL,21,23,59,59,225448842);
        System.out.println(ldt3);
        LocalDateTime ldt4 = LocalDateTime.of(ld2,lt2);
        System.out.println(ldt4);
        //При некорректном указании параметров метода of, выбрасывается соответствующий exception. DateTimeException с указанием проблемы в месседже

    }
}
