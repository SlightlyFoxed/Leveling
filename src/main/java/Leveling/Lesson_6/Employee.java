package Leveling.Lesson_6;

public class Employee { //Constructor Overloading
    //Перегруженные конструкторы имеют разный список параметров
    //По типам данных
    //По количеству
    //По порядку
    Employee (int id2,String surname2, int age2){
        this (surname2,age2);//Так как нельзя в теле конструктора вызвать его overloaded конструктор по имени класса, используется ключевое слово this
        id = id2;
    }
    Employee (String surname3, int age3){
        surname = surname3;
        age = age3;
    }
    Employee (int id4,String surname4, int age4,double salary4, String department4){//Ключевое слово this всегда должно быть первым выражением в теле конструктора
        this (id4,surname4,age4);
        /*id = id4;
        surname = surname4;
        age = age4;*/
        salary = salary4;
        department = department4;

    }
    int id;
    String surname;
    int age;
    double salary;
    String department;
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Ivanov",25);
        System.out.println(emp1.id);
        Employee emp2 = new Employee("Petrov",30);
        Employee emp3 = new Employee(2,"Sidorov",40,100.35,"IT");


    }
}