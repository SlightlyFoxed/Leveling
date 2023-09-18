package Leveling.Lesson_16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("privet");
        String s2 = new String("abcdefgabcd");

        int a = s1.length();//Метод позволяет узнать длину массива String. Возвращает int
        System.out.println(a);
        System.out.println(s1.length());//Так же возможна такая запись

        char c1 = s1.charAt(3);//Позволяет узнать какой char( символ) находится на указанном индексе.
        System.out.println(c1);//Если указать индекс выходящий за пределы массива, в выводе будет исключение выхода за пределы. Exception OutOfBounds

        int i1 = s1.indexOf('t');//Позволяет узнать на каком индексе находится указанный символ. Возвращает int
        System.out.println(i1);

        int i2 = s1.indexOf("vet");//Позволяет узнать на каком индексе находится указанная часть String.Работает до первого совпадения.
        System.out.println(i2);

        int i3 = s1.indexOf("Z");//Если указать символ который отсутствует в массиве, в выводе будет индекс -1, так как такого индекса не существует
        System.out.println(i3);

        int i4 = s2.indexOf("a",5);//Позволяет указать с какого индекса начинать искать указанный символ и выводит его индекс.
        System.out.println(i4);

        boolean b1 = s2.startsWith("abc");//Позволяет узнать начинается ли массив с указанных символов, возвращая true или false.
        System.out.println(b1);

        boolean b2 = s2.startsWith("abc",7);//Позволяет узнать начинается ли массив с указанных символов и конкретного индекса,возвращая true или false.
        System.out.println(b2);

        boolean b3 = s2.endsWith("abcd");//Позволяет узнать заканчивается ли массив указанными символами, возвращая true или false.
        System.out.println(b3);

    }
}
