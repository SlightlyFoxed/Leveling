package Leveling.Lesson_25;

public class Test4 {
    public static void main(String[] args) {
        Employee2 emp1 = new Doctor2();
        Employee2 emp2 = new Teacher2();
        Employee2 emp3 = new Driver2();
        Employee2 emp4 = new Employee2();
        Employee2 [] array = {emp1,emp2,emp3,emp4};
        for (Employee2 e:array){
            if (e instanceof Driver2){
                System.out.println(((Driver2) e).nazvanieMashini);
                ((Driver2) e).drive();
            }
        }
    }
}
class Employee2 {
    double salary = 100;
    String name;
    int age;
    int experience;
    void eat () {
        System.out.println("Kushat");
    }
    void sleep () {
        System.out.println("Spat");
    }
}
class Doctor2 extends Employee2 implements Help_able1 {
    String specializacia= "Xirurg";
    public void help() {
        System.out.println("Doctor okazivaet pomosh");
    }

    void heal () {
        System.out.println("Lechit");
    }
}
class Teacher2 extends Employee2 {
    int kolichestvoUchenikov;
    void uchit () {
        System.out.println("Uchit");
    }
}
class Driver2 extends Employee2 {
    String nazvanieMashini = "Mersedes";
    void drive () {
        System.out.println("Vodit");
    }
}
interface Help_able2 {
    void help();
}