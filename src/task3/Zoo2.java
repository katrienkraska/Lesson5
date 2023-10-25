package task3;

import java.util.ArrayList;

public class Zoo2 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add(0, "Зебра");
        animals.add(1, "Лев");
        animals.add(2, "Тигр" );
        animals.add(3, "Слон" );
        animals.add(4,"Жираф" );
        animals.add(5, "Мавпа");
        animals.add(6, "Пантера");
        animals.add(7, "Крокодил");

        animals.remove(7);
        animals.remove(5);
        animals.remove(3);

        System.out.println("Список тварин В зоопарку: ");
        for (String animal : animals){
            System.out.println(animal);
        }

        int size = animals.size();
        System.out.println("Розмір списку: " + size);
    }
}
