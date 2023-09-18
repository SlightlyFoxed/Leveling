package Leveling.Homework;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;
    Employee(int id1, String surname1, int age1, double salary1, String department1){
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;

    }
    public Employee (int id2){
        id = id2;
    }
    Employee(String surname2){
        surname = surname2;
    }
    private Employee(double salary2){
        salary = salary2;
    }
    double premiya (){
        System.out.println("Зарплата сотрудника "+ surname + " была "+ salary );
        System.out.println();
        salary = salary*2;
        System.out.println("Зарплата сотрудника "+ surname + " становится "+ salary );
        System.out.println();
        return salary;
    }
    public void infoId () {
        System.out.println("Id сотрудника: " + id);
    }
    public void infoSurname () {
        System.out.println("Фамилия сотрудника: " +surname);
    }
    public void infoSalary (){
        System.out.println("Зарплата сотрудника: "+ salary);
    }
}
class EmployeeTest{
    Employee e1 = new Employee(1,"Petrov", 21, 1500.00,"Marketing");
    Employee e2 = new Employee(2,"Fedorov",28,2400.00,"IT");

    public static void main(String[] args) {
        EmployeeTest ETest = new EmployeeTest();
        ETest.e1.premiya();
        ETest.e2.premiya();
        ETest.e1.infoId();
        ETest.e1.infoSurname();
        ETest.e1.infoSalary();

    }
}
class EmployeeTest2 {
    public static void main(String[] args) {

        Employee e3 = new Employee(3);
        System.out.println(e3.id);
        System.out.println(e3.surname);
        e3.infoSalary();
        Employee e4 = new Employee("Voronin");
        System.out.println(e4.id);
        System.out.println(e4.surname);
        e4.infoSalary();
        /*Employee e5 = new Employee(6000.0);// так как конструктор с параметром salary имеет доступ private, невозможно создать объект с такими параметрами
        System.out.println(e5.salary);*/
    }
}
