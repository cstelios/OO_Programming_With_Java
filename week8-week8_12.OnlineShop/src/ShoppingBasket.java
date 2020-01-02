import java.util.Map;
import java.util.HashMap;

public class ShoppingBasket {
    private Map<String, Purchase> purchases;
    
    public ShoppingBasket(){
        this.purchases = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price) {
        if (this.purchases.containsKey(product)) {
            this.purchases.get(product).increaseAmount();
        } else {
            this.purchases.put(product, new Purchase(product, 1, price));
        }
    }
    
    public int price() {
        int totalPrice = 0;
        for (Purchase purchase : purchases.values()) {
            totalPrice += purchase.price();
        }
        return totalPrice;
    }
    
    public void print() {
        for (Purchase purchase : purchases.values()) {
            System.out.println(purchase);
        }
    }
}
