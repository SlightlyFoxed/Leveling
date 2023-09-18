package Leveling.Lesson_3;

public class Test3 {
    public static void main(String[] args) {
        int a = 5;// = оператор присваивания
        a = a + 3;
        a += 3;// упрощенная запись предыдущей строки
        //+= сложение с присваиванием. аналогичные функции у операторов -=, *=, /=
        int a1 = 3;
        int b1 = 50;
        int c1 = 0;
        a1 = b1 = c1 = 18;//оператор присвоения всегда начинает работать справа. в итоге у переменных a1, b1, c1 будет значение  18

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        // Невозможно присвоить значение переменной большего по размеру типа данных к меньшему по размеру.Только наоборот
        long a2 = 100L;
        //int b =a2;
        byte b2 = 6;
        short c2 = b2;
        //к Float и Double так же применимо это правило, за исключением того, что к ним можно присваивать любые другие типы данных от byte до long
    }
}
