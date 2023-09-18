package Leveling.Lesson_7;

public class A { //У классов только 2 модификатора доступа public либо default, когда не указан модификатор
    public static void main(String[] args) {
        B object = new B();//Так как два класса находятся в одном пакете, можно обращаться к их переменным, классам и методам без особых проблем
        //создан объект класса B
        //Для того, чтобы создать объект класса находящийся в другом пакете, необходимо полностью указать его имя, начиная с класса
        Leveling.Lesson_6.Employee2 emp = new Leveling.Lesson_6.Employee2("Ivanov", 21);//так же надо указать модификатор доступа public
        //ТИПЫ ДОСТУПА ACCESS MODIFIERS МОДИФИКАТОРЫ ДОСТУПА
        // Public - элементы класса видны всем
        // Private - элементы класса будут видны только в этом классе
        // Default - элементы класса будут видны только в этом пакете.существует всегда, когда не пишется access modifier.
        // Protected - видимость та же что и у Default access modifier но к этому добавляется наследственность. Будут видны наследники класса даже в другом пакете
        // У локальных переменных не может быть access modifier
    }
}