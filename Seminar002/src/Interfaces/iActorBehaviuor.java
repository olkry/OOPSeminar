package Interfaces;

import Classes.Actor;

public interface iActorBehaviuor {
      /**
       * Метод сообщающий, что покупатель имеет на руках заказ и вышел из очереди.
       * @return возвращает подтвердение действия или его отрицание.
       */
      public boolean isTakeOrder();

      /**
       * Метод сообщающий, что покупатель получает свой заказ
       * @return возвращает подтвердение действия или его отрицание.
       */
      public boolean isMakeOrder();

      /**
       * Метод подтверждающий, что покупатель получил заказ.
       * @param takeOrder - значение true/false.
       */
      public void setTakeOrder(boolean takeOrder);

      /**
       * Метод подтверждающий, что покупатель сделал заказ.
       * @param makeOrder - значение true/false.
       */
      public void setMakeOrder(boolean makeOrder);

      /**
       * Метод, извлекающий все данные по покупателю
       * @return возвращает данные по покупателю.
       */
      Actor getActor();
}
