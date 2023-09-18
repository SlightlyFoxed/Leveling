package Leveling.Lesson_19;

public class Test8 {
    public static void main(String[] args) {
        int [] array = new int [4]; // Динамическая инициализация НЕВОЗМОЖНА с помощью foreach цикла
        for (int i = 0; i<array.length; i++){//По дефолту значения элементов в созданном массиву равны 0,ситуация будет та же,что и с инициализированным массивом
            array[i] = i*10;
        }
        for (int a:array){
            System.out.print(a + " ");
        }

    }
}
