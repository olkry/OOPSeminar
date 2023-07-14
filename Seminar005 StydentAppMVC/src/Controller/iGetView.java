package Controller;

import java.util.List;

import Model.Student;

// Интерфейс отвечающий за отображение в консоли
public interface iGetView {

      
      /**
       * Метод выводит информацию о каждом студенте на консоль
       * @param students
       */
      void printAllStudent(List<Student> students);

      /**
       * Метод для запроса ввода пользователя, чтобы получить команду или данные от него
       * @param msg
       * @return
       */
      String prompt(String msg);

      /**
       * Метод для получения id студента, которого нужно удалить.
       * @return
       */
      Long getStudentIdToDelete();

      /**
       * Метод отображает информацию о каждом студенте
       * @param students
       */
      void displayStudents(List<Student> students);

      /**
       * Метод для чтения данных о студенте.
       * @return
       */
      Student readStudent();

      /**
       * Метод для получения id студента, которого пользователь хочет обновить.
       * @return
       */
      Long getStudentIdToUpdate();
}
