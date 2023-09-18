package Leveling.Lesson_20_ArrayListMethods.Lesson_24;

public class Test5 {
}
interface I1 {
    void abc();
    default void ghi () {System.out.println("eto metod ghi");}
    default void def() {//Дефолтный метод в интерфейсе можно не перезаписывать, компилятор пропустит это, в отличие от абстрактных
        System.out.println("eto metod def");//Дефолтный метод всегда имеет тело
    }//Дефолтный метод нужен для того, чтобы можно было перезаписывать его не во всех классах, а только в тех, где он необходим
    //default в случае с методом это не access modifier, а его дефолтная реализация. на самом деле перед методом стоит по умолчанию модификатор public
    //Создать дефолтный метод можно только в интерфейсе
    //default методы не должны быть static, final или abstract.
}

class Z2 implements I1 {
    public void abc () {
        System.out.println("eto metod abc");
    }

    public static void main(String[] args) {
        Z2 z = new Z2();
        z.abc();
        z.def();//Дефолтные методы можно использовать и без перезаписи
        z.ghi();
    }
    public void ghi () {System.out.println("eto metod ghi");}//Чтобы перезаписать метод, необходимо убрать слово default и добавить public
}
