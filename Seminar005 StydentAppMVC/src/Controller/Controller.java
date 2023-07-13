package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.ModelList;
import Model.Student;
import View.View;

public class Controller {
      // private ModelList model;
      // private View view;

      private iGetModel model;
      private iGetView view;

      // For MVP
      private List<Student> students = new ArrayList<>();

      public Controller(iGetModel model, iGetView view) {
            this.model = model;
            this.view = view;
      }

      private boolean testData(List<Student> students) {
            if (students.size() > 0) {
                  return true;
            } else {
                  return false;
            }
      }

      public void update() {
            // MVP
            students = model.getAllStudents();
            if (testData(students)) {
                  view.printAllStudent(students);
            } else {
                  System.out.println("Empity list");
            }

            // //MVC
            // view.printAllStudent(model.getAllStudents());
      }

      public void run() {
            Command com = Command.NONE;
            boolean getNewIteration = true;
            while (getNewIteration) {
                  String command = view.prompt("Введите команду:");
                  com = Command.valueOf(command.toUpperCase());
                  switch (com) {
                        case EXIT:
                              getNewIteration = false;
                              System.out.println("Выход из программы!");
                              break;
                        case LIST:
                              view.printAllStudent(model.getAllStudents());
                              break;
                  }

            }
      }

}
