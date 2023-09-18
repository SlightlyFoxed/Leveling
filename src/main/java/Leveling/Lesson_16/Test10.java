package Leveling.Lesson_16;

public class Test10 {
    public static void main(String[] args) {

        String x = "privet";//Занесение объекта "privet" в String Pool
        String y = " privet".trim();//Занесение объекта " privet" в String Pool. не смотря на то, что метод .trim уберет пробел, это так же останется новым объектом
        System.out.println(x==y);//false
        System.out.println(x.equals(y));//true
    }
}
