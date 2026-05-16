import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Ivan", 5));
        students.add(new Student(2, "Maria", 4));
        students.add(new Student(3, "Petr", 5));

        System.out.println("List of students:");
        for (Student student : students) {
            System.out.println(student);
        }

        Map<Integer, Student> studentMap = new HashMap<>();

        for (Student student : students) {
            studentMap.put(student.getId(), student);
        }

        System.out.println();
        System.out.println("Student with id = 2:");
        System.out.println(studentMap.get(2));

        System.out.println();
        System.out.println("All students from map:");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
}
