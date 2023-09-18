package Leveling.Lesson_16;

public class Test5 {
    public static void main(String[] args) {
        String s = null;// не имеет адрес и не ссылается ни на один объект
        s+="ok";
        System.out.println(s);//при этом возможно сложить его с другим объектом
    }
}
