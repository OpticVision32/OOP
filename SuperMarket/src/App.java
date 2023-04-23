import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviour;
import Classes.Promo;
public class App {
    public static void main(String[] args) throws Exception {
    //    Market market = new Market();
    //    OrdinaryClient client1 = new OrdinaryClient("Boris");
    //    OrdinaryClient client2 = new OrdinaryClient("Dasha");
    //    SpecialClient client3 = new SpecialClient("Fedor", 1101);
    //    market.acceptToMarket(client1);
    //    market.acceptToMarket(client2);
    //    market.acceptToMarket(client3);
    //    market.update();

    Market market = new Market();
    iActorBehaviour item1 = new OrdinaryClient("Boris");
    iActorBehaviour item2 = new SpecialClient("Igor", 3366);
    iActorBehaviour item3 = new OrdinaryClient("Dasha");
    iActorBehaviour item4 = new Promo("Sergey");
    iActorBehaviour item5 = new Promo("Sasha");
    iActorBehaviour item6 = new Promo("Lena");
    iActorBehaviour item7 = new Promo("Artur");
    iActorBehaviour item8 = new Promo("Evgen");

    market.acceptToMarket(item1);
    market.acceptToMarket(item2);
    market.acceptToMarket(item3);
    market.acceptToMarket(item4);
    market.acceptToMarket(item5);
    market.acceptToMarket(item6);
    market.acceptToMarket(item7);
    market.acceptToMarket(item8);

    market.update();
    }
}
