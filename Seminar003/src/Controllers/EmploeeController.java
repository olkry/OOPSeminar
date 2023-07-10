package Controllers;

import Domen.Emploee;
import Domen.Person;
import Services.EmploeeService;

public class EmploeeController implements iPersonController<Emploee> {
      private final EmploeeService empService = new EmploeeService();

      @Override
      public void create(String firstName, int age) {
            empService.create(firstName, age);
      }

      public static <T extends Emploee> void paySalary(T person) {
            System.out.println(person.getName() + " Выплачена зарплата 30000р. ");
      }

}
