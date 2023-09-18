package Leveling.Homework.Lesson_22;

public class Student {
    private StringBuilder name;

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder name) {
        StringBuilder sb = new StringBuilder("Имя слишком короткое");
        if (name.length() >= 3) {
            this.name = name;
        }else {
            this.name = sb;
        }
    }

    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course > 0 && course < 5){
            this.course = course;
        }
    }

    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade > 0 && grade <11){
            this.grade = grade;
        }
    }
    public void showInfo (){
        System.out.println("Студент "+getName() + " учится на " + getCourse() + " курсе." + "Его оценка : " + getGrade());
    }
}
class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName(new StringBuilder("Иван"));
        s1.setCourse(3);
        s1.setGrade(8.8);
        Student s2 = new Student();
        s2.setName(new StringBuilder("Николай"));
        s2.setCourse(1);
        s2.setGrade(7.6);
        s1.showInfo();
        s2.showInfo();
    }

}
