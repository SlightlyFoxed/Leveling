package Leveling.Lesson_20;
import java.util.ArrayList;
public class Test3 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("privet");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        for (int i = 0; i<list.size(); i++){
            list.get(i).append("!!!");//С помощью метода .append и классического for можно добавить каждому элементу в конце "!!!"
        }
        for (StringBuilder sb : list){
            System.out.print(sb + " ");
        }
        System.out.println();
        list.remove(2);//Метод позволяет удалить элемент по его индексу из ArrayList. В output будет значение этого элемента
        for (StringBuilder sb : list){
            System.out.print(sb + " ");
        }
        list.remove(sb1);//Метод так же позволяет удалить объект по его короткому имени из ArrayList. В output будет true если объект успешно удален
    }
}
