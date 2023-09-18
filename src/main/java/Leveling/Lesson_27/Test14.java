package Leveling.Lesson_27;

public class Test14 {
    void abc (){
        int [] array = {1,2,3};
        try {
            System.out.println(array[7]);
        }
        catch (ArrayIndexOutOfBoundsException e){//catch блоки ловят только те исключения, которые выбрасываются из try блока.
            String s = null;//Поэтому исключение выброшенное внутри catch блока следующий catch блок уже не сможет словить, так как он предназначен для try блока
            try {
                System.out.println(s.length());//Но это возможно если сделать внутренние try/catch блоки
            }catch (NullPointerException e2) {
                System.out.println("Eto vnutrenniy catch block");
            }
        }
        catch (NullPointerException e) {
            System.out.println("poyman NullPointerException");
        }
    }

    public static void main(String[] args) {
        Test14 t = new Test14();
        t.abc();
    }
}
