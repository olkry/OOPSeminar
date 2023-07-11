package Domen;

public class Teacher extends Person {
      private String acadDegree;
      private int id;

      public Teacher(String firstName, int age, String acadDegree) {
            super(firstName, age);
            this.acadDegree = acadDegree;
      }

      public Teacher(String firstName, int age, int id) {
            super(firstName, age);
            this.id = id;
      }

      @Override
      public String toString() {
            return "Teacher [age=" + super.getAge() + ", name= " + super.getName() + ", acadDegree=" + acadDegree + "]";
      }


}
