package Leveling.Lesson_27;
import java.util.*;
public class Test18 {
    //Распространенные саб классы RuntimeException
    static ArrayList <String> list;
    static Doctor[] array;
    public static void main(String[] args) {

        /*ArrayList <String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println(list.get(3));//ArrayIndexOutOfBoundsException*/
        ///////////////
        //list.add("!!!!");//NullPointerException. Когда ArrayList еще является null, добавить в него ничего нельзя
        //System.out.println(array[0]);//NullPointerException. Когда массив еще является null, увидеть его элементы нельзя
        //System.out.println(array[0].toString());//Если в массиве указана длина, то array[0] не выбросит исключение, а покажет null.
        // Но метод toString() выброситNullPointerException
        ///////////////
        //System.out.println(5/0);//ArithmeticException
        ////////////////
        //Integer.parseInt("44op");//NumberFormatException, когда String не может быть переведен в Integer.NumberFormatException саб класс IllegalArgumentException
        Integer.parseInt("44ab",16);//можно указать, что String является числом из шестнадцатеричной системы исчисления. Тогда все в порядке
        ////////////////
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Empoyee[] array1 = {d,t};
        //Teacher t2 = (Teacher) array1[0];//ClassCastException Doctor cannot be cast to class Teacher
        ////////////////
        createPwd("qwerty");

    }
    public static void createPwd (String pwd){
        if (pwd.length() < 6){
            throw new IllegalArgumentException("Dlina parolya sliwkom mala");//В параметрах исключения можно написать сообщение, которое будет нести исключение
        }
        if (pwd.length() > 12){
            throw new IllegalArgumentException("Dlina parolya sliwkom bolshaya");
        }
        System.out.println("parol prinyat");
    }
}

class Empoyee{}
class Doctor extends Empoyee{}
class Teacher extends Empoyee{}

class Samolet {
    String sostoyanie = "v ojidanii";//v ojidanii,v vozduxe, polet otmenen
    public void letet(){
        sostoyanie = "v vozduxe";
        System.out.println("samolet letit");
    }
    public void ojidat(){
        if(sostoyanie.equals("v vozduxe")) {
            throw new IllegalStateException("Samolet uje v vozduxe");//Это исключение сигнализирует о том, что метод вызывается в абсолютно неподходящее время
        }
        sostoyanie = "v ojidanii";
        System.out.println("Samolet v ojidanii poleta");
    }
    public void otmenitPolet(){
        if(sostoyanie.equals("v vozduxe")) {
            throw new IllegalStateException("Samolet uje v vozduxe");//Это исключение сигнализирует о том, что метод вызывается в абсолютно неподходящее время
        }
        sostoyanie = "polet otmenen";
        System.out.println("polet samoleta otmenen");
    }

    public static void main(String[] args) {
        Samolet s = new Samolet();
        s.ojidat();
        s.letet();
        //s.otmenitPolet();
    }
}