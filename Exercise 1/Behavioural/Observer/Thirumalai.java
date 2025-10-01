//concrete observer

public class Thirumalai implements Kid {
    @Override
    public void notifyIceCreamTruck(String flavor) {
        System.out.println("Thirumalai runs outside for " + flavor + " ice cream!");
    }
}

