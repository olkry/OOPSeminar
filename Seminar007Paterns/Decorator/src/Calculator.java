public final class Calculator implements iCalculable {
      private int primaryAgs;

      public Calculator(int primaryAgs) {
            this.primaryAgs = primaryAgs;
      }

      @Override
      public iCalculable sum(int arg) {
            primaryAgs += arg;
            return this;
      }

      @Override
      public iCalculable multi(int arg) {
            primaryAgs *= arg;
            return this;
      }

      @Override
      public int getResult() {
            return primaryAgs;
      }
      
}
