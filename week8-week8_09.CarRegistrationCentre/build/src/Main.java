
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // below is the same examle program as in the assignment

        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        List<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");

        if (!finnish.contains(newPlate)) {
            finnish.add(newPlate);
        }

        System.out.println("Finnish: " + finnish);
        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list

        HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
        owners.put(reg1, "Arto");
        owners.put(reg2, "test1");
        owners.put(reg3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(reg3));
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println(owners.toString());
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        // if the hashCode hasn't been overwritten, the owners are not found

        VehicleRegister ar = new VehicleRegister();

        System.out.println(ar.toString());

        ar.add(new RegistrationPlate("FI", "AAA-111"), "Arto");
        ar.add(new RegistrationPlate("FI", "BBB-222"), "Pekka");
        ar.add(new RegistrationPlate("FI", "ZZZ-333"), "Arto");

        ar.printOwners();
    }
}