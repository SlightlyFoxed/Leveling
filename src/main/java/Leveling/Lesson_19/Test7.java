package Leveling.Lesson_19;

public class Test7 {
    public static void main(String[] args) {
        //Традиционный цикл for позволял менять значения элементов массива и сами объекты потому что цикла работа идет конкретно с самим элементом массива,
        // а не с переменной, которая ссылается на тот же объект что и элемент массива
        int[] array = {0, 6, 4, 1};
        for (int a : array){//c помощью foreach невозможно поменять значение примитивных типов данных в массиве.
            a = 3;//меняется только переменная _a_ которая с каждой своей итерацией становится равной 3
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");//При этом значения элементов в массиве остаются неизменными
        }
        System.out.println();

        String[] array1 = {"privet","poka", "ok"};
        for (String s : array1){
            s = new String("Hello");
        }
        for (int i = 0; i< array1.length; i++) {//Значения элементов в массиве String вновь остаются неизменными
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("poka");
        StringBuilder sb3 = new StringBuilder("ok");
        StringBuilder[] array2 = {sb1,sb2,sb3};
        for (StringBuilder sb : array2) {
            sb = new StringBuilder("Hello");//Переменная _sb_ хоть и ссылается на новый объект,но элементы в массиве как ссылались на свои объекты, так и ссылаются
            //поэтому их значение не меняется
        }
        for (int i = 0; i< array2.length; i++) {//Значения элементов в массиве StringBuilder вновь остаются неизменными
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        StringBuilder sb4 = new StringBuilder("privet");
        StringBuilder sb5 = new StringBuilder("poka");
        StringBuilder sb6 = new StringBuilder("ok");
        StringBuilder[] array3 = {sb4,sb5,sb6};
        for (StringBuilder sb : array3) {
            sb.append(" java");//С помощью методов возможно менять само значение объекта, но сам объект никаким образом изменить нельзя
        }
        for (int i = 0; i< array3.length; i++) {//Значения элементов в массиве StringBuilder вновь остаются неизменными
            System.out.print(array3[i] + " ");
        }
    }
}
