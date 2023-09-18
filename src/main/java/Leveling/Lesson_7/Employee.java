package Leveling.Lesson_7;

public class Employee {
    public double salary;
    public void dvoynayaZP () {
        double result = salary *2;// У локальных переменных не может быть access modifier
        System.out.println("Novaya Z/P = " + result);
    }
    public Employee(double salary2) {
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoynayaZP();
    }
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(500);//Внутри пакета все три элемента видны
        System.out.println(emp.salary);
        emp.dvoynayaZP();
    }

}
