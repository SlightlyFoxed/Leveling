package Leveling.Homework;

public class Lesson_18_1 {
    public static int[] sortirovka(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) { //цикл необходим для нахождения минимального элемента массива
                    //Выполняется проверка элемент на 1 индексе меньше чем элемент на индексе 0?
                    min = array[j]; //если да, то min = 9, теперь min = 5. цикл продолжается пока min не станет равен -6. min = -6;
                    index = j; // а индекс с 0 становится 1. index = 1. Когда min = -6, index в свою очередь становится 3. index = 3;
                }
            }
            if (i != index) { // i = 0 не равен index = 3? необходимо определить менялся ли минимальный элемент массива, который изначально был минимальным.
                // если на 0 индексе уже стоит минимальный элемент, то нет смысла делать перестановку
                // _a_ вспомогательная переменная для замены местами элементов 9 и -6
                a = array[i];// a = array[i](9) присвоил значение переменной _а_ элемента на 0 индексе.
                array[i] = min; //array[i] = array[j](-6) присвоил элементу на 0 индексе значение минимального элемента на 3 индексе.
                array[index] = a;//array[index(-3)] = a(array[i](9)) присвоил значение элементу на 3 индексе значение которое было на 0 индексе
            }
        }
        return array;

    }

    public static void main(String[] args) {
        int[] array1 = {9, 5, 8, -6, 1};
        sortirovka(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ", ");
        }
    }
}
