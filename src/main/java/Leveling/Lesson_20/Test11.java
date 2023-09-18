package Leveling.Lesson_20;

import java.util.Arrays;

//compare - методы для работы с массивами имеющих как примитивный так и ссылочный тип данных
//mismatch - оба метода это лексикографическое сравнение (если значение идет раньше, то оно меньше. Пример: первым будет идти число 12345 а за ним будет 1235
//Префикс это общая часть двух массивов. У "12345" и "1234" префиксом будет "123". У привет и прививка префиксом будет "прив"
public class Test11 {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {1,2,3,5};
        int [] array8 = {1,2,3,4,5};

        char [] array3 = {'p','r','i','v','e','t'};
        char [] array4 = {'p','r','i','v','i','v','k','a'};
        char [] array5 = {'p','r','i','v','e','t','o'};
        char [] array6 = null;
        char [] array7 = null;

        System.out.println(Arrays.compare(array1, array2));//Метод сравнивает два массива, и если первый массив по значению идет раньше, значит он меньше
        // чем второй массив, и в выводе будет число с минусом. если первый массив больше второго, число будет с плюсом. если равны, в выводе будет 0
        System.out.println(Arrays.compare(array1, array8));
        System.out.println(Arrays.compare(array3, array4));
        System.out.println(Arrays.compare(array3, array5));
        System.out.println(Arrays.compare(array3, array6));//nullArray reference всегда меньше not null
        System.out.println(Arrays.compare(array7, array6));//два массива с значением null будут равны
        System.out.println(Arrays.mismatch(array1, array8));//метод .mismatch находит индекс первого расхождения массивов или -1 если они одинаковые
        System.out.println(Arrays.mismatch(array1, array2));
        System.out.println(Arrays.mismatch(array3, array4));
    }
}
