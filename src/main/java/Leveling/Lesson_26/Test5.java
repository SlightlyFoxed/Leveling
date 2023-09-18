package Leveling.Lesson_26;

public class Test5 {
    //Non-static and static initializers
    //Initializer block срабатывает каждый раз, когда создается новый объект соответствующего класса
    //Static initializer block срабатывает один раз, когда класс загружается в память
    //Initializer block
        //Если в классе имеется несколько конструкторов, и если необходимо чтобы вне зависимости от конструктора срабатывал определенный код,
        // то данный код можно поместить в Initializer block
        //Так же Initializer block используют анонимные классы
    {System.out.println("Eto init blok 3");}
    Test5 (){
        System.out.println("Eto constructor 1");//При создании объекта сначала срабатывает initializer block, и только потом конструктор
        //То есть initializer block выполняется сразу после вызова супер конструктора. последним будет выполняться тело конструктора класса
    }
    Test5 (int i){
        this();
        System.out.println("Eto constructor 2");
    }
    String s1;
    {
        s1 = "ok";
        System.out.println("Eto init blok 1");
    }
    static {System.out.println("Eto STATIC init blok 1");}//Статические инициализаторы срабатывают самые первые, но один раз, когда объект загружается в память.
    {
        System.out.println("Eto init blok 2");//В зависимости от расположения, инициализаторы будут выполняться по очереди от первого к последнему
    }
    static {System.out.println("Eto STATIC init blok 2");}

    public static void main(String[] args) {
        Test5 t1 = new Test5();//Создан объект класса, сразу срабатывает Initializer block
        Test5 t2 = new Test5(3);//Initializer block срабатывает каждый раз при создании объекта
    }
}
