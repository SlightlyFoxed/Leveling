package Leveling.Lesson_15;

public class Test7 {
    public static void main(String[] args) {
        int money = 100;

        do {
            System.out.println("Delayte stavku");
            System.out.println("Vi proigrali");
            money-=10;
        }
        while (money > 50);
    }
}
