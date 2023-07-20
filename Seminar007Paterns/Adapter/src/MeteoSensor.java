


import java.time.LocalDateTime;
// Интерфейс родного датчика
public interface MeteoSensor {
      /**
       *  идентификатор датчика
       * @return
       */
      int getId(); // идентификатор датчика

      Float getTemperature(); // температура датчика

      Float getHumidity(); // влажность

      Float getPressure(); // давление

      LocalDateTime getDateTime(); // время чтения данных датчика
}
