package Interfaces;

public interface iQueueBehaviour {
      /**
       * Метод присоединяющий покупателя к очереди.
       * @param actor - Покупатель
       */
      void takeInQueue(iActorBehaviuor actor);

      /**
       * Метод выводящий покупателя из очереди.
       */
      void releaseFromQueue();

      /**
       * Метод, описывающий в своём теле механизм получения заказа.
       */
      void takeOrder();

      /**
       * Метод, описывающий в своём теле механизм подачи заказа.
       */
      void giveOrder();

      /**
       * Метод, описывающий в своём теле механизм возврата.
       */
      void returnOrder();


}
