package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Student;

public class StudentService implements iPersonService<Student> {
      private int count;
      private List<Student> students;

      public StudentService() {
            this.students = new ArrayList<Student>();
      }

      @Override
      public List<Student> getAll() {
            return students;
      }

      @Override
      public void create(String firstName, int age) {
            Student pers = new Student(firstName, age, count);
            count++;
            students.add(pers);
      }

      public void sortByFioStdList() {
            students.sort(new PersonComparator<Student>());
            
      }

}
