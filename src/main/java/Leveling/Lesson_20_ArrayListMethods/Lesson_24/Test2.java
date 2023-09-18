package Leveling.Lesson_20_ArrayListMethods.Lesson_24;

public class Test2 {
    public static void main(String[] args) {
        //Figura f = new Figura ();//Создать объект абстрактного класса невозможно
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvoStoron);//Compile time binding, так как это переменная.ВCE переменные определяются Compile time binding
        f1.ploshad();//Run time binding
    }
}

//Abstract class не может быть final. Это противоположные понятия. Абстрактный класс пишется для того чтобы он имел наследников. У final класса наследников не будет
abstract class Figura {//фигура это категоризация.Самой фигуры не существует,это абстрактное понятие и обозначает принадлежность.Самого объекта фигура не должно быть
    //Для того, чтобы объект фигура не мог быть создан, перед классом пишется abstract.
    /*Figura (int kolichestvoStoron) {//У абстрактного класса может быть конструктор
        this.kolichestvoStoron = kolichestvoStoron;
    }*/
    int kolichestvoStoron = 0;//Переменные не могут быть абстрактными

    abstract void perimetr();//В данной ситуации невозможно сделать универсальный метод подходящий под остальные классы без перезаписи,и он так же будет абстрактным

    abstract void ploshad();//У абстрактного метода нет тела. Если в классе есть абстрактный метод, то и класс должен быть абстрактным

    void showInfo() {
        System.out.println("Eto figura");//Обычный метод может существовать в абстрактном классе
    }
    //для методов не допустимо сочетание : final abstract, private abstract, static abstract. так как всё это не предполагает либо наследования либо перезаписи

}

//Дочерний класс (саб класс) должен перезаписать все абстрактные методы или тоже стать абстрактным
class Kvadrat extends Figura {//Дочерний класс который перезаписал все абстрактные методы, называется конкретным
    /*Kvadrat (int kolichestvoStoron) {
        super(kolichestvoStoron);
        this.kolichestvoStoron = kolichestvoStoron;
    }*/
    int kolichestvoStoron = 4;
    int storona1 = 10;

    @Override
    void perimetr() {//Любой перезаписанный метод может быть как абстрактным, так и не абстрактным. Но если он становится им,то и класс тоже должен стать абстрактным
        System.out.println("Perimetr kvadrata = " + 4 * storona1);
    }

    @Override
    void ploshad() {
        System.out.println("Ploshad kvadrata = " + storona1 * storona1);
    }//Как только все абстрактные методы перезаписаны, класс начинает нормально работать
}

class XXX extends Kvadrat {
} //Класс который является наследником класса, который перезаписал все абстрактные методы уже не должен их перезаписывать.
//Но если такие методы есть, то он их должен перезаписать или стать абстрактным

class Pryamoygolnuk extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;

    @Override
    void perimetr() {
        System.out.println("Perimetr pryamoygolnuka = " + 2 * (storona1 + storona2));
    }

    @Override
    void ploshad() {
        System.out.println("Ploshad pryamoygolnuka = " + storona1 * storona2);
    }
}

class Okrujnost extends Figura {
    int kolichestvoStoron = 0;
    int radius = 3;

    @Override
    void perimetr() {
        System.out.println("Perimetr okrujnosti = " + 2 * 3.14 * radius);
    }

    @Override
    void ploshad() {
        System.out.println("Ploshad okrujnosti = " + 3.14 * radius * radius);
    }
}

abstract class Chetirexugolnik extends Figura {
    void def() {
        System.out.println("Eto chetirexugolnik");
    }
}