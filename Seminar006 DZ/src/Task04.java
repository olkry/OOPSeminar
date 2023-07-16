public class Task04 {
      // Исходный код

      // public class Rectangle {
      // private int width;
      // private int height;

      // public void setWidth(int width) {
      // this.width = width;
      // }

      // public void setHeight(int height) {
      // this.height = height;
      // }

      // public int area() {
      // return this.width * this.height;
      // }
      // }

      // public class Square extends Rectangle {
      // @Override
      // public void setWidth(int width) {
      // super.width = width;
      // super.height = width;
      // }

      // @Override
      // public void setHeight(int height) {
      // super.width = height;
      // super.height = height;
      // }
      // }

      // // попробуем вынести в интерфейс площадь, т.к. надо переопределять для 2х
      // фигур
      // interface Area {
      // public int area();
      // }

      // // Сначала сконструируем квадрат, т.к. стороны равны
      // public class Square implements Area {
      // int side1;

      // public Square(int side1) {
      // this.side1 = side1;
      // }

      // @Override
      // public int area() {
      // return side1 * side1;
      // }

      // }

      // // От него создадим наследника - прямоугольник.

      // public class Rectangle extends Square {
      // int side2;

      // public Rectangle(int side1, int side2) {
      // super(side1);
      // this.side2 = side2;
      // }

      // @Override
      // public int area() {
      // // TODO Auto-generated method stub
      // return side1 * side2;
      // }

      // } //Получилось не слишком практично, переписываем

      // // Создадим абстрактную фигуру, у большинства фигур есть размер одной стороны
      // и площадь
      public abstract class Figure {
            int side1;

            public Figure(int side1) {
                  this.side1 = side1;
            }

            // Абстрактный, т.к. переопределяется для каждой фигуры
            abstract public int area();
      }

      // Собственно квадрат
      public class Square extends Figure {

            public Square(int side1) {
                  super(side1);
            }

            @Override
            public int area() {
                  return side1 * side1;
            }

      }

      // наследуем от квадрата, сверху добовляется одна отличная сторона и меняем
      // площадь
      public class Rectangle extends Square {
            int side2;

            public Rectangle(int side1, int side2) {
                  super(side1);
                  this.side2 = side2;
            }

            @Override
            public int area() {
                  return side1 * side2;
            }

      }
}
