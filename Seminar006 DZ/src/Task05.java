public class Task05 {
      // Исходный код
      // public class Car {
      // private PetrolEngine engine;

      // public Car(PetrolEngine engine) {
      // this.engine = engine;
      // }

      // public void start() {
      // this.engine.start();
      // }
      // }

      // public class PetrolEngine {
      // public void start() {
      // }
      // }

      // Изменённый код

      // Введём интерфейс двигателя
      public interface iEngine {
            void start();
      }

      // Опишем бензиновый двигатель
      public class PetrolEngine implements iEngine {
            public void start() {
                  System.out.println("Запущен бензин");
            }
      }

      // Опишем дизельный двигатель
      public class DieselEngine implements iEngine {
            public void start() {
                  System.out.println("Запустили дизель");
            }
      }

      // Опишем электро двигатель
      public class ElectroEngine implements iEngine {
            public void start() {
                  System.out.println("Запустили электруху");
            }
      }

      // Переопишем класс машины
      public class Car {
            iEngine engine;

            /**
             * Теперь он принимает любой тип двигателя
             * 
             * @param engine - тип двигателя
             */
            public Car(Task05.iEngine engine) {
                  this.engine = engine;
            }

            public void start() {
                  this.engine.start();
            }
      }
}
