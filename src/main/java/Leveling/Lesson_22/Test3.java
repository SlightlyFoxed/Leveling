package Leveling.Lesson_22;

public class Test3 {
    void uvelichZP (Employee e){ //Extensibility. Благодаря этому в параметр можно вписывать любой subclass Employee
        e.salary = e.salary + 100;
    }
    public static void main(String[] args) {
        Doctor doc = new Doctor();//Объект doc класса Doctor использует все методы и переменные класса Employee так, как будто они указаны в его теле
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.eat();
        doc.sleep();
        doc.heal();
    }
}
class Employee {//Суперкласс,он же родительский класс так же является и сабклассом.Так как единственный родитель (прародитель) это класс Object и он не имеет родителя
    // Все остальные классы являются прямыми или косвенными потомками класса Object
    //за кулисами к записи class Employee компилятором будет добавлена надпись, class Employee extends java.lang.Object
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

class Doctor extends Employee{ //Теперь класс Doctor является субклассом суперкласса Employee
    // и может использовать все методы и переменные суперкласса так, как если бы они были написаны в его теле
    void heal () {
        System.out.println("Lechit");
    }
}
class Xirurg extends Doctor {//У сабклассов так же могут быть сабклассы. они так же имеют черты суперкласса.
    String scalpel;
    void operaciya(){}
}
class Dantist extends Doctor{}

class Teacher extends Employee{
    int kolichestvoUchenikov;
    void uchit () {
        System.out.println("Uchit");
    }

}
class Driver extends Employee{
    String nazvanieMashini;
    void drive () {
        System.out.println("Vodit");
    }

}
//Наследование нужно для:
//Более короткого написания классов
//Легкость в изменении/добавлении общих элементов
//Extensibility
//Более легкое тестирование классов
//Группировка классов под общим типом
