package Leveling.Lesson_27;
import java.io.*;
public class Test16 {
    //При написании кода, можно использовать вложенные блоки try,catch и finally
    //Если исключение выбрасывается из catch блока, то оно не может быть обработано одноуровневым catch блоком.
    //При написании кода, можно создавать свои собственные исключения. В зависимости от необходимости, создаются исключения,
    // которые наследуются от классов Exception или RuntimeException
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("test9.txt");
            System.out.println("File test9 sushestvuet v sisteme i nayden");
            try {
                fis2.close();//Так как внутренний catch не сможет словить NullPointerException, то исключение выбрасывается на внешний try,
                // у которого есть catch блок, который ловит NullPointerException
            } catch (IOException e) {
                System.out.println("problemi so strimom fis2");
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File test9 ne nayden");
        }
        catch (NullPointerException e){//catch блок, который ловит NullPointerException
            System.out.println("Srabotal NullPointerException");
        }
    }
}
