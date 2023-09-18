package Leveling.Lesson_23;

public class Test3 {
    public static void main(String[] args) {
        /*Doctor1 d = new Doctor1();
        Teacher1 t = new Teacher1();
        Driver1 dr = new Driver1();
        Employee1 e = new Employee1();
        Xirurg1 x = new Xirurg1();*/

        Employee1 emp1 = new Doctor1();//Связь "Is a"
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();
        //emp1.heal;//В таких случаях компилятор всегда обращает внимание на тип переменной.Так как в классе Employee нет метода heal, вызов этого метода запрещен
        //Хоть реальный объект на который ссылается переменная Employee является типа Doctor,
        // компилятор проверяя тип данных самой референс переменной, видит что это Employee.
        // Поэтому можно вызвать только те методы и переменные, которые есть в классе Employee



        Employee1 emp2 = new Teacher1();
        Employee1 emp3 = new Driver1();


        Doctor1 d2 = new Xirurg1();
        System.out.println(d2.age);
        System.out.println(d2.salary);
        System.out.println(d2.experience);
        //System.out.println(d2.skalpel);//У класса Doctor1 этой переменной нет
        d2.sleep();
        d2.eat();
        d2.heal();
        //d2.operaciya;//У класса Doctor1 этого метода нет

        Employee1 emp4 = new Xirurg1();
        System.out.println(emp4.age);
        System.out.println(emp4.salary);
        System.out.println(emp4.experience);
        //System.out.println(emp4.skalpel);//У класса Employee1 этой переменной нет
        emp4.sleep();
        emp4.eat();
        //emp4.heal();//У класса Employee1 этого метода нет
        //emp4.operaciya;//У класса Employee1 этого метода нет

        //Если переменная типа данных суперкласса ссылается на объекты сабкласса,
        //то с помощью этой переменной можно вызывать только унаследованные от суперкласса элементы

    }
}
class Employee1 {
    double salary = 100;
    String name= "Kolya";
    int age;
    int experience;
    void eat () {
        System.out.println("Kushat");
    }
    void sleep () {
        System.out.println("Spat");
    }
}
class Doctor1 extends Employee1 {
    void heal () {
        System.out.println("Lechit");
    }
}
class Xirurg1 extends Doctor1 {
    String scalpel;
    void operaciya(){}
}
class Teacher1 extends Employee1 {
    int kolichestvoUchenikov;
    void uchit () {
        System.out.println("Uchit");
    }

}
class Driver1 extends Employee1 {
    String nazvanieMashini;

    void drive() {
        System.out.println("Vodit");
    }
}
