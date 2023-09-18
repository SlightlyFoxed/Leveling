package Leveling.Lesson_27;

public class Test4 {
    public static void main(String[] args) {
        int [] array = {4,8,1};
        System.out.println("U nas est massiv");

        //В теле метода try находится код, который будет работать в нормальном порядке
        try {//Попытка вывести 5-й элемент массива, которого не существует
        System.out.println(array[5]);//На этом этапе java выбрасывает ArrayIndexOutOfBoundsException, и тело метода завершается
        System.out.println("Vsem xoroshego dnya!");
        }
        //метод catch ловит исключение, которое выбрасывается. в параметрах указывается какой тип исключения метод должен ловить
        catch (ArrayIndexOutOfBoundsException e){//Как только выбросилось исключение, метод catch ловит его и выполняется тело метода catch
            System.out.println("Bil poyman exception  " + e);
        }
        finally {//finally block обрабатывается всегда, вне зависимости от того работал код в нормальном порядке или был пойман exception методом catch
            System.out.println("eto finally block");
        }
        System.out.println("Etot kod uje ne imeet otnosheniya k isklyucheniyam");
    }
}
