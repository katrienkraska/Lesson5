package task4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        ListIterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            int currentNumber = iterator.next();
            int incrementedNumber = currentNumber + 1;
            iterator.set(incrementedNumber); // Збільшуємо значення на 1
        }

        System.out.println("Оновлений список чисел:");
        for (int number : numbers) {
            System.out.println(number);

        }
    }
}
