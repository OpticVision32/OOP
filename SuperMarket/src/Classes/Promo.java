package Classes;
import Interfaces.iReturnOrder;
public class Promo extends Actor implements iReturnOrder{
    private String promoLine;

    public Promo(String name) {
        super(name);
        this.promoLine = getCurrentPromoLine();
    }

    public String getCurrentPromoLine() {
        return "скидка -30%";
    }

    @Override
    public String getName() {
        return super.name;
    }

    public String getPromoLine() {
        return this.promoLine;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean tookOrder) {
        super.isTakeOrder = tookOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public Actor getActor() {
        return this;
    }
    
    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }

    @Override
    public void setReturnOrder(boolean returnOrder) {
        super.isReturnOrder = returnOrder;        
    }
}
