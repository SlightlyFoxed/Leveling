package Leveling.Lesson_11;

public class Student {
    public String name;
    public int course;
    public double grade;

    public Student (String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
    public static void swap (Student s1, Student s2){//метод чтобы поменять местами 2 объекта, не работает.
        //Так как если внутрь параметра подставляется референсный тип данных, на самом деле подставляется не сам референс а его копия
        Student s3 = s1;
        s1 = s2;//Копии поменялись местами
        s2 = s3;//Как только метод перестанет работать, копии так же перестанут существовать.
    }
    public static void changeName (Student s1) {//Если в параметры метода подставляется референсный тип данных, на самом деле подставляется не сам объект а его копия
        s1.name = "Vasiliy";//С помощью копии произошла замена имени в объекте, на который ссылалась копия
        //и как только метод закончился, копия так же перестала существовать, но смена имени уже произошла

    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Ivan", 3, 9.5);
        swap(st1, st2);
        System.out.println(st1.name);
        System.out.println(st2.name);
        changeName(st2);//С помощью копий возможно изменить элементы, но не возможно изменить сам объект
        System.out.println(st2.name);
        StudentTest s = new StudentTest();
        s.sravnenie(st1,st2);
        s.sravnenie2(st1,st2);
    }
}
class StudentTest{
    public static void sravnenie (Student st1,Student st2){
        if (st1.name.equals(st2.name) && st1.grade == st2.grade && st1.course == st2.course){
            System.out.println("Студенты равны");
        }else {
            System.out.println("Студенты не равны");}
    }
    public static void sravnenie2 (Student st1, Student st2){
        if (st1.grade == st2.grade){
            if (st1.course == st2.course){
                if (st1.name.equals(st2.name)) {
                    System.out.println("У студентов одинаковые оценки, учатся на одном курсе и одинаковые имена ");

                }else {
                    System.out.println("У студентов одинаковые оценки, учатся на одном курсе и разные имена ");
                }

            }else {
                System.out.println("У студентов одинаковые оценки, учатся на разных курсах и разные имена ");
            }
        }else {
            System.out.println("У студентов разные оценки, учатся на разных курсах и разные имена ");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 3, 9.5);
        Student s2 = new Student("Ivan", 3, 9.5);
        sravnenie(s1,s2);
        sravnenie2(s1,s2);
    }
}
