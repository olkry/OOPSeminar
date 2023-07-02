package Classes;

public class OrdinaryClient extends Actor {

      /**
       * Класс обычного клиента, стандартного, зашедшего в магазин
       * @param name - Имя покупателя
       */
      public OrdinaryClient(String name) {
            super(name);
      }

      @Override
      public String getName() {
            return super.name;
      }

      public boolean isTakeOrder() {
            return super.isTakeOrder;
      }

      public boolean isMakeOrder() {
            return super.isMakeOrder;
      }

      public void setTakeOrder(boolean makeOder) {
            super.isMakeOrder = makeOder;
      }

      public void setMakeOrder(boolean pikUpOrder) {
            super.isTakeOrder = pikUpOrder;
      }

      public Actor getActor() {
            return this;
      }

}
