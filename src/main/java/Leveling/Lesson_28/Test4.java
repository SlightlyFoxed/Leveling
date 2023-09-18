package Leveling.Lesson_28;
import java.time.*;
public class Test4 {
    public static void main(String[] args) {
        //Методы isAfter и isBefore могут быть использованы для сравнения объектов классов LocalDate, LocalTime и LocalDateTime. Данные методы возвращают boolean.
        //Компилятор разрешает сравнивать только объекты соответствующих классов


        LocalDate ld1 = LocalDate.of(2022, 5, 23);
        LocalDate ld2 = LocalDate.of(2021, 6, 28);
        System.out.println(ld1.isAfter(ld2));//Метод дает ответ на вопрос - дата ld1 была после ld2? .Возвращает true или false
        System.out.println(ld1.isBefore(ld2));//Метод дает ответ на вопрос - дата ld1 была до ld2?


        LocalTime lt1 = LocalTime.of(15, 30);
        LocalTime lt2 = LocalTime.of(3, 5, 18, 55598);
        System.out.println(lt1.isAfter(lt2));
        System.out.println(lt1.isBefore(lt2));


        LocalDateTime ldt1 = LocalDateTime.of(2022, Month.SEPTEMBER, 21, 23, 59);
        LocalDateTime ldt2 = LocalDateTime.of(2022, Month.SEPTEMBER, 21, 23, 59, 9);
        System.out.println(ldt1.isAfter(ldt2));
        System.out.println(ldt1.isBefore(ldt2));
    }
}
