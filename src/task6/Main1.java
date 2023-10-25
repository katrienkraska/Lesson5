package task6;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<String> teachers = new ArrayList<>();

        teachers.add("Світлана Олексіївна");
        teachers.add("Раїса Анатоліївна");
        teachers.add("Дмитро Константинович");
        teachers.add("Тетяна Петрівна");
        teachers.add("Олександр Васильович");

        System.out.println("Список вчителів: ");
        for (String teacher : teachers){
            System.out.println(teacher);
        }
        
        System.out.println();
        int bestTeacherIndex = teachers.indexOf("Світлана Олексіївна");

        int worstTeacherIndex = teachers.indexOf("Тетяна Петрівна");

        System.out.println("Індекс найкращого вчителя: " + bestTeacherIndex);
        System.out.println("Індекс найгіршого вчителя: " + worstTeacherIndex);
    }
}
