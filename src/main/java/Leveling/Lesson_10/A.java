package Leveling.Lesson_10;


/*import Leveling.Lesson_9.Car; //Чтобы успешно испортировать класс, его access modifier должен быть public
import Leveling.Lesson_9.Student;*/
import Leveling.Lesson_9.*;//если нужно импортировать много классов, можно импортировать весь пакет
//import Leveling.Lesson_8.*;//Если импортированы 2 пакета, которые имеют одинаковые имена классов, то при создании объекта класса необходимо будет писать полное имя
import static  Leveling.Lesson_9.Car.ab;//Для того, чтобы вызывать статическую переменную по ее короткому имени используется import static
//Для того, чтобы импортировать все статические переменные класса, используется import static  Leveling.Lesson_9.Car.*

public class A {
    public static void main(String[] args) {//static используется в главном методе потому что необходим метод, который может срабатывать без существования классов
        Car c2 = new Car("black", "V8");
        Leveling.Lesson_9.Student st2 = new Leveling.Lesson_9.Student();
        System.out.println(st2.z);
        System.out.println(Student.c);//Так как переменная _c_ является статичной, она не принадлежит объекту. поэтому пишу имя класса
        System.out.println(ab);//Если в классе будет присутствовать другая статическая переменная с таким же именем,
        // то компилятор в первую очередь будет искать внутри класса,а уже потом в импортированном


    }
}
class B{//импорт распространяется на весь файл, следовательно даже создав другой класс, в нем можно будет создавать объекты класса из имортированных
    Student st3 = new Student();
}