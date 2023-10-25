package task5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Friends {
    public static void main(String[] args) {
        List<String> friendNames = new ArrayList<>();

        friendNames.add("Mary");
        friendNames.add("Bob");
        friendNames.add("Liza");
        friendNames.add("John");
        friendNames.add("Alex");

        System.out.println("Список друзів: ");
        for (String name : friendNames){
            System.out.println(name);
        }

        Collections.sort(friendNames);

        System.out.println("Список друзів: ");
        for (String name : friendNames){
            System.out.println(name);
        }
    }
}
