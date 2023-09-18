package Leveling.Lesson_27;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test21 {
    //Конструктор может выбрасывать исключения. Конструктор в своей сигнатуре должен описывать все исключения конструктора супер класса, который он вызывает,
    // может описывать супер классы данных исключений, а также добавлять новые исключения
    public static void main(String[] args) {

    }
}

class Animal3 {
Animal3 ()throws FileNotFoundException{

}
}

class Mouse3 extends Animal3{
Mouse3 ()throws IOException {super();}//В конструкторах логика объявления исключений работает противоположно логике перезаписанных методов.
    //В теле конструктора обработать исключение невозможно, так как главное правило конструкторов саб класса,
    // это то, что запись вызывающая конструктор супер класса (super();) должна быть на первом месте
    //Поэтому обработать исключение в теле этого конструктора будет невозможно, т.к. противоречит правилу.
    //Необходимо объявлять что конструктор саб класса может выбрасывать исключения КАК МИНИМУМ такие же, как конструктор супер класса, или ВЫШЕ.
    //Также можно добавить новые исключения
}
class Human {
    String name;
    int age;
    Human (String name, int age)throws Exception{
        if (age < 0){
            throw new Exception ("nekorrektniy vozrast");
        }
        this.name = name;
        this.age = age;
    }
}
