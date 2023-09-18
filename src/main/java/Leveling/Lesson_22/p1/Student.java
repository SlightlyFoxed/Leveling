package Leveling.Lesson_22.p1;

import Leveling.Lesson_22.*;

public class Student extends Human {
    public static void main(String[] args) {//Переменные и методы с модификатором доступа protected можно использовать в другом пакете но только внутри сабкласса
        Student s = new Student();//И используя его объект
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();

        Human h = new Human();//Но использовать объект суперкласса не получится, так как он не видит эти переменные и методы
        //System.out.println(h.name);//Эта запись не верна, так как использовать объект суперкласса в этой ситуации не получится
        //h.work();
        /*System.out.println(Human.salary);//Эти методы компилятор позволяет использовать
        Human.rest();*/
    }

}
class Test {//Этот класс не является сабклассом, а потому не может пользоваться методами и переменными суперкласса.
    public static void main(String[] args) {
        Student s = new Student();
        //System.out.println(s.name);
        //s.work();
    }
}