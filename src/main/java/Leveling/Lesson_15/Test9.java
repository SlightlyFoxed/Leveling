package Leveling.Lesson_15;

public class Test9 {

    public static void main(String[] args) {

        int chas = -1;
        OUTER:
        do {
            chas++;//При использовании ключевого слова continue, необходимо обращать пристальное внимание на место где стоит update statement.
            // в данном случае если поставить его в конце, получится бесконечный цикл
            int minuta = 0;
            INNER:
            while (minuta < 60) {
                if (minuta == 20){
                    continue OUTER;
                }
                System.out.println(chas + ":" + minuta);
                minuta++;
            }
        } while (chas < 23);
    }
}
