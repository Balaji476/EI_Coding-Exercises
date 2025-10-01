import java.util.*;

public class IceCreamTruck {
    private List<Kid> kids = new ArrayList<>();

    public void addKid(Kid k) {
        kids.add(k);
    }

    public void removeKid(Kid k) {
        kids.remove(k);
    }

    public void arrive(String flavor) {
        System.out.println("\nIce Cream Truck arrives with " + flavor + "!");
        for (Kid k : kids) {
            k.notifyIceCreamTruck(flavor);
        }
    }
}
