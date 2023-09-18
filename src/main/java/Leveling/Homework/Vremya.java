package Leveling.Homework;

public class Vremya {
    public static void vremya() {
        int chas = 0;
        OUTER:
        while (chas <= 6) {
            int minuta = -1;
            MIDDLE:
            do {
                minuta++;
                if (chas > 1 && minuta % 10 == 0) {
                    break OUTER;
                }
                int secunda = 0;
                INNER:
                while (secunda < 60) {
                    if (secunda * chas > minuta) {
                        continue MIDDLE;
                    }
                    System.out.println(chas + ":" + minuta + ":" + secunda);
                    secunda++;
                }

            } while (minuta < 59);
            chas++;
        }
    }

    public static void main(String[] args) {
        vremya();
    }
}
