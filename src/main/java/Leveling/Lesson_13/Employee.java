package Leveling.Lesson_13;

public class Employee {
    public static void main(String[] args) {
        int denNedeli = 3;
        final int a = 1;
        final int b = 2;
        switch (denNedeli){//Типы данных switch expression : byte, short, int, char, String
            case 1://Пример когда не использовать break можно с пользой

            case 2://В кейсах всегда должна использоваться compile time constant

            case a+b://В кейсе можно использовать выражение переменных a*b только если ранее они были объявлены и являются final

            case 4:

            case 5:
                System.out.println("Rabota do 18:00");
                break;
            case 6:
                System.out.println("Rabota do 14:00");
                break;
            case 7:
                System.out.println("Raboti net");
                break;
            default:
                System.out.println("Takogo dnya ne sushestvuet");
        }

        switch ("sreda"){
            case "ponedelnik"://В кейсе с типом данных String нельзя использовать null

            case "vtornik":

            case "sreda":

            case "chetverg":

            case "pyatnica":
                System.out.println("Rabota do 18:00");
                break;
            case "subbota":
                System.out.println("Rabota do 14:00");
                break;
            case "voskresenye":
                System.out.println("Raboti net");
                break;
            default:
                System.out.println("Takogo dnya ne sushestvuet");
        }
    }
}
