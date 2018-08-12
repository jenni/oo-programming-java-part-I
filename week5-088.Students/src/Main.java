
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        String name = "";
        String number = "";

        while (true) {
            System.out.println("name: ");
            name = reader.nextLine();
            if (name.isEmpty()) break;
            System.out.println("studentnumber: ");
            number = reader.nextLine();
            Student student = new Student(name, number);

            students.add(student);
        }

//        students.forEach(student -> System.out.println(student));
        for (Student student : students) System.out.println(student);

        System.out.println("Give search term: ");
        String term = reader.nextLine();

        System.out.println("Result: ");
        for (Student student : students)
            if (student.getName().contains(term)) System.out.println(student);
    }
}
