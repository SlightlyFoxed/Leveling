package Leveling.Lesson_28;
import java.time.*;

public class Test8 {
    //Получение информации из классов LocalDate, LocalDateTime, LocalTime
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2022,Month.SEPTEMBER,1);
        LocalDateTime ldt = LocalDateTime.of(2022,Month.SEPTEMBER,1,10,30,26);
        System.out.println(ld.getDayOfWeek());// метод getDayOfWeek возвращает имя дня недели.Метод применяется к LocalDate и LocalDateTime
        System.out.println(ld.getDayOfMonth());//метод getDayOfMonth возвращает номер дня месяца.Метод применяется к LocalDate и LocalDateTime
        System.out.println(ld.getDayOfYear());//метод getDayOfYear возвращает номер дня года.Метод применяется к LocalDate и LocalDateTime
        System.out.println(ld.getMonth());//метод getMonth возвращает имя месяца(enum типа Month).Метод применяется к LocalDate и LocalDateTime
        System.out.println(ld.getMonthValue());//метод getMonthValue возвращает номер месяца.Метод применяется к LocalDate и LocalDateTime
        System.out.println(ld.getYear());//метод getYear возвращает год.Метод применяется к LocalDate и LocalDateTime
        System.out.println();
        LocalTime lt = LocalTime.of(16,40);
        System.out.println(lt.getNano());//метод getNano возвращает наносекунды. Метод применяется к LocalTime и LocalDateTime
        System.out.println(lt.getSecond());//метод getSecond возвращает секунды. Метод применяется к LocalTime и LocalDateTime
        System.out.println(lt.getMinute());//метод getMinute возвращает минуты. Метод применяется к LocalTime и LocalDateTime
        System.out.println(lt.getHour());//метод getHour возвращает часы. Метод применяется к LocalTime и LocalDateTime

        //С помощью метода format можно изменять вывод даты или времени на экран

    }
}
