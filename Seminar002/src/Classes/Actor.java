package Classes;

import Interfaces.iActorBehaviuor;

public abstract class Actor implements iActorBehaviuor {
      protected String name;
      protected boolean isTakeOrder;
      protected boolean isMakeOrder;

      /**
       * Базовый класс покупателя
       * @param name - добовляет к карте покупателя имя
       */
      public Actor(String name) {
            this.name = name;
      }

      /**
       * Метод получения имяни покупателя
       * @return - Возвращает имя покупателя
       */
      abstract public String getName();

}
