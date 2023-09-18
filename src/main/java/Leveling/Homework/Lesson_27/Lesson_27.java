package Leveling.Homework.Lesson_27;

import java.io.*;

public class Lesson_27 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("myaso");
        try {
            t.drink("voda");
            try {
                t.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto finally block");
            }
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class Tiger {
    void eat(String eda) {
        if (!eda.equals("myaso")) {
            throw new NeMyasoExceprion("Tigr ne est " + eda);
        }
            System.out.println("Tigr est " + eda);
    }
    void drink(String jidkost) throws NeVodaException {
        if (!jidkost.equals("voda")) {
            throw new NeVodaException("Tigr ne pyet " + jidkost);
        }
            System.out.println("Tigr pyet vodu");
    }
}
class NeMyasoExceprion extends RuntimeException {
    NeMyasoExceprion(String message) {
        super(message);
    }
}
class NeVodaException extends Exception {
    NeVodaException(String message) {
        super(message);
    }
}
