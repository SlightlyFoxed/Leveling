package Leveling.Lesson_21;

public class Test3 {
    Test3() {// если перед конструктором прописать void то это становится методом, так как у конструктора нет return type
        System.out.println("Это конструктор");
    }
    void Test3() {//Если добавить return type к конструктору то он превратится в метод. имя у метода может быть такое же как и у класса
        System.out.println("Это метод");
    }
    //int Test3 = 5;//Имя переменной и метода может совпадать.
    //Test3 Test3;// Создается переменная Test3 типа Test3 (так как есть такой класс). ЭТО ОТВРАТИТЕЛЬНАЯ ПРАКТИКА, ТАК ДЕЛАТЬ НЕЛЬЗЯ
}
class A {
    public static void main(String[] args) {
        Test3 t = new Test3();
    }
}
