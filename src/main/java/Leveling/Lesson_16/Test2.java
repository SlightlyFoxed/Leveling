package Leveling.Lesson_16;

public class Test2 {
    public static void main(String[] args) {

        String s1 = new String("abcdefgabcd");
        String s2 = new String("privet");
        String s10 = s1.substring(3);//присваивает значение массива с указанного индекса. изначальный объект String не меняется
        System.out.println(s10);
        System.out.println(s1);

        String s11 = s1.substring(3,7);//присваивает значение массива от и до указанного индекса. изначальный объект String не меняется
        System.out.println(s11);//в s11 будет включено всё от 3 ДО 7 индекса. Сам 7 индекс включен не будет.

        String s12 = s1.substring(3,11);//Если необходимо чтобы было включено все, включая символ последнего индекса, то можно написать последний индекс+1
        System.out.println(s12);//не смотря на то, что индекс выходит за пределы массива, компилятор это пропускает и включает последний символ в вывод

        String s13 = s1.trim();//Убирает пробелы до и после массива. Пробел внутри остается неизменным
        System.out.println(s13);

        String s14 = s2.replace('v','Z');// Меняет символы местами и выводит уже измененный массив
        System.out.println(s14);//Если такого символа нет, в выводе будет неизмененный вариант

        String s15 = s2.replace("vet","vivka");// Меняет указанную часть слова местами и выводит уже измененный массив
        System.out.println(s15);

        String s3 = "poka";
        String s4 = s3.replace('k','k');//Возвращает true НО ТОЛЬКО в том случае, если используются char а не String(("k","k") будет false)
        System.out.println(s3 == s4);//Работает только тогда, когда меняются одинаковые char

        String s5 = "privet, ";
        String s6 = "drug";
        System.out.println(s5.concat(s6));//Стандартное сложение как и s5+s6
    }
}
