package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class View implements iGetView {
      public void printAllStudent(List<Student> students){
            System.out.println("----------Список студентов----------");
            for (Student student : students) {
                  System.out.println(student);
            }
            System.out.println("===============================");
      }

      @Override
      public String prompt(String msg) {
            Scanner in = new Scanner(System.in);
            System.out.print(msg);
            return in.nextLine();
      }

      @Override
      public Long getStudentIdToDelete() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getStudentIdToDelete'");
      }

      @Override
      public void displayStudents(List<Student> students) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'displayStudents'");
      }

      @Override
      public Student readStudent() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'readStudent'");
      }

      @Override
      public Long getStudentIdToUpdate() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getStudentIdToUpdate'");
      }
}
