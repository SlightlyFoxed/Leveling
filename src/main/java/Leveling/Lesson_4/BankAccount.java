package Leveling.Lesson_4;

public class BankAccount { //класс BankAccount по сути является типом данных (ссылочный тип данных)
    int id;//эти переменные являются instance переменными, то есть переменными объекта
    String name;//Если присвоить значения этим переменным то у всех созданных объектов будут эти значения по умолчанию вместо дефолтных 0 и null
    double balance;


}
class BankAccountTest{
    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();// Тип данных\Имя переменной = значение
        BankAccount YouAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Ilya";
        MyAccount.balance = 30.35;

        YouAccount.id = 2;
        YouAccount.name = "Ivan";
        YouAccount.balance = 12.45;

        HisAccount.id = 3;
        HisAccount.name = "Mike";
        HisAccount.balance = 29.65;

        System.out.println(MyAccount.id);
    }

}
