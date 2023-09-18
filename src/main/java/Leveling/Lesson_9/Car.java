package Leveling.Lesson_9;

public class Car {
    String color;//Instance variable или object variable. принадлежат объекту. Могут использоваться и внутри класса и внутри метода
    String engine;
    static int count;//Static variable принадлежит всему классу
    public static int ab = 10;

    public Car (String color,String engine) {//Области видимости параметров и instance переменных различаются.если нужно написать параметр в виде color а не color2
        // В этом случае необходимо использовать ключевое слово this.
        int x = 10;//У локальных переменных НЕТ дефолтного значения
        count++;
        this.color = color;
        this.engine = engine;
    }

    public void showColor(){
        System.out.println("Cvet mashini: " + color);
        changeColor("red");
    }
    public void changeColor1 (String color3){//parameter Параметр виден только в блоке метода.
        System.out.println("Cvet mashini izmenilsa");
        int cena = 5000;//Local variable локальная переменная, видна только в теле метода в котором используется.
        color = color3;
        cena+=1000;
    }
    void changeColor (String color){
        //System.out.println(color);//Если использовать название переменной в выводе метода,
        // то будет вызван параметр с таким же именем, который принимает метод, а не instance переменная
        System.out.println(this.color);

    }

    public static void main(String[] args) {
        Car c = new Car("red","v6");
        System.out.println(c.color);
        c.changeColor("black");
        System.out.println(c.color);

    }
}
