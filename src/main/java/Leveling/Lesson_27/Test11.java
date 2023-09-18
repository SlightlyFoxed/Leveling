package Leveling.Lesson_27;
import java.io.*;
public class Test11 {
    static StringBuilder abc (){
        StringBuilder a = new StringBuilder("privet");
        try {
            File f = new File("test8");
            FileInputStream fis = new FileInputStream(f);
            //return 5;
        }
        catch (FileNotFoundException e){
            System.out.println("Exceprion poyman");
            System.out.println("peremennaya a v catch bloke = " + a);
            return a;
        }
        finally {
            a.append("!!!");
            System.out.println("eto block finally");
            System.out.println("peremennaya a v finally bloke = " + a);

        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(abc());

    }
}
