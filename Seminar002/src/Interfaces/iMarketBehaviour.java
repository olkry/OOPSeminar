package Interfaces;

import java.util.List;

import Classes.Actor;

public interface iMarketBehaviour {
      /**
       * Метод вводящий покупателя в магазин
       * 
       * @param actor - Покупатель
       */
      void acceptToMarket(iActorBehaviuor actor);

      /**
       * Метод выводящий покупателя из магазина и убирающий из списка присутствующих в
       * магазине
       * 
       * @param actor - Покупатель
       */
      void releaseFromMarket(List<Actor> actor);

      

      /**
       * метод переключающий программу на обработку других методов, которые будут
       * включены в него, притом в порядке, заданом в теле метода
       */
      void update();
}
