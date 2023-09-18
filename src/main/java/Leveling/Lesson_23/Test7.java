package Leveling.Lesson_23;

public class Test7 {
}
class Animal1 {
    static String showName (){
        return "some Animal";
    }
    void showInfoAboutAnimal (){
        System.out.println("Name of animal: " + showName());
    }
}
class Mouse1 extends Animal1 {
    static String showName (){//Так как оба метода static с ними начинает работать Compile time binding и разделяет их работу на два класса.
        return "Jerry";
    }
    void showInfoAboutMouse (){
        System.out.println("Name of animal: " + showName());
    }

    public static void main(String[] args) {
        Mouse1 a = new Mouse1();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse();
    }
}
