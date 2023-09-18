package Leveling.Lesson_18;

public class Test2 {
    public static void main(String[] args) {
        //Динамическая инициализация.
        int [] array , a;//Если [] стоит до наименования массива, то последующее за ним наименование тоже будет считаться массивом
        int b [],c;// в этом же случае массивом является только _b_. А _c_ это переменная типа int
        c = 5;
        int d1[], e1[][];// _d_ является одномерным массивом, _e_ будет являться двухмерным массивом
        int [] d, e [][];//В таком варианте записи _e_ будет являться не двухмерным а ТРЕХМЕРНЫМ массивом, так как [] стоит до _d_
        String[] array1;
        int[][] array2;
        int [] array3 [];//[] можно ставить как до наименования массива так и после

        array1 = new String[3];
        array2 = new int[3][];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = "privet" + i;
            System.out.println(array1[i]);
        }
        array2[0] = new int[5];//Определение размера каждого одномерного массива
        array2[1] = new int[2];
        array2[2] = new int[7];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++){
                array2[i][j] = i+j;
                System.out.println(array2[i][j]);
            }
        }
        //Смешанные варианты создания массива
        int [] array4 = new int [7];//Declaration and Allocation. Инициализации не происходит

        int [] array5 ={1,2,3};//Declaration, Allocation and Initialisation. 3 в 1. компилятор сам посчитает размер массива
        int [] array7 = new int[]{1,2,3};//Вторая, более длинная запись предыдущего способа. НЕ УКАЗЫВАЕТСЯ ДЛИНА МАССИВА
        //НЕЛЬЗЯ ДВАЖДЫ ЯВНО ИЛИ НЕ ЯВНО УКАЗЫВАТЬ ДЛИНУ МАССИВА

        int [] array6;//Declaration
        array6 = new int[]{1,2,3};//Allocation and Initialisation. Используется в случае если изначально не известно какие значения будут использованы в массиве
    }
}
