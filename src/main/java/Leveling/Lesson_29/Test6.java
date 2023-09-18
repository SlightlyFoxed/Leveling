package Leveling.Lesson_29;
import java.util.ArrayList;
import java.util.function.*;//Нужен для использования интерфейса Predicate
//public interface Predicate <T> {//это встроенный интерфейс, в дженерик которого подставляется тип объекта.
//boolean test (T t);} // на второй строке происходит автозамена и вместо Т будет тип объекта из дженерика
//Predicate это функциональный интерфейс, т.е. имеет один абстрактный метод test, который принимает T, а возвращает boolean.
//Predicate это интерфейс который проверяет разные условия и содержит в себе единственный абстрактный метод test
public class Test6 {
}
class Student1 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student1 (String name,char sex, int age,int course,double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}
class StudentInfo1 {
    void printStudent (Student1 st) {
        System.out.println("Imya studenta: "+ st.name + ", pol: " + st.sex + ", vozrast: "+ st.age + ", kurs: "+ st.course+ ", srednyaya ocenka: "+st.avgGrade);
    }
    void testStudents (ArrayList<Student1> aL, Predicate <Student1> t){//Интерфейс predicate позволяет использовать встроенный интерфейс, вместо создания своего
        //при этом в выводе все работает так же как с созданным интерфейсом.
        for (Student1 s :aL){
            if (t.test(s)){
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Student1> list = new ArrayList<>();
        Student1 st1 = new Student1("Ivan", 'm', 22,3,8.3);
        Student1 st2 = new Student1("Nikolay", 'm', 28,2,6.4);
        Student1 st3 = new Student1("Elena", 'f', 19,1,8.9);
        Student1 st4 = new Student1("Petr", 'm', 35,4,7);
        Student1 st5 = new Student1("Mariya", 'f', 23,3,9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo1 si = new StudentInfo1();

        si.testStudents(list,(Student1 st10) -> {return st10.avgGrade > 8.5;});
        System.out.println("---------------------------------");
        si.testStudents(list,st10 -> st10.avgGrade < 9);
        System.out.println("---------------------------------");
        si.testStudents(list,(Student1 st10) -> st10.age > 25);
        System.out.println("---------------------------------");
        si.testStudents(list,st10 -> {return st10.age < 27;});
        System.out.println("---------------------------------");
        si.testStudents(list,(Student1 st10) -> {return st10.sex == 'm';});
        System.out.println("---------------------------------");
        si.testStudents(list,(Student1 st10) -> {return st10.avgGrade > 7.2 && st10.age < 23 && st10.sex == 'f';});
        System.out.println("---------------------------------");


    }
}

