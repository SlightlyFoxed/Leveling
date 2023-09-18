package Leveling.Homework.ForEmployee;


import Leveling.Homework.Employee;

public class AccessEmployee {
    public static void main(String[] args) {

        Employee e3 = new Employee(4);
        System.out.println(e3.surname);
        e3.infoId();
        e3.infoSurname();
        e3.infoSalary();//с помощью метода все еще можно получить в выводе значения даже тех параметров, которые находятся в другом пакете с access modifier private
        /*Leveling.Homework.Employee e4 = new Leveling.Homework.Employee("Voronin");//так как конструктор с параметром surname имеет доступ default, невозможно создать объект с такими параметрами
        System.out.println(e4.id);
        System.out.println(e4.surname);
        e4.infoSalary();*/
        /*Leveling.Homework.Employee e4 = new Leveling.Homework.Employee(1600.0);// так как конструктор с параметром salary имеет доступ private, невозможно создать объект с такими параметрами
        e4.infoId();
        System.out.println(e4.surname);
        e4.infoSalary();*/
    }
}
