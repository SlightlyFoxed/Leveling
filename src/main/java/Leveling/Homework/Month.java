package Leveling.Homework;

public class Month {
    public static void dayQuantity (int n) {
        switch (n){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В месяце 31 день");
                break;
            case 2:
                System.out.println("В месяце 28 дней");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В месяце 30 дней");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

    public static void main(String[] args) {
        Month.dayQuantity(5);
        dayQuantity(0);//Month. в начале можно не использовать так как метод статичный и его вызов происходит в том же классе
        Month.dayQuantity(1);
        dayQuantity(4);
        Month.dayQuantity(-4);
    }
}
