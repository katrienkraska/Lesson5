package task2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add(0, "Зебра");
        animals.add(1, "Лев");
        animals.add(2, "Тигр" );
        animals.add(3, "Слон" );
        animals.add(4,"Жираф" );
        animals.add(5, "Мавпа");
        animals.add(6, "Пантера");
        animals.add(7, "Крокодил");


        System.out.println("Список тварин В зоопарку: ");
        for (String animal : animals){
            System.out.println(animal);
        }
    }
}
