public class App {
    public static void main(String[] args){
        iCalculable calculator = new Calculator(0);
        // ViewCalculator view = new ViewCalculator(calculator);
        // view.run();
        iCalculable newCalcLog = new CalcDecorator(calculator, new Loger());
        ViewCalculator viewNewCalcLog = new ViewCalculator(newCalcLog);
        viewNewCalcLog.run();
    }
}
