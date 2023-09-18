package Leveling.Homework;

public class Student {
    int id;
    String name;
    String surname;
    int course;
    double MidMath;
    double MidEcon;
    double MidLang;
    Student (){};
    Student (int id1,String name1, String surname1,int course1){
        this(id1,name1,surname1,course1,0.0,0.0,0.0);
    }

    Student (int id2,String name2, String surname2,int course2,double MidMath2,double MidEcon2,double MidLang2){
        id = id2;
        name = name2;
        surname = surname2;
        course = course2;
        MidMath = MidMath2;
        MidEcon = MidEcon2;
        MidLang = MidLang2;
    }


}
class StudentTest{

    double MidGrade (Student st){
        double sredOcenka = (st.MidEcon + st.MidMath + st.MidLang)/3;
        System.out.println("Средняя оценка студента " + st.name + " " + st.surname + ": " + sredOcenka);
        return sredOcenka;
    }
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.id = 1;
        st1.name ="Ivan";
        st1.surname = "Ivanov";
        st1.course = 3;
        st1.MidMath = 4.5;
        st1.MidEcon = 3.7;
        st1.MidLang = 4.1;
        Student st2 = new Student();
        st2.id = 2;
        st2.name ="Petr";
        st2.surname = "Zakharov";
        st2.course = 2;
        st2.MidMath = 5.0;
        st2.MidEcon = 4.3;
        st2.MidLang = 4.6;
        Student st3 = new Student();
        st3.id = 3;
        st3.name ="Dima";
        st3.surname = "Fedorov";
        st3.course = 5;
        st3.MidMath = 3.6;
        st3.MidEcon = 4.7;
        st3.MidLang = 4.2;
        Student st4 = new Student();
        st4.id=4;
        st4.name = "Nikolay";
        st4.surname = "Sidorov";
        st4.course = 5;
        st4.MidMath = 4.4;
        st4.MidEcon = 4.6;
        st4.MidLang = 4.1;
        Student st5 = new Student(5,"Stanislav","Petrov",3);
        st5.MidMath = 4.5;
        st5.MidEcon = 4.0;
        st5.MidLang = 3.9;
        Student st6 = new Student(6,"Ivan","Zanin",2,5.0,4.1,3.9);
        StudentTest sTest = new StudentTest();
        sTest.MidGrade(st1);
        sTest.MidGrade(st2);
        sTest.MidGrade(st3);
        sTest.MidGrade(st4);
        sTest.MidGrade(st5);
        sTest.MidGrade(st6);

    }
}