package Leveling.Lesson_18;

public class Test3 {
    static String s;
    public static void main(String[] args) {
        //Exceptions. Исключения
        //int [] array = new int[-3];// NegativeArraySizeException исключение отрицательного размера массива.
        int [] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        //array[3] = 5;//ArrayIndexOutOfBoundsException Выход за границы массива по его индексу, так как компилятор не знает что у массива нет элемента с индексом 3

        int [][] array2 = new int [3][];
        //System.out.println(array2[0][1]);//NullPointerException. Попытка узнать информацию об объекте, который является null.
        //System.out.println(s.length());//NullPointerException. Попытка узнать информацию об объекте, который является null.

    }
}
