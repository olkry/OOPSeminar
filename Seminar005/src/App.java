import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Student<String, Integer> s1 = new Student<String, Integer>("Сергей", 34, 101);
        // System.out.println(s1);
        Student<String, Integer> s2 = new Student<String, Integer>("Иван", 24, 102);
        Student<String, Integer> s3 = new Student<String, Integer>("Андрей", 27, 103);

        List<Student<String, Integer>> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        StudentGroup<String,Integer> group = new StudentGroup<String,Integer>(studentList, 4580);
        for (Student<String,Integer> student : group) {
            System.out.println(student);
        }

    }
}
