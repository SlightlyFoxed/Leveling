package Leveling.Lesson_18;

public class Test5 {
    public static void main(String[] args) {
        int array1[] = {1,9,3,-8,0,5,4,1};
        int array2[] = {1,9,3,-8,0,5,4,1};
        int array3[] = array2;
        System.out.println(array1 == array2);//false, так как переменные ссылаются на разные объекты
        System.out.println(array3 == array2);//true, так как переменные ссылаются на один объект
        System.out.println(array1.equals(array2));//false, так как метод .equals не перезаписан в классе Arrays и работает так же как ==
        //array1[array1.length] = 10; //Вызовет ошибку ArrayIndexOutOfBoundsException, так как длина массива 8, а максимальный индекс будет 7.
    }
}
