import java.util.ArrayList;

public class Box implements ToBeStored {
    private ArrayList<ToBeStored> storedItems;
    private double maxWeight;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.storedItems = new ArrayList<ToBeStored>();
    }
    
    public double weight() {
        double currentWeight = 0;
        for (ToBeStored item : storedItems) {
            currentWeight += item.weight();
        }
        return currentWeight;
    }
    
    public void add(ToBeStored newItem) {
        if (weight() < this.maxWeight) {
            if ((weight() + newItem.weight()) < this.maxWeight) {
                this.storedItems.add(newItem);
            }
        }
    }
    
    @Override
    public String toString() {
        return "Box: " + this.storedItems.size() + " things, total weight " + this.weight() + " kg";
    }
}
