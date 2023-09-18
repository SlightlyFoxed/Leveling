package Leveling.Lesson_20_ArrayListMethods.Lesson_24;

public class Test3 {

        //Help_able = new Help_able ();//Невозможно создать объект интерфейса, потому что это не класс.
        //Так же в интерфейсе невозможно создать конструктор. Так как не нужно создавать конструктор конструкции, которая не может создать объект
        //Access modifier у всех топ-левел интерфейсов или public или default
        //Если не указать самостоятельно, то компилятор добавит в определение интерфейса слово abstract
        //Интерфейс не может быть final, так как он предназначен для того чтобы его имплементировали
        //Если не указать самостоятельно, то компилятор добавит в определение всех non-default (не access modifier) и non-static методов слова abstract и public
        //Методы в интерфейсе не могут быть final, так как они должны быть перезаписаны
        //Из переменных в интерфейсе могут быть только константы, которые должны быть в нем инициализированы
        //Если не указать самостоятельно,то компилятор добавит в определение всех переменных слова public final static
        public static void main(String[] args) {
            Help_able h = new Driver();//Можно создавать переменную типа интерфейса так как класс имплементировал этот интерфейс
            Swim_able s = new Driver();//Здесь так же присутствует отношение Is a. Водитель это умеющий плавать.
            Employee e = new Driver();//Аналогичная ситуация с супер классом
            System.out.println(h.a);//Переменная позволяет вызвать переменную интерфейса
            //System.out.println(h.nazvanieMashini);//Но она не позволит вызвать переменную класса
            h.pomosh();//Так же она позволяет вызвать методы класса, который имплементировал интерфейс, и перезаписал их
            h.tushitPojar("voda");
            s.swim();

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
class Driver extends Employee implements Help_able,Swim_able {//Класс может имплементировать сколько угодно интерфейсов
    String nazvanieMashini;
    void drive () {
        System.out.println("Vodit");
    }
    public void pomosh(){
        System.out.println("Voditel okazivaet pomosh");
    }
    public void tushitPojar(String s) {
        System.out.println("Voditel tushit pojar s pomowyu "+ s);
    }
    public void swim() {
        System.out.println("Voditel mojet plavat");
    }
}
class Teacher extends Employee implements Help_able{ //Чтобы добавить интерфейс в класс необходимо его имплементировать (воплотить в жизнь, осуществить)
    int kolichestvoUchenikov;
    void uchit () {
        System.out.println("Uchit");
    }
    public void pomosh(){//Если метод перезаписывается, то он ВСЕГДА должен быть с модификатором public. Иначе не сработает правило перезаписывания
        System.out.println("Uchitel okazivaet pomosh");
    }
    public void tushitPojar(String s) {
        System.out.println("Uchitel tushit pojar s pomowyu"+ s);
    }
}
interface Help_able{//ВСЕ переменные и методы которые содержит в себе интерфейс по дефолту будут с модификатором доступа public
    void pomosh();//Интерфейс может содержать в себе ТОЛЬКО абстрактные методы. И они не могут быть final
    void tushitPojar(String predmet);
    int a = 10;//Переменные в интерфейсах по дефолту будут public final static.Это значит что в классе,который использует интерфейс невозможно изменить эту переменную
}
interface Swim_able{
    void swim();
}