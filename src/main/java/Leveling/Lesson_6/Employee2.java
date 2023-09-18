package Leveling.Lesson_6;

public class Employee2 { //Более корректный способ в использовании, когда один overloaded конструктор вызывает другой свой overloaded конструктор
    Employee2 (int id2,String surname2, int age2){
        //В этом случае используем конструктор с самым большим количеством параметров и ссылаемся уже на него
        this(id2,surname2,age2,0.0,null);//так как нет других параметров, вместо них используем дефолтные значения
    }
    public Employee2 (String surname3, int age3){
        this(0,surname3,age3,0.0,null);

    }
    Employee2 (int id4,String surname4, int age4,double salary4, String department4){
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;

    }
    int id;
    String surname;
    int age;
    double salary;
    String department;
}
class Employee2Test {
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2(1,"Ivanov",25);
        System.out.println(emp1.id);
        Employee2 emp2 = new Employee2("Petrov",30);
        Employee2 emp3 = new Employee2(2,"Sidorov",40,100.35,"IT");


    }
}
