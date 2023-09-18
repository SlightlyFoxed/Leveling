package Leveling.Lesson_14;

public class Test6 {
    public void time () {
        OUTER:for (int chas = 0; chas<=23;chas++){
            System.out.println("Nachalo outer loopa");
            INNER: for (int minuta = 0; minuta<=59; minuta++){
                System.out.println(chas + ":" +minuta);
                if (minuta == 30){
                    break OUTER;//Чтобы завершить именно внешний цикл,
                    // необходимо назвать циклы (label) и после ключевого слова break уточнить какой цикл должен завершиться. По умолчанию завершается внутренний
                }
            }
            System.out.println("Konec outer loopa");
        }
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.time();
    }
}
