package Leveling.Lesson_21;

public class Test6 {
    int abc() {
        return 5;
    }

    int abc2(int i) {
        if (i > 10) {
            return 5;//return statement не обязательно должен стоять в конце метода, НО он должен быть последним statement, код которого выполняется,
        } else {
            return 10;
        }
    }
    void abc3(int i2){//return statement можно использовать и в методах с return type void.
        if (i2 > 3){
            return;//в этом случае, если i2 > 3 то метод заканчивает свою работу
        }
        System.out.println("Hello");
        return;//после return statement ничего невозможно написать
    }

    public static void main(String[] args) {
        int a = new Test6().abc();
        new Test6().abc();//Метод который возвращает какое то значение, не обязательно должен быть присвоен переменной
    }
}
