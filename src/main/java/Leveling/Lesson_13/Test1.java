package Leveling.Lesson_13;

public class Test1 {
}
class Student {
    int grade;
    Student (int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(2);
        if (st1.grade==2){
            System.out.println("Student dvoechnik");
        } else if (st1.grade == 3) {
            System.out.println("Student troechnik");
        } else if (st1.grade == 4) {
            System.out.println("Student horoshist");
        }else if(st1.grade == 5){
            System.out.println("Student otlichnik");
        }else {
            System.out.println("Ocenka ne verna");
        }
        switch (st1.grade){// Синтаксис switch statement. Типы данных switch expression : byte, short, int, char, String
            case 2:
                System.out.println("Student dvoechnik");
                break;//Нужен для выхода из тела switch,иначе будут выполняться все кейсы,пока не встретится ключевое слово break или пока не закончится тело switch
            case 3:
                System.out.println("Student troechnik");
                break;
            case 4:
                System.out.println("Student horoshist");
                break;
            case 5:
                System.out.println("Student otlichnik");
                break;
            default://Срабатывает тогда, когда не срабатывает ни один из кейсов или отсутствует break в предыдущем кейсе
                System.out.println("Ocenka ne verna");
        }
    }
}
