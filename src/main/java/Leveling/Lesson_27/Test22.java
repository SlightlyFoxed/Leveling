package Leveling.Lesson_27;

public class Test22 {
    void abc () throws Exception {//Указание в сигнатуре метода исключения, которое не будет выбрасываться в данном методе не является ошибкой
        System.out.println("ok");
    }//Но пытаться ловить исключение в методе, в сигнатуре которого не указано что он может выбросить ошибку, НЕПРАВИЛЬНО
}
