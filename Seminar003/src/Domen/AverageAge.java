package Domen;

import java.util.List;

public class AverageAge<T extends Person> {
      private List<T> userList;

      /**
       * Конструктор класса принимающий коллекцию любого класса
       * @param userList - коллекция
       */
      public AverageAge(List<T> userList) {
            this.userList = userList;
      }

      /**
       * Метод определяющий средний показатель коллекции, забранный из метода getAge()
       * @return - возращает средний дробный показатель
       */
      public double averAge(){
            double ageAver = 0.0;
            for (T person : userList) {
                  ageAver = ageAver + person.getAge();
            }
            return ageAver/userList.size();
      }

      

      
}
