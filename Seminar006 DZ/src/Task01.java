import java.util.Date;

public class Task01 {

      // Исходный код:
      // public class Employee {
      // private String name;
      // private Date dob;
      // private int baseSalary;

      // public Employee(String name, Date dob, int baseSalary) {
      // this.name = name;
      // this.dob = dob;
      // this.baseSalary = baseSalary;
      // }

      // public String getEmpInfo() {
      // return "name - " + name + " , dob - " + dob.toString();
      // }

      // public int calculateNetSalary() {
      // int tax = (int) (baseSalary * 0.25);// calculate in otherway
      // return baseSalary - tax;
      // }
      // }


      // Меняем класс, оставляем только информацияю по сотруднику
      public class Employee {
            private String name;
            private Date dob;


            public Employee(String name, Date dob) {
                  this.name = name;
                  this.dob = dob;

            }

            public String getEmpInfo() {
                  return "name - " + name + " , dob - " + dob.toString();
            }

      }

      // Создаём новый класс, для рассчёта зп.
      public class NetSalary{
            private int baseSalary;
            

            /**
             * Конструктор класса расчёта зп
             * @param baseSalary - принимает базовую зп
             */
            public NetSalary(int baseSalary) {
                  this.baseSalary = baseSalary;
            }


            /**
             * Расчёт персональной зп сотрудника
             * @return - возвращает зарплату к выплате
             */
            public int calculateNetSalary() {
                  int tax = (int) (baseSalary * 0.25);
                  return baseSalary - tax;
            }
      }

}
