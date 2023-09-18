package Leveling.Homework;

public class Lesson_14 {
    public static void chasi(){
        OUTER:for(int chas = 0; chas<=6;chas++){
            MIDDLE:for (int minuta = 0; minuta<=59;minuta++){
                if (chas > 1 && minuta%10==0){//Чтобы избежать ненужных проверок в выражении if, оно перемещено в MIDDLE цикл,
                    // так как в INNER цикле проверка происходила бы всегда, при переходе на новую секунду
                    break OUTER;
                }
                INNER:for (int secunda = 0; secunda <=59;secunda++){

                    if (secunda*chas > minuta){
                        continue MIDDLE;
                    }
                    System.out.println(chas + ":" + minuta + ":" + secunda);

                }
            }
        }
    }

    public static void main(String[] args) {
        chasi();
    }
}
