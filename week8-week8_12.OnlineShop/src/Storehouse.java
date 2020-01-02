import java.util.*;

public class Storehouse {
    private Map<String, Integer> pricesOfProducts;
    private Map<String, Integer> stockOfProducts;
    
    public Storehouse() {
        this.pricesOfProducts = new HashMap<String, Integer>();
        this.stockOfProducts = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock){
        if(!this.pricesOfProducts.containsKey(product)) {
            this.pricesOfProducts.put(product, price);
            this.stockOfProducts.put(product, stock);
        }
    }
    
    public int price(String product) {
        if(this.pricesOfProducts.containsKey(product)) {
            return this.pricesOfProducts.get(product);
        }
        return -99;
    }
    
    public int stock(String product) {
        if(this.stockOfProducts.containsKey(product)) {
            return this.stockOfProducts.get(product);
        }
        return 0;
    }
    
    public boolean take(String product) {
        if (!this.stockOfProducts.containsKey(product)){
            return false;
        }
        if (this.stockOfProducts.get(product) > 0) {
            Integer currentStock = this.stockOfProducts.get(product);
            currentStock--;
            this.stockOfProducts.put(product, currentStock);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        return this.pricesOfProducts.keySet();
    }
}
