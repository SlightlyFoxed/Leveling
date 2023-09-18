package Leveling.Lesson_23;

public class Test5 {
    void abc (Animal a){
        System.out.println("A");
    }
    void abc (Mouse m){
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        Animal an = new Mouse();//ВCE переменные определяются Compile time binding. Run time binding используется только для методов
        t.abc(an);//Здесь не нужна Run time проверка, потому что _an_ используется как простая переменная типа Animal,
        // поэтому метод будет использован который принимает в параметр переменную типа Animal
        an.getName();//Здесь же Run time определяет что переменная ссылается на объект new Mouse, поэтому метод будет использован класса Mouse
    }
}
class Animal{
    void getName (){
        System.out.println("Animal");
    }
}
class Mouse extends Animal {
    void getName () {
        System.out.println("Mouse");
    }
}
