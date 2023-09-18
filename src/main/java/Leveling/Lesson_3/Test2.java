package Leveling.Lesson_3;

public class Test2 {
    public static void main(String[] args) {
        int x=5;
        int y=3;
        int z= x-++y;//префикс сначала изменяет значение, и затем используется, постфикс сначала используется а затем меняется значение
        System.out.println(z);
        System.out.println(y);

    }
}
