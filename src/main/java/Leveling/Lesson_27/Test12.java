package Leveling.Lesson_27;
import java.io.*;
public class Test12 {
    //Исключение может быть перевыброшено.Это обычно делают тогда, когда код текущего метода обработал данное исключение не полностью и выбрасывает его вновь,
    // чтобы метод, который будет вызывать текущий метод завершил обработку данного исключения
    void abc () throws FileNotFoundException{
        try {
            File f = new File("test8");
            FileInputStream fis = new FileInputStream(f);
        }
        catch (FileNotFoundException e){
            System.out.println("Exception poyman i nemnogo obrabotan");
            throw  e;//Если нет возможности полностью обработать исключение в catch блоке, можно с помощью trow заставить catch  снова выбросить исключение
            //В этом случае необходимо будет объявить, что метод может выбрасывать исключение, даже если в нем присутствуют try/catch блоки
        }
        finally {
            System.out.println("eto block finally");
        }
    }
    void method () {
        try {
            abc();//Если предыдущий метод был заставлен снова выбрасывать ошибку, то метод который будет его использовать,
            // должен обработать исключение или объявить что может выбрасывать исключение
        }catch (FileNotFoundException e){
            System.out.println("Exception poyman i polnostyu obrabotan");
        }
    }
}
