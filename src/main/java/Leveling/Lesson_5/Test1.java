package Leveling.Lesson_5;

public class Test1 {
    int summa (int a, int b, int c) {//при создании метода указываем тип данных который он будет возвращать.Затем название.
        // в круглых скобках параметры которые будет использовать метод.далее тело
        int result = a+b+c;
        return result;//возвращаем output. тип данных всегда должен совпадать с типом данных метода
    }
    int sredneeArifm (int a1, int b1, int c1){ //на метод внутри метода действует правило LiFo Last in First out.
        // метод не сможет завершить работу, пока не завершит работу метод внутри него
        int result2 = summa(a1,b1,c1)/3;
        return result2;
    }
}
class Test1_1{
    public static void main(String[] args) {
        Test1 t = new Test1();
        int summaTrexChisel =t.summa(5,4,8);//в скобках пишем аргументы. они должны совпадать по типу данных и количеству с параметрами метода
        System.out.println(summaTrexChisel);
        System.out.println(t.summa(2,6,19));//без создания дополнительной переменной summaTrexChisel
        System.out.println(t.sredneeArifm(20,40,60));
    }
}
