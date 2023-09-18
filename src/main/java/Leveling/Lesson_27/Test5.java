package Leveling.Lesson_27;
import java.io.*;
public class Test5 {
    //Сабклассы Exception = checked exceptions
    //Checked исключения указывают на часть кода, который находится за пределами непосредственного контроля программой и
    // который может являться причиной выброса исключений.
    // Они как правило возникают при взаимодействии вашей программы с внешними источниками (работа с файлами, с БД, с сетью),
    // из за который и могут возникать проблемы. Компилятор всегда проверяет возможность выброса checked исключений.
    //Checked исключения всегда должны быть или объявлены и/или обработаны
    public static void main(String[] args) {
        File f = new File("test8.txt");

        try {
            FileInputStream fis = new FileInputStream(f);//В таких случаях java заставляет ловить исключение FileNotFoundException.
            // Компилятор не допускает написания этой строки без ловли исключения, так как она может вызвать исключение.
            // Это происходит почти всегда, когда код собирается работать с какой то внешней для java системой
            fis.read();//Методы read и write классов FileInputStream и FileOutputStream могут выбрасывать исключение IOException
            System.out.println("Все хорошо, файл найден!");
        }
        catch (FileNotFoundException e){
            System.out.println("Bil poyman exception  " + e);
        }
        catch (IOException e){//Если предполагается что необходимо ловить и другие возникающие исключения, можно использовать несколько catch блоков
            System.out.println("Bil poyman exception  " + e);
        }
        finally {//Finally block не обязателен. но если пишется, то всегда после catch блока и всегда не больше одного finally блока
            System.out.println("eto finally block");
        }
        //Последовательность блоков всегда должна соответствовать порядку try=>catch=>finally. блоки нельзя менять местами и между блоков другой код невозможен
        System.out.println("Etot kod uje ne imeet otnosheniya k isklyucheniyam");
    }
}
