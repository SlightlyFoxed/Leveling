package Leveling.Lesson_19;

public class Test1 {
    //Command line arguments. это аргументы командной строки, которые передаются в момент запуска программы в командной строке.
    public static void main(String[] args) {
        System.out.println("Nulevoy element massiva: "+ args[0]);
        System.out.println("Dlina massiva: " + args.length);
    }
}
//текстовый файл с кодом необходимо сохранить как текстовый файл с расширением .java
//В командной строке прописывается путь к папке bin java.
//заходим в папку где находится текстовый файл с кодом. >D:>cd Test
//далее компилируем код javac Test1.java
//запускается программа и прописываются аргументы.java Test1 ok poka privet on ona.
// эта запись по другому будет выглядеть как String [] args = {"ok", "poka", "privet", "on", "ona"}
//Все элементы Command line аргументов всегда будут иметь в этом случае тип данных String
