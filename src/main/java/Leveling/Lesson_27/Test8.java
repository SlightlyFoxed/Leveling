package Leveling.Lesson_27;
import java.io.*;
public class Test8 {

    public static void main(String[] args) {
        try {
            File f = new File("test8");
            FileInputStream fis = new FileInputStream(f);
        }
        catch (FileNotFoundException e){
            System.out.println("Poyman exception 1");
        }
        catch (NullPointerException e){ //FileNotFoundException и NullPointerException не имеют никакой IS-A связи, а потому очередность не важна
            System.out.println("Poyman exception 2");
        }
        catch (IOException e){//супер класс для FileNotFoundException. Если catch родительского класса будет находиться выше дочернего, то компилятор выдаст ошибку,
            // так как catch дочернего ловить будет нечего и он никогда не сработает
            System.out.println("Poyman exception 3");
        }
        catch (RuntimeException e){// супер класс для NullPointerException
            System.out.println("Poyman exception 4");
        }
        catch (Exception e){//супер класс для IOException и RuntimeException
            System.out.println("Poyman exception 5");
        }
        catch (Throwable e){//супер класс для Exception
            System.out.println("Poyman exception 6");
        }
    }
}
