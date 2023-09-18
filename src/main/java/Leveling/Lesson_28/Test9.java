package Leveling.Lesson_28;
import java.time.*;
import java.time.format.*;//Класс DateTimeFormatter для более легкой работы со всеми тремя классами
//С помощью метода format можно изменять вывод даты или времени на экран

public class Test9 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2022, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2022, Month.SEPTEMBER, 1, 10, 30, 26);
        LocalTime lt = LocalTime.of(16,40);
        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;//Класс нужен для форматирования объекта под определенный шаблон.
        // ISO_.... это константы, которые определяют формат
        System.out.println(ld);
        System.out.println(ld.format(d1));
        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(lt);
        System.out.println(lt.format(d2));
        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(ldt);
        System.out.println(ldt.format(d3));
        System.out.println(ldt.format(d1));//LocalDateTime можно использовать с formatter с константами ISO_LOCAL_DATE и ISO_LOCAL_TIME
        System.out.println(ldt.format(d2));//метод форматирует LocalDateTime под время
        System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_TIME));//Аналогичная запись строки выше, но без переменной
    }
}
