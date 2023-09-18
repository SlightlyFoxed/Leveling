package Leveling.Lesson_7;

public class DrugoyClass {
    public static void main(String[] args) {
        Employee emp = new Employee(500);//В другом классе того же пакета так же будут видны все элементы
        System.out.println(emp.salary);
        emp.dvoynayaZP();
    }
}
