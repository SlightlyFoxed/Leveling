package Leveling.Lesson_26;

public class Test3 {
    //Method overloading, приоритетность методов
    //Если при вызове метода его параметр лист соответствует нескольким параметр листам overloaded методов, то приоритет их вызова выглядит следующим образом:
    //1. Точное совпадение типов данных
    //2. Поглощающие типы данных (большие типы данных для primitive и parent классы для reference типов)
    //3. Autoboxed типы данных
    //4. Varargs
    //Такой порядок из за обратной совместимости
    //Конвертация типов данных для соответствия параметр листу метода не может происходить в два этапа
    void abc (int i){
        System.out.println("int");
    }
    void abc (byte i){
        System.out.println("byte");
    }
    void abc (long i){
        System.out.println("long");
    }

    void def (Object o){
        System.out.println("Object");
    }
    void def (String o){
        System.out.println("String");
    }

    void ghi (int a,int b){
        System.out.println("Hello 1");
    }
    void ghi (long a,long b){
        System.out.println("Hello 2");
    }
    void ghi (Integer a,Integer b){
        System.out.println("Hello 3");
    }
    void ghi (int ... a){
        System.out.println("Hello 4");
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(5);//Вызвался метод abc (int i), так как 5 по дефолту это int. А компилятор ищет наиболее подходящий метод.
        //Если убрать метод abc (int i), то будет вызван abc (long i), так как если происходит конвертация, то всегда в тип данных больше себя
        //Чтобы был вызван именно abc (byte i), то будет необходимо произвести casting
        t.def("hello");//Будет вызван метод def (String o). Если его не будет, то будет вызван def (Object o)
        t.def(new StringBuilder("hello"));//Будет вызван метод def (Object o)
        System.out.println();
        t.ghi(1,2);//Наиболее подходящий метод ghi (int a,int b)

    }
}
