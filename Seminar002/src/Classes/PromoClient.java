package Classes;

public class PromoClient extends Actor {

      public String promoName;
      private int promoID;
      public static int promoCount;

      static {
            PromoClient.promoCount = 0;
      }

      /**
       * Конструктор клиента учавствующего в акции
       * 
       * @param name      - Имя клиента с указанием отношения к акции и количеством
       *                  одновременно находящихся в магазине участников
       * @param promoName - Название акции
       * @param promoID   - Уникальный индификационный номер для участника акции
       */
      public PromoClient(String name, String promoName, int promoID) {
            super(name + String.format(" - Promotion number - %d", ++promoCount));
            this.promoName = promoName;
            this.promoID = promoID;
      }

      @Override
      public boolean isTakeOrder() {
            return super.isTakeOrder;
      }

      @Override
      public boolean isMakeOrder() {
            return super.isMakeOrder;
      }

      @Override
      public void setTakeOrder(boolean makeOder) {
            super.isMakeOrder = makeOder;
      }

      @Override
      public void setMakeOrder(boolean pikUpOrder) {
            super.isTakeOrder = pikUpOrder;
      }

      @Override
      public Actor getActor() {
            return this;
      }

      @Override
      public String getName() {
            return super.name;
      }

}
