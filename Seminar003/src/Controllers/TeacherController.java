package Controllers;

import Domen.Teacher;
import Services.TeacherService;

public class TeacherController implements iPersonController<Teacher> {
      private final TeacherService tichService = new TeacherService();

      @Override
      public void create(String firstName, int age) {
            tichService.create(firstName, age);
            tichService.sortByAgeTeachList();
      }
      
}
