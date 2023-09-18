package Leveling.Lesson_18;

public class Test7 {
    public static void main(String[] args) {
        char [] array = {'p','r','i','v','e','t'};
        String s = new String(array);//Чтобы создать String, можно использовать в его параметре массив типа char
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Hello World");
        sb.append(array,2,3);//Метод позволяет добавить символы из массива.
        // Указывается массив, затем индекс символа с которого начнется добавление и потом указывается количество символов
        System.out.println(sb);
        sb.insert(2,array,1,3);//Позиция на которую будут вставлены символы.
        // Массив из которого будут взяты символы, затем индекс символа с которого начнется добавление и потом указывается количество символов
        System.out.println(sb);
    }
}
