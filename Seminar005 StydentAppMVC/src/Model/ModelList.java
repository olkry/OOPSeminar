package Model;

import java.util.List;

import Controller.iGetModel;

public class ModelList implements iGetModel {
      private List<Student> students;

      /**
       * Конструктор в который помещаем данные
       * @param students - коллекция данных
       */
      public ModelList(List<Student> students) {
            this.students = students;
      }

      public List<Student> getAllStudents() {
            return students;
      }

      @Override
      public void printHashStud() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'printHashStud'");
      }

      @Override
      public void removeStudents(Long id) {
            for (Student student : students) {
                  if (student.getId() == id) {
                        students.remove(student);
                        System.out.println("Студент с ID "+ id +" успешно удалён.");
                        break;
                  }
            }
      }

}
