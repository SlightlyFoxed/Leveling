package Leveling.Lesson_21;

public class Test1 { //Ternary operator
    //(booleanExpression)? expression1 : expression2
    public static void main(String[] args) {
        int a = 4;
        System.out.println((a<4)?7:"privet");//Если _а_ меньше 4  true, то выводи на экран 7, если false то "privet". Типы данных выражений могут быть разными
        int a1 = 5;
        int b1 = 5;
        int c1 = (a1<6)?a1++:b1++;//срабатывает только одно выражение.
        System.out.println("a1= "+ a1);
        System.out.println("b1= "+ b1);
    }
}
