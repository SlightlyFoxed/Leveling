package Leveling.Lesson_17;

public class Test2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1.append("45");//Меняется первоначальный объект,sb2 будет ссылаться на него же и все последующие изменения отразятся и в sb1 и в sb2
        sb2 = sb2.append("6").append("7");
        System.out.println("sb1 = " +sb1);
        System.out.println("sb2 = " +sb2);
        StringBuilder sb3 = new StringBuilder("123");
        StringBuilder sb5 =sb3;
        StringBuilder sb4 = new StringBuilder("123");
        System.out.println(sb3 == sb4);//в StringBuilder .equals и == являются одним и тем же
        System.out.println(sb3.equals(sb4));//Метод .equals работает в StringBuilder не так же как в String и не перезаписан.
        System.out.println(sb3.equals(sb5));//Только в этом случае метод вернет значение true
    }
}
