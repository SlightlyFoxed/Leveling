package Leveling.Lesson_27;
import java.io.*;
public class Test10 {
    //Finally блок выполняется даже в том случае, если в try блоке или в catch блоке имеется return statement.
    // При этом сначала обработается код в try блоке или в catch блоке, затем finally block, и последним будет return statement
    //Finally блок не выполнится только в том случае, если вы прекращаете работу программы с помощью System.exit в try блоке или в catch блоке или же,
    // если происходит крушение JVM или, например, операционной системы
    //Если return statement имеется и в catch блоке и в finally блоке, то оутпутом метода будет возвращаемое значение из finally блока.
    //Если return statement в catch блоке возвращает primitive data type, то в finally блоке изменить его будет невозможно.
    //Если return statement в catch блоке возвращает reference data type, то в finally блоке его можно будет изменить (естественно, если тип mutable)
    static int abc (){
        int a = 5;
        try {
            File f = new File("test8");
            FileInputStream fis = new FileInputStream(f);
            //return 5;
        }
        catch (FileNotFoundException e){
            System.out.println("Exceprion poyman");
            System.out.println("peremennaya a v catch bloke = " + a);
            return a;//если ошибка ловится, то срабатывает тело catch блока и создает копию переменной _а_, значение которой остается 5 и сразу отправляется в оутпут.
            //Не смотря на то,что значение в finally блоке затем изменится,в оутпут будет отправлено значение из catch блока и затем значение переменной _а_ изменится
        }
        finally {//Finally блок выполняется даже в том случае, если в try блоке или в catch блоке имеется return statement.
            // При этом сначала обработается код в try блоке или в catch блоке, затем finally block, и последним будет return statement
            a = 10;
            System.out.println("eto block finally");
            System.out.println("peremennaya a v finally bloke = " + a);
            //return 7;//Если return statement имеется и в catch блоке и в finally блоке,
            // то именно return statement в finally блоке будет играть окончательную и более значимую роль
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(abc());

    }
}
