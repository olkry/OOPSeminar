public class Task03 {
      // Исходный код

      // public interface Shape {
      // double area();

      // double volume();
      // }

      // public class Circle implements Shape {
      // private double radius;

      // public Circle(double radius) {
      // this.radius = radius;
      // }

      // @Override
      // public double area() {
      // return 2 * 3.14 * radius;
      // }

      // @Override
      // public double volume() {
      // throw new UnsupportedOperationException();
      // }
      // }

      // public class Cube implements Shape {
      // private int edge;

      // public Cube(int edge) {
      // this.edge = edge;
      // }

      // @Override
      // public double area() {
      // return 6 * edge * edge;
      // }

      // @Override
      // public double volume() {
      // return edge * edge * edge;
      // }
      // }

      // Исправленный код
      //В данном случае просто разобьём на 2 разных интерфейса 
      //и будем подключать по мере необходимости
      public interface Area {
            double area();
      }

      public interface Volume {
            double volume();
      }

      public class Circle implements Area {
            private double radius;

            public Circle(double radius) {
                  this.radius = radius;
            }

            @Override
            public double area() {
                  return 2 * 3.14 * radius;
            }
      }

      public class Cube implements Volume, Area {
            private int edge;

            public Cube(int edge) {
                  this.edge = edge;
            }

            @Override
            public double area() {
                  return 6 * edge * edge;
            }

            @Override
            public double volume() {
                  return edge * edge * edge;
            }
      }
}
