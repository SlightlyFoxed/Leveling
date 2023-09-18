package Leveling.Lesson_23;

public class Test2 {
    public Object abc () {//Если у метода return type это Object
        return new Doctor();//то вернуть можно любой объект, так как Object является прародителем всех классов в java.Любой объект является сабклассом класса Object
        //Любой доктор это Object.
        //Любой Object не может быть доктором.
    }
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();//Переменная определенного типа может ссылаться на объект того же типа
        Employee e = new Employee();

        Employee emp1 = new Doctor();//Переменная Employee(суперкласса) может ссылаться на объект сабкласса.Эта запись означает что Доктор это Работник
        Employee emp2 = new Teacher();//Учитель это Работник
        Employee emp3 = new Driver();//Водитель это Работник
        //Переменная суперкласса может ссылаться на любой объект сабкласса. НО НЕ НАОБОРОТ
        Xirurg x = new Xirurg();
        Doctor d2 = new Xirurg();//Любой хирург это доктор
        //Xirurg x2 = new Doctor();//Но каждый доктор это не хирург.
        Employee emp4 = new Xirurg();//Любой хирург это работник

        //Driver dr2 = new Employee();//Работник это водитель.Запись логически не правильна и компилятор не пропустит такое.
        //Работник не обязательно водитель, но водитель это обязательно работник, как и учитель обязательно работник и доктор.
    }
}

class Employee {
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
class Doctor extends Employee {
    void heal () {
        System.out.println("Lechit");
    }
}
class Xirurg extends Doctor {
    String scalpel;
    void operaciya(){}
}
class Teacher extends Employee {
    int kolichestvoUchenikov;
    void uchit () {
        System.out.println("Uchit");
    }

}
class Driver extends Employee {
    String nazvanieMashini;

    void drive() {
        System.out.println("Vodit");
    }
}

