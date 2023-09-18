package Leveling.Lesson_27;
import java.io.*;
public class Test13 {
    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("test9.txt");
            try {
                fis2 = new FileInputStream("test10.txt");
            } catch (FileNotFoundException e) {
                System.out.println("File test 10 ne nayden");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File test 9 ne nayden");
        }
        finally {
            System.out.println("eto vnewniy finally block");
            try {
                fis1.close();
                //fis2.close();//Вызовет NullPointerException который ловить не нужно, так как это runtime exception
            }
            catch (IOException e){
                System.out.println("Naydeno iskluchenie v finally bloke");
            }
        }
    }

    public static void main(String[] args) {
        Test13 t = new Test13();
        t.abc();
    }
}
