package Leveling.Lesson_20_ArrayListMethods.Lesson_24;

public class Test6 {
}
interface I2 {
    default void abc() {
        System.out.println("eto metod abc");
    }
    static void def () {//Статические методы интерфейса не наследуются из интерфейса в класс
        System.out.println("Static method 1");
    }
}
interface I3 extends I2 {
    void abc();//Интерфейс наследник может перезаписать метод таким образом, что он станет абстрактным
}
interface I4 {
    static void def () {
        System.out.println("Static method 2");
    }
}

abstract class R implements I2 {
    abstract public void abc();//Классы, которые имплементируют интерфейс так же могут перезаписать дефолтный метод, сделав его абстрактным.
    //Но класс при этом тоже должен стать абстрактным
}
abstract class O{}
class T extends O implements I2{
    void method1 (){}
    T method2 () {return  new T();}
    I2 method3 () {return new T();}


    public static void main(String[] args) {
        I2.def();//К статическому методу интерфейса можно обратиться только с помощью названия интерфейса.
        //При этом классу даже не обязательно его имплементировать
        I4.def();//Так как перед обращением используется имя интерфейса,статические методы могут быть абсолютно одинаковые в разных интерфейсах и конфликта не будет

    }
}