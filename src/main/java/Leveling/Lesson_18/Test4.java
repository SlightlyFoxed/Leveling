package Leveling.Lesson_18;

import java.util.Arrays; //для работы с классом Arrays, чтобы использовать его короткое имя, необходимо его импортировать

public class Test4 {
    public static void main(String[] args) {
        int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        Arrays.sort(array1);//Метод позволяет отсортировать массив от меньшего значения к большему
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        int index1 = Arrays.binarySearch(array1, 5);//Выполняет поиск определенного значения в определенном массиве.Возвращает индекс выбранного значения
        //Если элемент не найден, метод будет возвращать отрицательный индекс.
        //Он подставляет значение в отсортированный массив на то место,где он мог бы быть,после этого вычисляет его индекс и ставит перед ним знак минуса.Затем отнимает 1.
        System.out.println(index1);//Работает корректно в уже отсортированном массиве
    }
}
