import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(10);
        marks.add(55);
        marks.add(30);
        marks.add(40);
        marks.add(0);
        marks.add(98);
        marks.add(90);
        marks.add(15);
        marks.add(29);
        marks.add(33);

        List<Integer> failedStudents = marks.stream().filter(i->i<30).collect(Collectors.toList());
        long countFailedStudents = marks.stream().filter(i->i<30).count();

        System.out.println("Failed students marks are :- ");
        failedStudents.forEach(System.out::println);

        System.out.println("\nTotal numbers of Failed students :-  "+countFailedStudents);

    }
}
