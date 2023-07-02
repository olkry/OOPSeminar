import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PensionerClient;
import Classes.PromoClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviuor;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Создаём сам магазин и поситеителей
         */
        Market magnit = new Market();
        // Возврат будет происходить в отдельной очереди
        Market returnMagnit = new Market();
        iActorBehaviuor client1 = new OrdinaryClient("Boris");
        iActorBehaviuor client2 = new SpecialClient("prezident", 1001);
        iActorBehaviuor p = new PensionerClient("Sergey Nikolay", 1111);
        iActorBehaviuor tax = new TaxService();
        // новые клиенты по акции
        iActorBehaviuor promo = new PromoClient("Berezov", "Top Sale", 654);
        iActorBehaviuor promo2 = new PromoClient("Sergeev", "Top Sale", 678);
        iActorBehaviuor promo3 = new PromoClient("Temnikov", "Top Sale", 456);
        iActorBehaviuor promo4 = new PromoClient("Morozov", "Top Sale", 789);
        // Добавим покупателя, который быстро проведёт возврат
        iActorBehaviuor tax2 = new TaxService();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(p);
        magnit.acceptToMarket(tax);
        magnit.acceptToMarket(promo);
        magnit.acceptToMarket(promo2);
        magnit.acceptToMarket(promo3);
        magnit.acceptToMarket(promo4);



        magnit.update();
        returnMagnit.acceptToReturn(tax2);
    }
}
