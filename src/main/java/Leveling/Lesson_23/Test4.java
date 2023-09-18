package Leveling.Lesson_23;

public class Test4 {
    public static void main(String[] args) {
        Employee2 e = new Employee2();
        Teacher2 t = new Teacher2();
        e.eat();
        t.eat();
        Employee2 e1 = new Teacher2();//Поскольку настоящий объект на который ссылается переменная это объект класса Teacher2,
        e1.eat();//вызывается метод который находится в классе Teacher2, не смотря на то что _e1_ это референс переменная типа Employee2
        //Здесь используется Run time binding, так как при одинаковых сигнатурах методов компилятор не может определить принадлежность метода к классу
        //Compile time binding используется на моменте компиляции когда методы являются private,static или final. потому что они НЕ МОГУТ быть перезаписаны
        //Compile time binding называется статичным binding или early binding (ранняя связь)
        //Run time binding называется dynamic binding или late binding (поздняя связь).Run time binding используется  для остальных методов
        // К Run time binding относится динамичный выбор актуальной версии метода, которая основана на том объекте, который реально создается
        //И в данном случае объект который реально создается это Teacher2, а потому актуальный метод для него будет из его класса
    }
}
class Eda{}
class Frukti extends Eda{}
class Employee2 {
    double salary = 100;
    String name;
    int age;
    int experience;
    Eda eat () {//overridden method. перезаписанный метод
        System.out.println("Kushaet rabotnik");
        Eda e = new Eda();
        return e;
    }
    void sleep () {
        System.out.println("Spat");
    }
}
//Method overriding это изменение non-static, non-final метода в sub классе, который он унаследовал от parent класса
// Метод считается overridden если :
// Имя в sub классе такое же, что и в parent классе
// Список аргументов в sub классе такой же, что и в parent классе
// return type в sub классе такой же, что и в parent классе или же return type в sub классе - это sub класс return type из parent класса (covariant return types)
// Access modifier в sub классе такой же или менее строгий чем в parent классе.Иначе ломается логика наследования,и саб класс саб класса не сможет приобрести метод
// Метод в sub классе тоже должен быть non-static
//понятия variable overriding не существует
class Teacher2 extends Employee2 {
    Frukti eat () {//override method. перезаписанный метод.Хоть return type и разные, но return type Frukti является саб классом parent класса Eda
        System.out.println("Kushaet uchitel");
        Frukti f = new Frukti();//в return type можно указать Eda, и эта строчка Frukti f = new Frukti(); не будет ошибкой, так как Frukti саб класс класса Eda
        return f;// У примитивных типов данных нет саб классов, поэтому с return type int такое не получится сделать
    }
    int kolichestvoUchenikov;
    void uchit () {
        System.out.println("Uchit");
    }
}
class F {
    Employee2 objectCreation(){
        return new Employee2();
    }
}
class G extends F {
    Teacher2 objectCreation(){//Метод перезаписан, так как Teacher2 саб класс Employee2
        System.out.println("ok");
        return new Teacher2();
    }
}
