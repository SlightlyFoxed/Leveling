package Leveling.Lesson_29;
import java.util.ArrayList;
import java.util.function.*;
public class Test7 {
}
class Student2 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student2 (String name,char sex, int age,int course,double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}
class StudentInfo2 {
    void printStudent(Student2 st) {
        System.out.println("Imya studenta: " + st.name + ", pol: " + st.sex + ", vozrast: " + st.age + ", kurs: " + st.course + ", srednyaya ocenka: " + st.avgGrade);
    }

    void testStudents(ArrayList<Student2> aL, Predicate<Student2> t) {
        for (Student2 s : aL) {
            if (t.test(s)) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();
        Student2 st1 = new Student2("Ivan", 'm', 22, 3, 8.3);
        Student2 st2 = new Student2("Nikolay", 'm', 28, 2, 6.4);
        Student2 st3 = new Student2("Elena", 'f', 19, 1, 8.9);
        Student2 st4 = new Student2("Petr", 'm', 35, 4, 7);
        Student2 st5 = new Student2("Mariya", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo2 si = new StudentInfo2();
        //Метод класса ArrayList - removeIf использует в параметре Predicate <T>
        for ( Student2 s : list){
            System.out.println(s.name);
        }
        System.out.println("-------------------------");
        list.removeIf(x->x.name.endsWith("a"));//x-это параметр метода.В этом ArrayList в дженерике указан тип Student, значит x будет только Student
        //и удалять кроме Student никого не получится.Дальше идет выражение: Если имя заканчивается на "а" (true), то объект Student будет удален из ArrayList
        for ( Student2 s : list){
            System.out.println(s.name);
        }
    }
}
