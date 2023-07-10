package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс содержащий в себе список групп по потокам в себя
 */
public class StudentSteam implements Iterable<StudentGroup> {

      private List<StudentGroup> steam;
      private Integer numSteam;


      /**
       * Конструктор, который принимает:
       * @param steam - список групп.
       * @param numSteam - номер потока.
       */
      public StudentSteam(List<StudentGroup> steam, Integer numSteam) {
            this.steam = steam;
            this.numSteam = numSteam;
      }

      public List<StudentGroup> getSteam() {
            return steam;
      }

      public void setSteam(List<StudentGroup> steam) {
            this.steam = steam;
      }

      public Integer getNumSteam() {
            return numSteam;
      }

      public void setNumSteam(Integer numSteam) {
            this.numSteam = numSteam;
      }

      @Override
      public String toString() {
            return "StudentSteam [steam=" + steam + ", numSteam=" + numSteam + "]";
      }

      @Override
      public Iterator<StudentGroup> iterator() {
            return new Iterator<StudentGroup>() {

                  private int counter;

                  @Override
                  public boolean hasNext() {

                        if (counter < steam.size()) {
                              return true;
                        } else {
                              return false;
                        }
                  }

                  @Override
                  public StudentGroup next() {
                        return steam.get(counter++);
                  }

            };
      }

      

      
}
