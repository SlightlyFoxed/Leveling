package Leveling.Lesson_20_ArrayListMethods.Lesson_24;

public class Test4 {
    Jumpable j1 = new Human();//На совершенно разные объекты можно ссылаться переменными одного типа
    Jumpable j2 = new Animal();//Таким образом объекты немного сблизились.
    // Такое возможно только с помощью интерфейсов, так как дерево наследования этих классов никак не пересекается, за исключением класса Object
    //Но если предположить что в класс Object можно было бы добавить какой то метод, типа jump, то все остальные классы тоже научились бы прыгать
}

class Human implements Jumpable{
    @Override
    public void jump() {
        System.out.println("Human jumps");
    }
}
class Animal implements Jumpable{
    @Override
    public void jump() {
        System.out.println("Animal jumps");
    }
}
interface Jumpable {
    void jump();
}
interface A2 {
    void abc();
}
interface B2 extends A2,Jumpable {//Интерфейсы могут наследовать два и более интерфейсов
    void def ();
}
abstract class D implements  B2{};//Абстрактный класс может имплементировать интерфейсы. Если он перезапишет все методы, то он может перестать быть абстрактным
//Если появится еще один класс наследник абстрактного класса,в котором частично перезаписаны методы,он может перезаписать оставшиеся и тогда не будет абстрактным
//Но первый конкретный класс в иерархии должен снабдить все абстрактные методы телами.
