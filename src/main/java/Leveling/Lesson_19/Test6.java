package Leveling.Lesson_19;

public class Test6 {
    public static void main(String[] args) {
        int[][] array = {{3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3}};//foreach для двумерных массивов
        for (int[] array2 : array) {//Элементом двумерного массива array является одномерный массив array2
            for (int a : array2) {
                System.out.print(a + " ");
            }

        }
    }
}
