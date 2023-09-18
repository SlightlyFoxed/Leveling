package Leveling.Lesson_27;

public class Test2 {
    //Сабклассы RuntimeException = unchecked exceptions

    void abc () throws NullPointerException{//throws NullPointerException этой записью объявляется(предупреждается), что этот метод может выбросить исключение.
        // Может выбросить, может не выбросить.
        //Но Runtime исключения можно не объявлять и не обрабатывать, так как это ошибка программиста
        String s = null;
        System.out.println(s.length());
    }
    public static void main(String[] args) throws NullPointerException {
        int array [] = {1,4,0};
        String s = null;
        //System.out.println(s.length());//unchecked exceptions
        //System.out.println(array[5]);//unchecked exceptions
        System.out.println("Hello");
    }
    //Runtime исключения бывают в коде, в котором присутствуют ошибочные выражения. Т.е. в выбросе данных исключений виноват программист.
    // Компилятор НЕ в состоянии проверить возможность выброса runtime исключений
    //Runtime исключения можно не объявлять и не обрабатывать, но при желании можно сделать и то, и другое.
}
