package Leveling.Lesson_16;

public class Test4 {
}

class Employee {
    double salary;
    boolean isManager;

    Employee (double salary, boolean isManager){
        this.salary = salary;
        this.isManager = isManager;
    }
}
class TestEmployee{
    public static void main(String[] args) {
        Employee emp1 = new Employee(100.5, true);
        System.out.println("On manager? " + emp1.isManager +" Ego zarplata: " + emp1.salary);
        //если попытаться с помощью + вывести два типа данных int и boolean, компилятор выдаст ошибку,
        // т.к. не может складывать эти типы данных. поэтому необходимо использовать String
    }
}
