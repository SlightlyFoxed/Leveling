package Leveling.Lesson_23;

public class Test6 {
    public static void main(String[] args) {
        Employee3 emp1 = new Employee3();
        Teacher3 t = new Teacher3();
        //emp1.sleep();//Метод не виден, так как он private
        t.sleep();//Метод виден так как он public, но не наследован.
        t.sleep1();//Метод унаследован но при этом спрятан (hiding)
        Employee3 e = new Teacher3();
        //e.sleep();//Метод не виден, так как по сути метод не перезаписан из за того, что он private и наследования не произошло
        e.sleep1();//Так как метод статичный, с ним будет работать Compile time binding и поэтому будет запущен метод класса Employee3
        //Метод же в классе Teacher3 будет не перезаписанным(overridden) а спрятанным (hiding)
        System.out.println(t.salary);//Переменная hide, поэтому в выводе будет видна переменная не parent класса а sub класса

    }
}
//Method hiding : Это перекрытие static методов из parent класса в sub классе
// Метод считается hidden (скрытыми), если:
// Имя в sub классе такое же, что и в parent классе
// Список аргументов в sub классе такой же, что и в parent классе
// return type в sub классе такой же, что и в parent классе или же return type в sub классе - это sub класс return type из parent класса (covariant return types)
// Access modifier в sub классе такой же или менее строгий чем в parent классе.
// Если в parent классе метод является static, то и в sub классе он должен быть static
// Само понятие static не подразумевает под собой процесс создания объектов,
// в отличие от overriding и  polymorphism (в зависимости от типа объектов вызываются те или иные методы)
//Variable hiding - Объявление в sub классе переменной с таким же именем (не обязательно типом данных), что и в parent классе
//final метод не может быть overridden или hidden
//Если нужно сделать так, чтобы метод не перезаписывал саб класс, то можно отметить его как final
//Если же поставить перед static методом final, то саб класс не сможет ни перезаписать метод ни сделать его hide, но все еще будет его наследовать
//Если отметить класс как final то он не сможет иметь саб классы (потомков)
//Это необходимо делать ради производительности, так как все методы вызванные из final класса имеют Compile time binding, так как они не могут быть перезаписаны
//так как саб классов быть не может. И учитывая что Compile time binding происходит раньше чем Run time binding, то производительность возрастает

class Eda3{}
class Frukti3 extends Eda3{}
class Employee3 {
    double salary = 100;
    String name;
    Eda3 eat () {
        System.out.println("Kushaet rabotnik");
        Eda3 e = new Eda3();
        return e;
    }
    private void sleep () {
        System.out.println("Spit rabotnik");
    }
    static void sleep1 () {
        System.out.println("Spit rabotnik");
    }
}
class Teacher3 extends Employee3 {
    double salary = 200;
    @Override// это annotation для перезаписанного метода. можно использовать как проверку, что метод успешно перезаписан
    Eda3 eat () {
        System.out.println("Kushaet uchitel");
        Frukti3 f = new Frukti3();
        return f;
    }
    int kolichestvoUchenikov;
    void uchit () {
        System.out.println("Uchit");
    }
    public void sleep () { // метод не перезаписался, а просто создался заново.
        // Наследования из супер класса не произошло, так как private метод не виден в другом классе
        System.out.println("Spit uchitel");
    }
    static void sleep1 () {
        System.out.println("Spit uchitel");
    }
}
final class T{}//Если отметить класс как final то он не сможет иметь саб классы (потомков)
//class P extends T{}
