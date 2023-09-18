package Leveling.Lesson_25;

public class Test2 {
    public static void main(String[] args) {
        Jumpable j = new Man();
        Man m = new Man();
        Student s = new Student();
        if (j instanceof Jumpable) {System.out.println("j is Jumpable");}
        if (m instanceof Human) {System.out.println("m is Human");}
        //if (s instanceof Human) {System.out.println("s is Human");}//Компилятор не допустит такой записи,так как у саб класса не может быть двух супер классов,
        // а ветки наследования у класса Student и класса Human разные, он увидит что никакой связи между ними двумя быть не может
        if (s instanceof Jumpable) {System.out.println("s is Jumpable");}//С интерфейсами компилятор допускает такую ситуацию,
        // так как он не знает на что конкретно ссылается переменная _s_, ссылается ли она на сам класс Student или на его вероятный саб класс.
        // Он предполагает что у возможного саб класса класса Student может быть имплементирован этот интерфейс, а потому пропускает данную запись
        //Естественно метод будет false и надпись "s is Jumpable" не появится, но сам код будет одобрен компилятором
    }
}
interface Jumpable {}

class Human implements Jumpable {}

class Man extends Human {}

class Student {}
