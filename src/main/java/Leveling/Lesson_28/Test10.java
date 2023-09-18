package Leveling.Lesson_28;
import java.time.*;
import java.time.format.*;
public class Test10 {
    //Методы класса DateTimeFormatter ofLocalizedDate, ofLocalizedTime и ofLocalizedDateTime должны создавать формат,
    // который будет применяться для соответствующих классов
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2022, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2022, Month.SEPTEMBER, 1, 10, 30, 26);
        LocalTime lt = LocalTime.of(16, 40,55);
        DateTimeFormatter d1 = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(ld);
        System.out.println(ld.format(d1));//Выводит дату в формате год-номер недели в году(35-я неделя в году)-номер дня недели(4-й день недели)
        System.out.println();

        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        //ofLocalizedDate-статический метод в параметре которого указывается константа Enumeration
        //По сути создан формат для даты, который будет предоставлять дату в кратком виде
        System.out.println(ld);
        System.out.println(ld.format(shortFormat));
        DateTimeFormatter shortFormat1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(lt);
        System.out.println(lt.format(shortFormat1));
        System.out.println();
        DateTimeFormatter shortFormat2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(ldt);
        System.out.println(ldt.format(shortFormat2));
        //Метод format имеется не только у объектов классов LocalDate, LocalTime, LocalDateTime, но и у класса DateTimeFormatter,
        // что делает возможным написание последнего выражения в следующем виде:
        System.out.println(shortFormat2.format(ldt));// Результат будет таким же, как у System.out.println(ldt.format(shortFormat2));



    }
}
