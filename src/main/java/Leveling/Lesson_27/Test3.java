package Leveling.Lesson_27;
import java.io.*;
//java.io -(input output) это пакет, в котором собраны классы и интерфейсы, которые предназначены, если обобщить,
// для чтения и записи информации из/в какой-либо источник, например файл
//Класс File- абстрактная репрезентация пути к файлу или папке
//Класс FileInputStream предназначен для создания потока, с помощью которого можно читать информацию из списка
//Класс FileOutputStream предназначен для создания потока, с помощью которого можно писать информацию в источник.
//Конструкторы классов FileInputStream и FileOutputStream могут выбрасывать исключение FileNotFoundException
//Методы read и write классов FileInputStream и FileOutputStream могут выбрасывать исключение IOException
//Это исключение возникает, когда появляется какое то препятствие при чтении или записи. Стрим прерывается и выбрасывается исключение IOException
//IOException является супер классом FileNotFoundException
public class Test3 {
    public static void main(String[] args) throws Exception {
        File f = new File("test9.txt");//В параметрах имя файла. Самого файла может и не быть, но ошибки не будет,
        // так как это абстрактная репрезентация. По сути переменная _f_ нужна для того, чтобы находить с помощью нее путь к файлу.
        // Ни компилятор ни Run time не проверяют есть ли этот файл на самом деле или нет
        FileInputStream fis = new FileInputStream(f);//на этой строке java уже проверяет существует ли файл на самом деле, так как пытается открыть поток.
        // Если она не найдет, то выбросит исключение FileNotFoundException
        fis.read();
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(100);
    }
}
