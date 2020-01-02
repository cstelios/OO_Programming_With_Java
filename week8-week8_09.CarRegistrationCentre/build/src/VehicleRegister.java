import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owner;
    
    public VehicleRegister() {
        this.owner = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add (RegistrationPlate plate, String owner) {
        if (this.owner.containsKey(plate)) {
            return false;
        }
        
        this.owner.put(plate, owner);
        return true;
    }
    
    public String get(RegistrationPlate plate){
        return this.owner.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate) {
        if (this.owner.containsKey(plate)) {
            this.owner.remove(plate);
            return true;
        }
        return false;
    }
    
    public void printRegistrationPlates() {
        for (Map.Entry<RegistrationPlate,String> entry : this.owner.entrySet()) {
            RegistrationPlate plate = entry.getKey();
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<String>();
        for (Map.Entry<RegistrationPlate,String> entry : this.owner.entrySet()) {
            String owner = entry.getValue();
            if (!owners.contains(owner)) {
                owners.add(owner);
            }
        }
        for (String owner : owners) {
            System.out.println(owner);
        }
    }
}
