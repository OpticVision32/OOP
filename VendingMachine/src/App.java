import Products.Product;
import VendingMachine.VendingMachine;
import Products.BottleOfWatter;
import Products.HotDrink;
public class App {
        public static void main(String[] args) throws Exception {

            Product item1 = new Product("Cola",88.0);
            item1.setPrice(98.0);
    
            VendingMachine itemMachin = new VendingMachine(300);
            itemMachin.addProduct(item1);
            itemMachin.addProduct(new Product("Чипсы", 60.0));
            itemMachin.addProduct(new Product("Масло", 50.0));
            itemMachin.addProduct(new Product("Хлеб", 40.0));
            itemMachin.addProduct(new Product("Снек", 20.0));
            itemMachin.addProduct(new BottleOfWatter("Cola", 88.0, 500 ));
            itemMachin.addProduct(new BottleOfWatter("Water", 188.0, 1500 ));
            itemMachin.addProduct(new HotDrink("Coffe", 120.0, 80.0 ));
            itemMachin.addProduct(new HotDrink("Tea", 80.0, 70.5 ));
    
            for(Product prod: itemMachin.getProdAll())
            {
                System.out.println(prod.toString());
            }
        
        
        
        
    }
}
