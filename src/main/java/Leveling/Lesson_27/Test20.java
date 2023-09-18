package Leveling.Lesson_27;

import Leveling.Homework.Lesson_22.Animal;

import java.io.*;

public class Test20 {
    //Исключения, method overriding and overloading, constructors
    //Если класс перезаписывает метод из суперкласса или имплементирует метод из интерфейса, непозволительно добавлять в его сигнатуру новые checked исключения.
    // Можно в сигнатуре метода использовать только исключения из перезаписанного метода супер класса или дочерние классны данных исключений
    //Вышенаписанное правило никаким образом не относится к перезагруженным методам.
    //Конструктор может выбрасывать исключения. Конструктор в своей сигнатуре должен описывать все исключения конструктора супер класса, который он вызывает,
    // может описывать супер классы данных исключений, а также добавлять новые исключения
    public static void main(String[] args) {
        Animal2 a = new Mouse();
        try {
            a.run();
        }
        catch (Exception e){
            System.out.println("Exception poyman");
        }
    }


}
class Animal2 {
    void run () throws IOException, ArrayIndexOutOfBoundsException {//Так же можно указывать что метод выбрасывает несколько исключений,если это RunTimeException-ы
        System.out.println("Animal runs");
    }
    void run (int a) throws Exception {//В overloaded методах можно объявлять любые исключения.
        System.out.println("Animal runs");
    }
}
class Mouse extends Animal2 {
    void run()throws IOException{//НЕЛЬЗЯ объявлять класс исключений выше чем тот, который указан в перезаписанном методе в супер классе.
        // Или можно не указывать вовсе, что метод выбрасывает исключения.
        // Ниже можно, например FileNotFoundException. объявить класс выше, например Exception, нельзя. Эти правила действуют только на checked исключения
        //Зато в перезаписанном методе можно указывать что он выбрасывает любые RunTimeException
        //Так же можно указывать что метод выбрасывает несколько исключений
        System.out.println("Mouse runs");
    }
}
