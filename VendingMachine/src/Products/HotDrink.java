package Products;

public class HotDrink extends Product {
    private double temperature;
    public HotDrink(String name, double price, double temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    @Override
    public String toString()
    {
        return  "Product{" +
        "name='" + super.getName() + '\'' +
        ", cost=" + super.getPrice() +
        ", temperature=" + temperature +
        '}';
    }
}
