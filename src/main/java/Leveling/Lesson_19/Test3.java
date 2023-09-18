package Leveling.Lesson_19;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
        for (int i : array) {// форма записи foreach отличается простотой в отличие от традиционного for. Java в дальнейшем все равно переведет foreach в традиционный for
            //в скобках создаем переменную типа данных такого же, как и у типа данных массива.Затем : и имя массива
            //Переменная _i_ поочередно принимает значение каждого элемента массива, пока не достигнет его конца
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
