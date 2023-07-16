public class Task02 {
      // Исходный код
      // public class SpeedCalculation {

      // public double calculateAllowedSpeed(Vehicle vehicle) {
      // if (vehicle.getType().equalsIgnoreCase("Car")) {
      // return vehicle.getMaxSpeed() * 0.8;
      // } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
      // return vehicle.getMaxSpeed() * 0.6;
      // }
      // return 0.0;
      // }
      // }

      // public class Vehicle {
      // int maxSpeed;
      // String type;

      // public Vehicle(int maxSpeed, String type) {
      // this.maxSpeed = maxSpeed;
      // this.type = type;
      // }

      // public int getMaxSpeed() {
      // return this.maxSpeed;
      // }

      // public String getType() {
      // return this.type;
      // }
      // }

      // Измененный код

      // Класс возврающий предельную скорость
      public class SpeedCalculation {
            public double calculateAllowedSpeed(Vehicle vehicle) {
                  return vehicle.calculateAllowedSpeed();
            }
      }
      // Сделаем класс абстрактным и удалим не нужное поле type
      public abstract class Vehicle {
            int maxSpeed;

            public Vehicle(int maxSpeed) {
                  this.maxSpeed = maxSpeed;
            }

            public int getMaxSpeed() {
                  return this.maxSpeed;
            }
            // Добавим обязательный метод для потомков
            public abstract double calculateAllowedSpeed();
      }

      // Класс наследник - машина
      public class Car extends Vehicle {
            public Car(int maxSpeed) {
                  super(maxSpeed);
            }

            @Override
            public double calculateAllowedSpeed() {
                  return getMaxSpeed() * 0.8;
            }
      }

      // Класс наследник - автобус
      public class Bus extends Vehicle {
            public Bus(int maxSpeed) {
                  super(maxSpeed);
            }

            @Override
            public double calculateAllowedSpeed() {
                  return getMaxSpeed() * 0.6;
            }
      }
}
