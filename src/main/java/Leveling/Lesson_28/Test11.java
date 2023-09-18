package Leveling.Lesson_28;
import java.time.*;
import java.time.format.*;
public class Test11 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2022, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2022, Month.SEPTEMBER, 1, 10, 30, 26);
        LocalTime lt = LocalTime.of(16, 40, 55);
//С помощью метода ofPattern можно создавать свой формат
        DateTimeFormatter f = DateTimeFormatter.ofPattern("d MMMM, yyyy, hh:mm");//создание своего шаблона для DateTimeFormatter
        System.out.println(ldt);
        System.out.println(ldt.format(f));
        //У объектов классов LocalDate, LocalTime, LocalDateTime нужно пытаться брать ту информацию, которую они могут содержать.
        // В противном случае будет выбрасываться исключение


        //Метод parse переводит String в объект классов LocalDate, LocalTime и LocalDateTime
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date1 = LocalDate.parse("01 02 2022",f1);//By
        System.out.println(date1);
        LocalDate date2 = LocalDate.parse("2022-01-02");
        System.out.println(date2);
        //Если String объект соответствует формату даты или времени по умолчанию, то можно не использовать 2-ой параметр метода parse- шаблон.
        // Если не соответствует или не известен формат по умолчанию, то лучше использовать шаблон


    }
}
