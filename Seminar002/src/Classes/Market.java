package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviuor;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour, iQueueBehaviour, iReturnOrder {

      private List<iActorBehaviuor> queue;

      /**
       * Создаёт магазин для наполнения его клиентами и методами для отслеживания их
       * передвижения с отображением в консоли их статуса
       */
      public Market() {
            this.queue = new ArrayList<iActorBehaviuor>();
      }

      @Override
      public void acceptToMarket(iActorBehaviuor actor) {
            System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
            takeInQueue(actor);
      }

      @Override
      public void takeInQueue(iActorBehaviuor actor) {
            this.queue.add(actor);
            System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
      }

      // @Override
      // public void acceptToReturn(iActorBehaviuor actor) {
      //       System.out.println(actor.getActor().getName() + " клиент пришел в магазин для возврата товара ");
      //       takeInReturn(actor);
      // }

      // @Override
      // public void takeInReturn(iActorBehaviuor actor) {
      //       this.queue.add(actor);
      //       System.out.println(actor.getActor().getName() + " клиент добавлен в очередь возврата ");
      //       // returnOrder();
      // }

      @Override
      public void releaseFromMarket(List<Actor> actors) {
            for (Actor actor : actors) {
                  System.out.println(actor.getName() + " клиент ушел из магазина ");
                  queue.remove(actor);
            }

      }

      @Override
      public void update() {
            takeOrder();
            giveOrder();
            releaseFromQueue();
            // returnOrder();
      }

      @Override
      public void giveOrder() {
            for (iActorBehaviuor actor : queue) {
                  if (actor.isMakeOrder()) {
                        actor.setTakeOrder(true);
                        System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
                  }
            }

      }

      @Override
      public void releaseFromQueue() {
            List<Actor> releaseActors = new ArrayList<>();
            for (iActorBehaviuor actor : queue) {
                  if (actor.isTakeOrder()) {
                        releaseActors.add(actor.getActor());
                        System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
                  }

            }
            releaseFromMarket(releaseActors);
      }

      @Override
      public void takeOrder() {
            for (iActorBehaviuor actor : queue) {
                  if (!actor.isMakeOrder()) {
                        actor.setMakeOrder(true);
                        System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

                  }
            }

      }

      @Override
      public void acceptToReturn(iActorBehaviuor actor) {
            System.out.println(actor.getActor().getName() + " клиент пришел в магазин для возврата товара ");
            takeInReturn(actor);
      }

      @Override
      public void takeInReturn(iActorBehaviuor actor) {
            this.queue.add(actor);
            System.out.println(actor.getActor().getName() + " клиент добавлен в очередь возврата ");
            returnOrder();
      }

      @Override
      public void returnOrder() {
            List<Actor> actorsOut = new ArrayList<>();
            for (iActorBehaviuor actor : queue) {
                        actorsOut.add(actor.getActor());
                        System.out.println(actor.getActor().getName() + " клиент вернул свой заказ ");
            }
            releaseFromMarket(actorsOut);
      }
      



}
