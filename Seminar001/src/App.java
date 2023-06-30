import java.util.ArrayList;
import java.util.List;

import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        List<Product> assort = new ArrayList<>();
        Product item1 = new Product(100, 1, "Lays");
        Product item2 = new Product(50, 2, "Cola");
        Product item3 = new Bottle(150, 3, "Mineralka", 101, (float) 1.5);
        /**
         * Добовляем по домашнему заданию 3 товара, 1 - конструктор без указания
         * температуры и 2 с температурой
         */
        Product itemDZ1 = new HotDrink(25, 4, "Cold Tea", 123);
        HotDrink itemDZ2 = new HotDrink(35, 6, "Hot Tea", 456, 40);
        Product itemDZ3 = new HotDrink(60, 5, "Coffe", 789, 85);
        /**
         * Добовляем теплые напитки в ассортимент, вводим их в начало списка
         */
        assort.add(itemDZ2);
        assort.add(itemDZ3);
        assort.add(itemDZ1);

        assort.add(item2);
        assort.add(item1);
        assort.add(item3);
        Holder hold1 = new Holder(4, 4);
        CoinDispenser coinDisp = new CoinDispenser(0);
        Display disp = new Display();
        /**
         * Тут список товаров подгружается в машину, через assort
         */
        VendingMachine venMachine = new VendingMachine(hold1, coinDisp, assort, disp);
        /**
         * выводим список товаров по одному, т.к. метод getProducts в классе
         * VendingMachine возвращает список assort
         */
        for (Product prod : venMachine.getProducts()) {
            System.out.println(prod);
        }
        // Дополнительно посмотрим работу методов, т.к явно указан, без полиморфизма
        // только 2ой продукт, тесты на нём.

        System.out.println(itemDZ2.getTemperature());
        itemDZ2.seemTemperature();

    }
}
