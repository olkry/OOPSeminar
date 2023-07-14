package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Controller.iGetModel;

public class HachModel implements iGetModel {
      private HashMap<Long, List<Student>> hashStud;

      /**
       * Конструктор создаёт заполненную из коллекции карту.
       */
      public HachModel(List<Student> students) {
            hashStud = new HashMap<>();
            for (Student student : students) {
                  Long id = student.getId();
                  List<Student> studList = hashStud.get(id);
                  if (studList == null) {
                        studList = new ArrayList<>();
                        hashStud.put(id, studList);
                  }
                  studList.add(student);
            }
      }

      // /**
      //  * Добовляем студентов в карту
      //  * @param students - коллекция студентов
      //  */
      // public void addStudent(List<Student> students){
      //       for (Student student : students) {
      //             Long id = student.getId();
      //             List<Student> studList = hashStud.get(id);
      //             if (studList == null) {
      //                   studList = new ArrayList<>();
      //                   hashStud.put(id, studList);
      //             }
      //             studList.add(student);
      //       }
      // }

      @Override
      public List<Student> getAllStudents() {
            List<Student> allStudent = new ArrayList<>();
            for (Map.Entry<Long, List<Student>> student : hashStud.entrySet()) {
                  List<Student> studentList = student.getValue();
                  allStudent.addAll(studentList);
            }
            return allStudent;
      }

      /**
       * Добавил метод прямого вывода карты
       */
      public void printHashStud(){
            for (Map.Entry<Long, List<Student>> student : hashStud.entrySet()) {
                  Long key = student.getKey();
                  List<Student> studentList = student.getValue();
                  System.out.println("KEY: "+key);
                  for (Student studVal : studentList) {
                        System.out.println("Student: " + studVal);
                  }
            }
      }

      @Override
      public void removeStudents(Long id) {
            if (hashStud.containsKey(id)) {
                  hashStud.remove(id);
                  System.out.println("Студент с ID "+ id +" успешно удалён.");
            } else {
                  System.out.println("!!!Студент с ID "+ id +" не найден.");
            }
            
      }
      
}
