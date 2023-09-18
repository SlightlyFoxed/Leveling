package Leveling.Lesson_23;

public class A10 {
    String s1 = "privet";//Если переменная не будет видна в дочернем классе, то ключевое слово super работать не будет
    static double d1 = 3.14;
    int summa (int ... i){
        int result = 0;
        for (int a : i){
            result+=a;
        }
        return result;
    }
    static void abc () {
        System.out.println("static method");
    }

}
class B10 extends A10 {
    String s1 = super.s1 + ", drug!";// super используется для обращения к переменным и методам из parent класса
    //Как правило super нужен для того, чтобы обратится к переменной, которая является hide. Или если необходимо чтобы переменная из саб класса имела такое же имя
    //static String s2 = super.s1;//Статической переменной нельзя назначить переменную, которая связана с созданием объекта
    double d1 = super.d1;//Но с помощью super можно назначить значение статической переменной.Потому что с помощью объекта можно обратиться к статической переменной
    int summa (int ... i){//Чтобы перезаписать метод не обязательно целиком переписывать его в саб класс и там производить изменения.
        int result = super.summa(i);//Можно воспользоваться ключевым словом super и обратиться к методу супер класса, и подставить его значение для вывода
        System.out.println("Summa: " + result);
        super.abc();//Так же в non-static методе с помощью super можно вызвать static метод из супер класса
        return result;
    }

    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s1);
        //System.out.println(super.s1);//super нельзя употреблять в static методах, например в main, так как static методы могут вызываться без создания объекта,
        //а super ссылается на объект супер класса
    }

}
