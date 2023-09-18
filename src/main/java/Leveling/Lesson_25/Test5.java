package Leveling.Lesson_25;

public class Test5 {
    public static void main(String[] args) {
        String [] array1 = {"privet", "poka"};
        Object [] array2 = array1;//Любой массив является массивом типа Object. По сути произошел автоматический Upcasting
        String [] array3 = (String[]) array1;//Downcasting
        //array3[0] = new StringBuilder("ok");//Невозможная запись
        //array2[0] = new StringBuilder("ok");//Компилятор пропустит такую запись из за автокаста, но run time выдаст ошибку
    }
}
