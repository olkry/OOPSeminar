package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

public class ModelFile implements iGetModel {
      private String fileName;

      /**
       * Конструктор создающий физический файл на носителе
       * 
       * @param fileName - название файла и его разрешение
       */
      public ModelFile(String fileName) {
            this.fileName = fileName;

            try (FileWriter fw = new FileWriter(fileName, true)) {
                  fw.flush();
            } catch (Exception e) {
                  System.out.println(e.getMessage());
            }
      }

      @Override
      public List<Student> getAllStudents() {
            List<Student> students = new ArrayList<Student>();
            try {
                  File file = new File(fileName);
                  FileReader fr = new FileReader(file);
                  BufferedReader reader = new BufferedReader(fr);
                  String line = reader.readLine();
                  while (line != null) {
                        String[] param = line.split(" ");
                        Student pers = new Student(param[0], Integer.parseInt(param[1]), Long.parseLong(param[2]));
                        students.add(pers);
                        line = reader.readLine();
                  }

            } catch (Exception e) {
                  System.out.println(e.getMessage());
            }

            return students;
      }

      /**
       * Метод проводящий запись в отдельный файл данных.
       * @param students - принимаемая коллекция данных
       */
      public void saveAllStudentToFile(List<Student> students) {
            try (FileWriter fw = new FileWriter(fileName, true)) {
                  for (Student pers : students) {
                        fw.write(pers.getName() + " " + pers.getAge() + " " + pers.getId());
                        fw.append('\n');
                  }
                  fw.flush();
            } catch (Exception e) {
                  System.out.println(e.getMessage());
            }
      }

      @Override
      public void printHashStud() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'printHashStud'");
      }

      @Override
      public void removeStudents(Long id) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'removeStudents'");
      }

}
