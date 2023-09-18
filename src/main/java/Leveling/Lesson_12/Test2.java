package Leveling.Lesson_12;

public class Test2 {
    public static void main(String[] args) {
        int salary = 1500;

        if (salary < 200) {//Условий может быть сколько угодно с помощью операторов &&, ||  и т.д.
            System.out.println("Z/P ochen nizka");
        } else if (salary<400) {
            System.out.println("Z/P srednego razmera");
        } else if (salary<600) {
            System.out.println("Z/P visokaya");
        }else {
            System.out.println("Z/P otlichaya");
        }
    }
}
