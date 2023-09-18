package Leveling.Lesson_19;

public class Test2 {//Variable arguments
    //В параметре можно указывать не только varargs параметр, но и другие параметры тоже.
    //Но в листе параметров может быть только один varargs
    //Так же varargs должен стоять в листе параметров самым последним
    static void summa (String s,int ... a){// для того, чтобы метод можно было вызывать с любым количеством параметров, используется запись (int ... a)
        // на самом деле java за кулисами переводит этот varargs в массив, но с varargs быстрее и проще работать чем с массивом
        int summa =0;
        for (int i = 0; i<a.length;i++){
            summa+=a[i];
        }
        System.out.println(summa);
        System.out.println(s);
    }
    static void summa1 (int [] a){
        // по сути это будет то же самое, если бы в параметре был массив типа int, но при использовании метода, в параметре нужно будет использовать массив
        int summa =0;
        for (int i = 0; i<a.length;i++){
            summa+=a[i];
        }
        System.out.println(summa);
    }
    public void abc (int []...array){};//с помощью varargs в параметр можно вписать любое количество массивов

    public static void main(String[] args) {
        summa("ok",6,8,7,5);
        summa1(new int []{3,5,6,4});
        summa("ok",new int []{3,5,6,4});//запись массива в параметре так же работает с varargs, это доказывает то, что java переводит varargs в массив
    }
}
