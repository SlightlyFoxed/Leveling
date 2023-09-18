package Leveling.Lesson_29.Lambdas_2;

import java.util.ArrayList;
//var
//Local variable type inference
public class Test1 {
    //var v = 10;//var нельзя писать вне метода.
    public static void main(String[] args) {
        //TestInferenceType tit = new TestInferenceType();//Есть способ сократить написание создания нового объекта класса с помощью var.
        var tit = new TestInferenceType();//var - локальная переменная типа inference(предположение).
        //Java достаточно умна чтобы на основе правой части,а именно конструктора класса-new TestInferenceType();,понять,что тип переменной tit будет TestInferenceType
    //var относится только к локальным переменным.
        var i = 10;//компилятор понимает что var это int
        var w = 1.5f;//компилятор понимает что var это float
        var array = new String[]{"a","b"};//компилятор понимает что var это массив типа String
        var result = abc();//компилятор понимает что метод abc() возвращает double, поэтому result тоже будет типа данных double. (var = double)
        Object obj1 = "privet";
        var obj2 = obj1;
        ArrayList <String> aL = new ArrayList<>();
        for (var s:aL){//Компиляор понимает что aL это ArrayList содержащий String, поэтому _s_ будет типа данных String. (var = String)
            System.out.println(s);
        }
        //var h; //для переменной var нужно сразу придавать какое то значение.
        //var n = null;//тип данных у null  не определен, поэтому так писать тоже нельзя
        //var array1 = {1, 2}//Необходимо писать new int [], так как компилятор должен понять какой тип данных должен быть вместо var
        //var [] array2 = new int [] {1, 2}// написание после var [] является избыточным
    }
    static double abc () {
        return 3.14;
    }
    /*static double abc (var a) {//var нельзя писать в параметрах метода. Компилятор не может определить тип данных который необходимо использовать
        return 3.14;
    }*/
    /*static var abc () {//так же нельзя использовать var вместо return type метода.
        return 3.14;
    }*/
}

class TestInferenceType {}

interface I {//Это функциональный интерфейс, так как он содержит в себе 1 абстрактный метод.
    // В нем может быть сколько угодно дефолтных и static методов, функциональным интерфейс быть не перестанет
    void abc ();
    default void def1 () {};
    default void def2 () {};
    static void  def3 (){};
}
