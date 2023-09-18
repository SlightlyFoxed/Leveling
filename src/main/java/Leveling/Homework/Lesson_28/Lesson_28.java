package Leveling.Homework.Lesson_28;

import java.time.*;
import java.time.format.*;

public class Lesson_28 {
     DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM-d !! hh:mm");
     DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

     public void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {
        LocalDateTime graf = ldt1;
        do {
            System.out.print("Работаем с: " + graf.format(f1));
            graf = graf.plus(p);
            System.out.println("  До: " + graf.format(f1));
            System.out.println();
            System.out.print("Отдыхаем с: " + graf.format(f2));
            graf = graf.plus(d);
            System.out.println("  До: " + graf.format(f2));
            System.out.println("////////////////");

        } while (graf.isBefore(ldt2));
    }

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2016, Month.JANUARY, 1, 9, 0,0);
        LocalDateTime ldt2 = LocalDateTime.of(2016, Month.OCTOBER, 31, 18, 0,0);
        Period p = Period.of(0,1,2);
        Duration d = Duration.ofHours(48);
        Duration d1 = Duration.ofMinutes(600);
        Lesson_28 t = new Lesson_28();
        t.smena(ldt1,ldt2,p,d1);

    }
}
