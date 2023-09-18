package Leveling.Lesson_22;

public class Chelovek {
    // SET GET IS
    final String pol;

    public Chelovek(String pol) {
        this.pol = pol;
    }
    private boolean clever;

    public boolean isClever(){//Метод с использованием boolean используется с is
        return clever;
    }

    public void setClever(boolean c){
        clever = c;
    }

    private StringBuilder name;//применён модификатор private для переменной Имя


    public StringBuilder getName() {//(геттер) Getter Метод чтобы показывать Имя
        //Если использовать здесь StringBuilder, то с помощью метода get можно будет влиять на имя используя метод .append
        //Чтобы этого не случилось, необходим следующий код
        StringBuilder sb = new StringBuilder(name);//Создается новый StringBuilder, который будет копией name.
        return sb;//Значение имени будет такое же, но возвращать метод будет не сам объект, а его копию
        //Изначальное значение имени теперь останется неизменным, так как через метод .append будет изменяться только копия объекта
        //Если RETURN TYPE метода get - это mutable(изменяемый) тип данных, то лучше возвращать его копию

    }

    public void setName(StringBuilder s) {//(сеттер) Setter Метод чтобы изменять Имя
        name = s;
    }
    //Инкапсуляция переменной name завершена

    private int vozrast;

    public int getVozrast() {//Метод чтобы позволять видеть возраст
        return vozrast;
    }

    public void setVozrast(int i) {//Метод чтобы изменять возраст
        if (i > 0) { //Устанавливается порог для возраста, невозможно присвоить значение возраста если он меньше 0
            vozrast = i;
        }

    }
    //Инкапсуляция переменной vozrast завершена

    private int ves;

    public int getVes(){
        return ves;
    }
    public void setVes (int i){
        if (i > 0){//Значение не принимается если вес меньше 0
            ves = i;
        }
    }
    //Инкапсуляция переменной ves завершена
}

class Test {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName(new StringBuilder("Kolya"));
        c.setVes(50);
        c.setVozrast(15);
        c.getName().append("!!!");//Пытаюсь изменить имя через метод, предназначенный только для показа имени.
        System.out.println(c.getName());//Изначальное значение имени осталось неизменным
        System.out.println(c.getVozrast());
        System.out.println(c.getVes());
        c.setVes(-30);//Пытаюсь установить недопустимое значение веса -30
        System.out.println(c.getVes());//Вес не изменился
    }
}