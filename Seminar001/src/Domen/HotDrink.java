package Domen;

public class HotDrink extends Product {
      /**
       * Создал дополнительный параметр(поле) для класса, который будет отвечать за
       * температуру товара
       */
      private float temperature;

      /**
       * Создаём свойства на получение температуры
       * 
       * @return - возвращает температуру товара
       */
      public float getTemperature() {
            return temperature;
      }

      /**
       * Метод задания температуры
       * 
       * @param temperature - принимает заданную температуру, но мы заприватим этот
       *                    сеттер.
       */
      private void setTemperature(float temperature) {
            this.temperature = temperature;
      }

      // Набиваем конструкторы
      /**
       * Прямой конструктор для класса с наследованием, который принимает температуру
       * 
       * @param price       - Наследует из Product
       * @param place       - Наследует из Product
       * @param name        - Наследует из Product
       * @param id          - Наследует из Product
       * @param temperature - Вводим вручную для класса
       */
      public HotDrink(int price, int place, String name, long id, float temperature) {
            super(price, place, name, id);
            this.temperature = temperature;
      }

      /**
       * Конструктор без явного указания температуры, принимает наследование,
       * температура задаётся по умолчанию
       * 
       * @param price - Наследует из Product
       * @param place - Наследует из Product
       * @param name  - Наследует из Product
       * @param id    - Наследует из Product
       */
      public HotDrink(int price, int place, String name, long id) {
            super(price, place, name, id);
            this.temperature = (float) 0.0;
      }

      @Override
      /**
       * переназначаем метод для данного класса, метод наследуется + дописываем
       * температуру.
       */
      public String toString() {
            return super.toString() + "temperature = " + temperature;
      }

      /**
       * Зададим отдельный метод для пользователя с просмотром температуры
       * @return
       */
      public void seemTemperature(){
            System.out.println("Температура напитка = " + temperature + "\u00B0C");
      }


}
