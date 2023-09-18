package Leveling.Lesson_8;

public class Student {
    String name;//object variable
    int course;//object variable
    static int count;//class variable. static переменная будет принадлежать не объекту а всему классу.к ней может обращаться и изменять ее любой объект класса
    int a;
    public Student (String name2, int course2){
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count +" was created");
    }
    public static void showCount() {
        System.out.println("Vsego sozdano studentov " + count);
    }
    void abc(){//Не статичный метод не может существовать без объекта
        a++;//в этом случае мы можем вызвать не статичную переменную, так как она требует чтобы ее вызывали при помощи объекта
        count++;// статичная переменная существует вне зависимости от объектов, поэтому так же может быть использована
    }
    static void abcd(){//Статичный метод может существовать без объекта
        //a++; //Не статичная переменная обязывает существовать объект, так как _a++_ принадлежит не классу целиком а объектам в нем,
        // и у каждого объекта есть своя переменная _a_.
        count++;//статичная переменная существует вне зависимости от объектов, поэтому так же может быть использована
        Student st2 = new Student("Petr",1);
        st2.a++; //Чтобы использовать переменную _a_ необходим объект, который можно создать в статичном методе
    }
}
class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",1);
        Student st2 = new Student("Petr",4);
        Student st3 = new Student("Masha",2);

        System.out.println(st1.name);
        System.out.println(Student.count);//так как переменная не принадлежит к какому либо объекту, необходимо ссылаться на класс.
        Student.showCount();//Если main метод находится в изначальном классе, то можно не ссылаться на класс, в данном случае не писать Student. а просто showCount()
        Student.abcd();//Метод abcd() можно вызывать в main методе(который так же является статичным), без создания объекта
        st1.abc();//Не статичный метод не может быть вызван без создания объекта



    }
}
