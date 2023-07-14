package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.HachModel;
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

      /**
       * Констуктор класса отвечающего за взаимодействие базы данных и интерфейсов
       * 
       * @param model - классы источника данных
       * @param view  - классы призентации данных
       */
      public Controller(iGetModel model, iGetView view) {
            this.model = model;
            this.view = view;
      }

      /**
       * Метод проверки коллекци на данные
       * 
       * @param students - коллекция
       * @return возвращает true, если в коллекции есть данные
       */
      private boolean testData(List<Student> students) {
            if (students.size() > 0) {
                  return true;
            } else {
                  return false;
            }
      }

      /**
       * Метод проверяющий коллекцию на наличие данных и заполняющий данные.
       */
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

      /**
       * Метод запускающий основную программу на русском
       */
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
                        case DELETE:
                              Scanner scanner = new Scanner(System.in);
                              System.out.print("Введите ID студента для удаления: ");
                              Long id = scanner.nextLong();
                              model.removeStudents(id);
                              break;
                  }

            }
      }

      /**
       * Метод запускающий основную программу на английском
       */
      public void runEng() {
            Command com = Command.NONE;
            boolean getNewIteration = true;
            while (getNewIteration) {
                  String command = view.prompt("Enter the command:");
                  com = Command.valueOf(command.toUpperCase());
                  switch (com) {
                        case EXIT:
                              getNewIteration = false;
                              System.out.println("Exit the program!");
                              break;
                        case LIST:
                              view.printAllStudent(model.getAllStudents());
                              break;
                        case DELETE:
                              Scanner scanner = new Scanner(System.in);
                              System.out.print("Введите ID студента для удаления: ");
                              Long id = scanner.nextLong();
                              model.removeStudents(id);
                              break;
                  }

            }
      }

      /**
       * метод запускающий основную программу на английском и с обработкой хешКарт
       */
      public void runHash() {
            Command com = Command.NONE;
            boolean getNewIteration = true;
            while (getNewIteration) {
                  String command = view.prompt("Enter the command:");
                  com = Command.valueOf(command.toUpperCase());
                  switch (com) {
                        case EXIT:
                              getNewIteration = false;
                              System.out.println("Exit the program!");
                              break;
                        case LIST:
                              model.printHashStud();
                              ;
                              break;
                        case DELETE:
                              Scanner scanner = new Scanner(System.in);
                              System.out.print("Введите ID студента для удаления: ");
                              Long id = scanner.nextLong();
                              model.removeStudents(id);
                              break;
                  }

            }
      }

}
