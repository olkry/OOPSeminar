package Interfaces;

public interface iQueueBehaviour {
      void takeInQueue(iActorBehaviuor actor);

      void releaseFromQueue();

      void takeOrder();

      void giveOrder();
}
