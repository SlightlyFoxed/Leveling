package Leveling.Lesson_14;

public class Test5 {
    public static void main(String[] args) {
        for (int i = 1;i <=100; i++){
            if (i ==10){
                continue;//Выражение continue заканчивает текущее повторение (iteration) и цикл продолжается
            }
            if (i % 55 == 0){
                break;//Выражение break можно использовать в любом цикле
            }
            System.out.println(i);
        }
    }
}
