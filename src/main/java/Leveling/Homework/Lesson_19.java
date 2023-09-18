package Leveling.Homework;

public class Lesson_19 {
    public static String [] abc (String []...array1){
        int length = 0;
        for (String [] array2 :array1) { //Нахожу длину массивов из параметра
            length += array2.length;
        }
        String [] target = new String[length];//Declaration and allocation. Создаю массив и указываю его длину
        int count = 0;// переменна count будет работать вместо индекса для массива target
        for (String[] array2:array1){
            for (String s:array2) {
                target[count] = s;//присваиваю созданному массиву target значение элементов массивов из параметра
                count++;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        String [] target = abc(new String[]{"ok", "privet","poka"}, new String[] {"ok","hello","bye"});//создан массив target,который является output-ом метода abc

        //теперь необходимо сравнить значения элементов из command line параметров и массива target
        for (String s:args){//внешний цикл будет делать итерацию по каждому элементу массива command line
            for (int i = 0;i<target.length;i++){ //внутренний цикл будет делать итерацию по каждому элементу массива target
                if (s.equals(target[i])){//сравнение элементов.если написать наоборот, то будет выходить NullPointerException,
                    //так как если в массиве target будет элемент со значением null, то сравнивать ничто с другим элементом не будет возможным и появится ошибка
                    target[i] = null;
                }
            }
        }
        for (String s : target){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
