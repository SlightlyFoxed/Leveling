package Leveling.Lesson_17;

class Car{}

public class Test1 {//StringBuilder. Объекты класса StringBuilder являются Мutable. Их можно изменять
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();//Конструктор StringBuilder
        StringBuilder sb2 = new StringBuilder("Good day!");
        StringBuilder sb3 = new StringBuilder(50);//Вместимость 50. по дефолту вместимость массива StringBuilder 16.
        StringBuilder sb4 = new StringBuilder(sb3);//позволяет создавать объект на основе другого StringBuilder. Это будет другой объект, но с таким же значением

        System.out.println(sb2.length());//Метод позволяет узнать длину массива
        System.out.println(sb2.charAt(4));//Позволяет узнать какой char( символ) находится на указанном индексе.
        System.out.println(sb2.indexOf("d"));//Позволяет узнать на каком индексе находится указанный символ.Принимает String в отличие от класса String
        System.out.println(sb2.indexOf("o",2));
        String s = sb2.substring(5);
        System.out.println(s);
        String s2 = sb2.substring(5,8);
        System.out.println(s2);

        System.out.println(sb2.subSequence(5,8));//Работает так же как substring, но в выводе CharSequence

        sb2.append(22);//Метод позволяет добавить в конец объекта любой ПРИМИТИВНЫЙ тип данных. При этом изменяется сам StringBuilder
        System.out.println(sb2);
        sb2.append(true);
        System.out.println(sb2);
        sb2.append(sb2);
        System.out.println(sb2);
        sb2.append("Hello");
        System.out.println(sb2);
        sb2.append(new Car());//Метод позволяет добавить в том числе и объект класса. В этом случае это будет визуальное представление объекта

        System.out.println(sb2.insert(4,55));//Метод позволяет добавить на указанный индекс объекта любой ПРИМИТИВНЫЙ тип данных.
        StringBuilder sb10 = new StringBuilder("Hello World");
        sb10.delete(4,6);// метод удаляет символы с и до определенного индекса. Изменяет StringBuilder
        System.out.println(sb10);
        sb10.deleteCharAt(4);//Метод удаляет символ на конкретной позиции.Изменяет StringBuilder
        System.out.println(sb10);
        sb10.reverse();//Переворачивает StringBuilder в обратную сторону.Изменяет StringBuilder.НЕ РАБОТАЕТ С substring, substring от StringBuilder это String
        System.out.println(sb10);
        StringBuilder sb12 = new StringBuilder("Vsem privet");
        sb12.replace(0,5,"Pete ");//Меняет в указанном диапазоне индексов на определенный String. Символ крайнего элемента не будет включен в замену
        System.out.println(sb12);
        System.out.println(sb12.capacity());


    }
}
