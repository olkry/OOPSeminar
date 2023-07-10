package Controllers;

import Domen.Student;
import Services.StudentService;

public class StudentsController implements iPersonController<Student> {
      private final StudentService dataService = new StudentService();

      @Override
      public void create(String firstName, int age) {
            dataService.create(firstName, age);
            dataService.sortByFioStdList();
      }

}
