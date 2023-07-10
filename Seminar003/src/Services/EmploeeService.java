package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Emploee;

public class EmploeeService implements iPersonService<Emploee> {
      private int count;
      private List<Emploee> emploee;

      public EmploeeService() {
            this.emploee = new ArrayList<Emploee>();
      }

      @Override
      public List<Emploee> getAll() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getAll'");
      }

      @Override
      public void create(String firstName, int age) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'create'");
      }
}
