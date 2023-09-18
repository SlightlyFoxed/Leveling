package Leveling.Lesson_27;

import java.io.*;

public class Test6 {
    //Checked exceptions
    //Если метод А использует внутри себя метод B, который может выбросить checked исключение, то метод А должен:
    //1. Или заключить вызов метода В в try/catch блоки
    //2. Или/и объявить, что он тоже может выбросить это checked исключение или его super класс (IOException/Exception)
    void abc () throws FileNotFoundException {
        File f = new File("test8");
        FileInputStream fis = new FileInputStream(f);
        System.out.println("Файл найден!");
    }
    void def () throws Exception {
        System.out.println("privet");
        abc();
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        try {
            t.def();
        }
        catch (Exception e){
            System.out.println("Bil poyman exception " + e);
            System.out.println(e.getMessage());//Вывод сообщения исключения
            e.printStackTrace();//Вывод StackTrace (Путь выброса исключения от метода к методу, где самый верхний это источник)
        }
    }
    //Очередность catch блоков очень важна.Компилятор не пропустит код, если исключение супер класса будет стоять перед исключением саб класса
    //Если в части кода, которая не находится в блоке try или в блоке try выбрасывается исключение, то соответствующая оставшаяся часть кода уже не обрабатывается
    //После выброса исключения мы можем увидеть стэк трейс для всех методов, задействованных в выбросе этого исключения
    //При создании объекта исключения можно воспользоваться его конструктором, который принимает String параметр и вписать в него необходимую информацию.
    //Так же можно воспользоваться конструктором, который не принимает параметры
}
