package Leveling.Lesson_9;

public class Student {
    int a = 10;
    int b =this.a;
    public static int c = 5;
    public int z = this.c;
    static int f =c;
}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student();//Объект создан
        Student st2 = new Student();//Объект создан
        Student st3;//Объект не создан, так как нет вызова конструктора
        st1 = null;//Жизнь объекта закончена. Так же жизнь объекта заканчивается как только тело метода, в котором объект был создан, кончается
        st2 = new Student();//Жизнь объекта закончена, так как st2 теперь ссылается на другой объект
        //После смерти объекта, срабатывает механизм Garbage collector, для того чтобы удалить объект из памяти
        //Garbage collector
        //Мы можем определить какие объекты будут пригодны для того, чтобы garbage collector собрал их (удалил из памяти)
        //Мы не можем конкретно быть уверенны в том, что в определенное время garbage collector удалит объект из памяти
        //Мы не можем контролировать garbage collector и управлять им
        //Управление garbage collector-ом лежит на JVM


    }
}
