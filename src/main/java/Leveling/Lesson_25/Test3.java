package Leveling.Lesson_25;

public class Test3 {
    public static void main(String[] args) {
        Employee1 emp1 = new Doctor1();
        Employee1 emp2 = new Teacher1();//Casting из саб класса в супер класс происходит автоматически. Upcasting
        Employee1 emp3 = new Driver1();
        Help_able1 h = new Doctor1();
        Employee1 e = new Employee1();
        System.out.println(e == emp1);//Сравнение, ссылаются ли переменные на одинаковые классы
        Doctor1 d1 = (Doctor1) emp1;//Casting с использованием дополнительной переменной типа Doctor1 (Down casting)
        System.out.println(d1.specializacia);
        d1.heal();
        System.out.println(((Doctor1) emp1).specializacia);//Casting с указанием объекта, чей метод вызван (Down casting)
        ((Doctor1) emp1).heal();
        //System.out.println(((Doctor1) emp2).specializacia);//Если указать неверный объект, то компилятор, будучи обманутым, пропустит эту строчку.
        // Но Run time проверит и в итоге выдаст ошибку ClassCastException
        //Casting - это процесс, когда заставляют переменную одного типа данных вести себя как переменная другого типа данных.
        //Casting возможен только тогда, когда между классами/интерфейсами существует IS_A взаимоотношение
        //Делая casting, вы не меняете тип данных объекта, а заставляете его чувствовать себя как объект другого типа
        //Casting из саб класса в супер класс происходит автоматически. Upcasting
        //Casting из супер класса в саб класс НЕ происходит автоматически. Down casting
        //Если между классами/интерфейсами нет IS-A взаимоотношения, компилятор не допустит casting
        //Даже если компилятор допустил casting, выскочит runtime exception, если объект, который мы делаем cast на самом деле не принадлежит классу,
        // на который мы делаем его cast
        //Driver1 d = (Driver1) emp2;//runtime exception
        System.out.println();
        System.out.println(((Doctor1)h).specializacia);//Casting c указанием объекта, чей метод вызван для интерфейса
        ((Doctor1) h).heal();
        ((Doctor1) emp1).help();//Casting маркирует переменную emp1 под переменную Doctor1
    }
}
class Employee1 {
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
class Doctor1 extends Employee1 implements Help_able1 {
    String specializacia= "Xirurg";
    public void help() {
        System.out.println("Doctor okazivaet pomosh");
    }

    void heal () {
        System.out.println("Lechit");
    }
}
class Teacher1 extends Employee1 {
    int kolichestvoUchenikov;
    void uchit () {
        System.out.println("Uchit");
    }
}
class Driver1 extends Employee1 {
    String nazvanieMashini;
    void drive () {
        System.out.println("Vodit");
    }
}
interface Help_able1 {
    void help();
}
