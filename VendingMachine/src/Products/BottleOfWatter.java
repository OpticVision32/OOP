package Products;

public class BottleOfWatter extends Product {
    private int volume;
    public BottleOfWatter(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(){
        this.volume = volume;
    }
    
    @Override
    public String toString()
    {
        return  "Product{" +
        "name='" + super.getName() + '\'' +
        ", cost=" + super.getPrice() +
        ", volume=" + volume +
        '}';
    }
}
