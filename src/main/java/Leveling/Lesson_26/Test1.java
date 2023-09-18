package Leveling.Lesson_26;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("black", "V8");
        System.out.println(c1.equals(c2));//Метод equals перезаписан вручную и теперь сравнивает значения параметров,
        // не смотря на то, что переменные ссылаются на разные объекты
        System.out.println(c3);

    }
}
class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Object obj) {//Перезапись метода equals
        if (obj instanceof Car) {//если объект принадлежит классу Car, то выполняем тело
            Car c2 = (Car) obj;//Провожу кастинг переменной
        return (color.equals(c2.color) && engine.equals(c2.engine));//Проводится сравнение значений параметров одной машины с значением параметров второй.
        } else {
            return false;
        }
    }
    public String toString(){//Перезаписанный метод toString
        return "Mashina cveta "+ color + " i  s motorom " + engine;
    }
}
/*
public boolean equals (Object obj){Так выглядит метод equals в классе Object, которому он принадлежит
    return (this == obj);//Переменная ссылается на obj? если ссылается то true, если нет false
}*/
//Если перезаписывается метод equals, всегда нужно использовать в его параметре тип данных Object.
//Правильно и логично перезаписанный метод equals должен обладать следующими свойствами:
//1. Симметричность - для non-null ссылочных переменных a и b, a.equals(b) возвращает true тогда и только тогда, когда b.equals(a) возвращает true
//2. Рефлексивность - non-null ссылочной переменной a, a.equals(a) всегда должно возвращать true
//3. Транзитивность - non-null ссылочных переменных a, b и c, если a.equals(b) и b.equals(c) возвращает true, то a.equals(c) тоже должно возвращать true
//4. Постоянство - для non-null ссылочных переменных a и b, неоднократный вызов a.equals(b) должен возвращать или только true, или только false
//5. Для non-null ссылочной переменной a, a.equals(null) всегда должно возвращать false
