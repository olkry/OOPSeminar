package Controller;

import java.util.List;

import Model.Student;

// Интерфейс отвечающий за получение информации в программе
public interface iGetModel {
   /**
    * метод получающий коллекцию студентов
    * @return
    */
   public List<Student> getAllStudents();

   /**
    * метод добавленный для хеша в ДЗю
    */
   public void printHashStud();

   /**
    * Метод удаляющий студента реализован в данное время только для HashModel и ModelList
    * @param id - id студента
    */
   public void removeStudents(Long id);

}
