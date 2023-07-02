package Interfaces;

public interface iReturnOrder {

      /**
       * Добовление клиента в список возврата
       * 
       * @param actor - клиент
       */
      void takeInReturn(iActorBehaviuor actor);

      /**
       * Метод вводящий покупателя на возврат
       * 
       * @param actor - покупатель
       */
      void acceptToReturn(iActorBehaviuor actor);

      

}
