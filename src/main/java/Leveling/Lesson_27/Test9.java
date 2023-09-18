package Leveling.Lesson_27;
import java.io.*;
public class Test9 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("test9.txt");
            System.out.println("Obyekt File sozdalsya");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream sozdalsya");
            int counter =0;
            while (true){
                counter++;
                result.append(fis.read());//Как только counter достигнет 3 ,стрим закрывается и применяемый метод fis.read на закрытый стрим выбросит IOException
                System.out.println("Informacia chitaetsya");
            if (counter == 3){
            fis.close();}
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Exception 1");
        }
        catch (IOException e){//На самом деле можно было оставить только этот catch,так как IOException супер класс для FileNotFoundException
            // и все работало бы так же, но всегда, в случае с исключениями стоит конкретизировать. Обобщать не стоит
            System.out.println("Exception 2");
        }
        finally {
            System.out.println("eto finally");
        }
    }
}
