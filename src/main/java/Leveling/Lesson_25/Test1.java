package Leveling.Lesson_25;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        Help_able h = new Teacher();
        h.help();
        //emp1.help();//Если имплементировать классу Employee интерфейс, то его переменная тоже сможет использовать этот метод, имплементируемый в другом классе
        emp1.work();
        emp2.work();
        emp3.work();
        System.out.println();
        Driver [] array1 = {new Driver(), new Driver()};//Можно создать массив типа конкретного класса, абстрактного класса или интерфейса
        Employee [] array2 = {new Driver(), new Driver(), new Teacher(), new Doctor()};//Массив типа абстрактного класса
        Help_able [] array3 = {new Driver(), new Driver(), new Teacher(), new Doctor()};//Массив типа интерфейса.
        // В этом случае классы объектов должны имплементировать этот интерфейс
        Employee [] array4 = {emp1, emp2, emp3};
        for (Employee emp:array4){//С помощью foreach цикла можно вызвать метод для каждого объекта
            emp.work();//В зависимости от того, какой на самом деле объект вызывает метод, срабатывает определенное тело метода
        }
        System.out.println();
        System.out.println(emp1 instanceof Employee);//Оператор instanceof проверяет, есть ли между объектом и классом/интерфейсом связь IS-A.
        // Если связь невозможна, компилятор выдает ошибку
        System.out.println(emp1 instanceof Teacher);//оператор проверяет является ли конкретный объект объектом конкретного класса. Если да, возвращает true
        System.out.println(emp1 instanceof Help_able);//Есть ли между этим объектом и классом связь IS-A?
        System.out.println(emp1 instanceof Driver);
    }
}
abstract class Employee{//Если имплементировать интерфейс в супер класс, то методы должны быть в каждом саб классе
    void sleep (){
        System.out.println("Employee sleeps");
    }
    abstract void work ();
}
class Teacher extends Employee implements Help_able {
     void work (){
        System.out.println("Teacher works");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}
class Driver extends Employee implements Help_able {
    void work (){
        System.out.println("Driver works");
    }
    public void help() {
        System.out.println("Driver helps");
    }
}
class Doctor extends Employee implements Help_able {
    void work (){
        System.out.println("Doctor works");
    }
    public void help() {
        System.out.println("Doctor helps");
    }
}
interface Help_able {
    void help();
}