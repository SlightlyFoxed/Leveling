package Leveling.Homework.Lesson_29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Lesson_29 {
}
class Employee {
    String name;
    String department;
    double salary;
    Employee (String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
class TestEmployee {
    public void printEmployee (Employee emp){
        System.out.println("Имя работника: " + emp.name + ", Работает в отделе: " +emp.department + ", Его зарплата: "+emp.salary);
    }
    void filtraciyaRabotnikov(ArrayList <Employee> aL, Predicate <Employee> emp){
        for (Employee e: aL){
            if(emp.test(e)){
                printEmployee(e);
            }
        }

    }

    public static void main(String[] args) {
        ArrayList <Employee> list = new ArrayList<>();
        Employee emp1 = new Employee("Иван","Маркетинг", 150);
        Employee emp2 = new Employee("Николай","IT", 200);
        Employee emp3 = new Employee("Дмитрий","Образование", 300);
        Employee emp4 = new Employee("Наталья","Маркетинг", 250);
        Employee emp5 = new Employee("Игорь","IT", 550);
        Employee emp6 = new Employee("Елена","Образование", 350);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);
        TestEmployee t = new TestEmployee();
       t.filtraciyaRabotnikov(list,emp8 -> emp8.department == "IT" && emp8.salary >200);
        System.out.println("----------------------------------------");
       t.filtraciyaRabotnikov(list,emp8 -> emp8.name.startsWith("Е") && emp8.salary != 450);
        System.out.println("----------------------------------------");
       t.filtraciyaRabotnikov(list,emp8 -> emp8.name == emp8.department);



    }
}
