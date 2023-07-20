import java.util.Scanner;

public class ViewCalculator {
      
      private iCalculable calculator;

      public ViewCalculator(iCalculable calculator) {
            this.calculator = calculator;
      }

      private String prompt(String message){
            Scanner in = new Scanner(System.in);
            System.out.print(message);
            return in.nextLine();
      }

      private int promptInt(String message){
            Scanner in = new Scanner(System.in);
            System.out.print(message);
            return Integer.parseInt(in.nextLine());
      }
      
      public void run(){
            while (true) {
                  int primaryAgs = promptInt("Введите первое число: ");
                  calculator.sum(primaryAgs);
                  while (true) {
                        String cmd = prompt("Введите оператор (доступны: +,*,=): ");
                        if (cmd.equals("+")) {
                              int arg = promptInt("Введите второе число: ");
                              calculator.sum(arg);
                              continue;
                        }
                        if (cmd.equals("*")) {
                              int arg = promptInt("Введите второе число: ");
                              calculator.multi(arg);
                              continue;
                        }
                        if (cmd.equals("=")) {
                              int result = calculator.getResult();
                              System.out.printf("Результат: %d\n", result);
                              break;
                        }
                  }
                  String cmd = prompt("Хотите продолжить(Y/N): ").toUpperCase();
                  if (cmd.equals("Y")) {
                        continue;
                  }
                  break;
            }
      }
}
