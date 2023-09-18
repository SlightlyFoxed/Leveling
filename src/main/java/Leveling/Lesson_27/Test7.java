package Leveling.Lesson_27;

public class Test7 {
    //Error
    //Error - это очень серьезные ошибки, которые не могут быть напрямую контролированы вашей программой
    //Все Error являются саб классом Error
    //Error-ы могут быть объявлены, но объявлять error-ы считается глупой практикой. Некоторые error-ы могут быть обработаны, но это тоже будет очень глупой затеей.
    // Error-ы, как и runtime исключения считаются unchecked
    static void abc(){
        System.out.println("rabotaet metod abc");
        abc();//Рекурсия. Метод вызывает сам себя, что вызывает переполнение стэка и дальнейшую ошибку
    }

    public static void main(String[] args) {
        /*try {
            abc();//Обрабатывать ошибку не стоит ВООБЩЕ. КОД НЕ ДОЛЖЕН ВЫЗЫВАТЬ ОШИБКУ
        }
        catch (StackOverflowError e){
            System.out.println("Error poyman");
        }*/

    }
}
