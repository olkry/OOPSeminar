package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Teacher;
/**
 * Класс хранящий методы для работы с учителями 
 */
public class TeacherService implements iPersonService<Teacher>{
      private int count;
      private List<Teacher> teachers;

      /**
       * Конструктор описывающий класс, создаёт коллекцию из учителей.
       */
      public TeacherService() {
            this.teachers = new ArrayList<Teacher>();
      }

      // Используем заглушки
      @Override
      public List<Teacher> getAll() {
            return teachers;
      }

      @Override
      public void create(String firstName, int age) {
            Teacher pert = new Teacher(firstName, age, count);
            count++;
            teachers.add(pert);
      }

      /**
       * сортировка по возрасту
       * @param teachers список учителей
       */
      public void sortByAgeTeachList() {
            teachers.sort(new PersonComparator<Teacher>());
            
      }

      @Override
      public String toString() {
            return "TeacherService [count=" + count + ", teachers=" + teachers + "]";
      }

}
