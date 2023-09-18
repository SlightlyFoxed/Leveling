package Leveling.Lesson_29;

import java.util.ArrayList;

public class Test3 {
    //Функциональное программирование с помощью лямбды
}
class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student (String name,char sex, int age,int course,double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}
class StudentInfo {
    void printStudent (Student st) {
        System.out.println("Imya studenta: "+ st.name + ", pol: " + st.sex + ", vozrast: "+ st.age + ", kurs: "+ st.course+ ", srednyaya ocenka: "+st.avgGrade);
    }
    void testStudents (ArrayList<Student> aL, StudentChecks sc){
        for (Student s :aL){
            if (sc.test(s)){
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22,3,8.3);
        Student st2 = new Student("Nikolay", 'm', 28,2,6.4);
        Student st3 = new Student("Elena", 'f', 19,1,8.9);
        Student st4 = new Student("Petr", 'm', 35,4,7);
        Student st5 = new Student("Mariya", 'f', 23,3,9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo si = new StudentInfo();

        si.testStudents(list,(Student st10) -> {return st10.avgGrade > 8.5;});//Лямбда выражение позволяет не создавать отдельно классы,
        // имплементируя в них интерфейс, чтобы перезаписать в них метод интерфейса, и затем создавать объект этого класса, чтобы применить его в методе.
        //Лямбда выражение обращается напрямую к методу интерфейса и сразу его перезаписывает.
        // Но Java позволяет использовать лямбда выражение только когда идет работа с интерфейсом, у которого ТОЛЬКО ОДИН метод.
        // В противном случае она не поймет какой метод имеется в виду
        //В лямбда выражении справа от оператора стрелка находится тело метода,
        // которое было бы у метода соответствующего класса, имплементировавшего наш интерфейс с единственным методом
        //Левая часть лямбда выражения может быть написана в краткой форме, если метод интерфейса принимает только 1 параметр.
        // Даже если метод интерфейса принимает только 1 параметр, но в лямбда выражении хочется написать данный параметр используя его тип данных,
        // тогда уже нужно писать левую часть лямбда выражения в скобках
        //Если в правой части лямбда выражения пишется более одного statement-а, то необходимо использовать его полный вариант написания
        System.out.println("---------------------------------");
        si.testStudents(list,st10 -> st10.avgGrade < 9);//Самый короткий стиль написания лямбда выражения
        System.out.println("---------------------------------");
        si.testStudents(list,(Student st10) -> st10.age > 25);//В лямбда выражении оператор стрелка разделяет параметры метода и тело метода
        System.out.println("---------------------------------");
        si.testStudents(list,st10 -> {return st10.age < 27;});
        System.out.println("---------------------------------");
        si.testStudents(list,(Student st10) -> {return st10.sex == 'm';});
        System.out.println("---------------------------------");
        si.testStudents(list,(Student st10) -> {return st10.avgGrade > 7.2 && st10.age < 23 && st10.sex == 'f';});
        System.out.println("---------------------------------");


    }
}
interface StudentChecks {//Функциональный интерфейс - это интерфейс который имеет в своем теле лишь 1 метод.
    // Это интерфейсы, которые пригодны для функционального программирования
    boolean test (Student s);
}

