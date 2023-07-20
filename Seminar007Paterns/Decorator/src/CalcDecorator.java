public class CalcDecorator implements iCalculable {

      private iCalculable oldCalc;
      private Loger logger;

      public CalcDecorator(iCalculable oldCalc, Loger logger) {
            this.oldCalc = oldCalc;
            this.logger = logger;
      }

      @Override
      public iCalculable sum(int arg) {
            int firstArg = oldCalc.getResult();

            logger.log(String.format("Первое значение %d. Начало вызова метода sum с параметром %d", firstArg, arg));
            iCalculable result = oldCalc.sum(arg);
            logger.log("Вызов метода sum произошел");
            return result;
      }

      @Override
      public iCalculable multi(int arg) {
            int firstArg = oldCalc.getResult();

            logger.log(String.format("Первое значение %d. Начало вызова метода multi с параметром %d", firstArg, arg));
            iCalculable result = oldCalc.multi(arg);
            logger.log("Вызов метода multi произошел");
            return result;
      }

      @Override
      public int getResult() {
            int result = oldCalc.getResult();
            logger.log(String.format("Получение результата %d", result));
            return result;
      }

}
