package Leveling.Homework;

public class Lesson_5_1_BankAcc {
    int id;
    String name;
    double balance;

    double popolnenieScheta (double dengi){
        System.out.println("Баланс " + name + " до пополнения: " + balance );
        System.out.println("Баланс пополняется на " + dengi);
        balance += dengi;
        System.out.println("Баланс " + name + " после пополнения: " + balance );
        System.out.println();
        return balance;
    }
    double snyatieSoScheta (double dengi){
        System.out.println("Баланс " + name + " до снятия: " + balance );
        System.out.println("Баланс изменяется на " + dengi);
        balance -= dengi;
        System.out.println("Баланс " + name + " после снятия: " + balance );
        System.out.println();
        return balance;
    }




}
class Lesson_5_1_BankAccTest{
    public static void main(String[] args) {

        Lesson_5_1_BankAcc MyAccount = new Lesson_5_1_BankAcc();
        Lesson_5_1_BankAcc YouAccount = new Lesson_5_1_BankAcc();
        Lesson_5_1_BankAcc HisAccount = new Lesson_5_1_BankAcc();

        MyAccount.id = 1;
        MyAccount.name = "Ilya";
        MyAccount.balance = 30.35;

        YouAccount.id = 2;
        YouAccount.name = "Ivan";
        YouAccount.balance = 12.45;

        HisAccount.id = 3;
        HisAccount.name = "Mike";
        HisAccount.balance = 29.65;

        HisAccount.snyatieSoScheta(12.00);
        MyAccount.popolnenieScheta(50.20);

    }

}
