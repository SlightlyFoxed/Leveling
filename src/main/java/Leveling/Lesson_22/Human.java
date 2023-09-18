package Leveling.Lesson_22;

public class Human {

    protected String name="Kolya";//Элемент класса private не может быть наследован, так как виден только внутри своего класса.
    // Но это можно решить с помощью инкапсуляции. public методы наследуются
    protected static int salary = 150;
    protected void work (){//Элементы с модификатором доступа protected видны в классах которые находятся в том же пакете,
        // а так же в классах, которые являются наследниками класса
        System.out.println("Working");
    }
    protected static void rest (){
        System.out.println("Resting");
    }
}

class Student extends Human{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }

}