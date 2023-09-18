package Leveling.Lesson_12;

public class Test4 {

    void abc (){
        String str;
        int a = 10;
        if ( a>= 10){
            str = "Privet";
        }
        if (a<10){
            str = "Poka";
        }else {
            str = null;
        }
        System.out.println(str);//Если существует вариант что переменная str не примет никакого значения, то будет ошибка компиляции.
        // только когда все варианты будут учтены, ошибки не будет
    }

    public static void main(String[] args) {
        //ТЕРНАРНЫЙ ОПЕРАТОР TERNARY OPERATOR
        int a = 10;
        int b =20;
        int maximum = (a>b) ? a:b;//Запись if в виде in line.(УСЛОВИЕ)ВОПРОС,вторая операнда если значение true(if true), третья операнда если значение false(if false)
        System.out.println(maximum);
    }
}
