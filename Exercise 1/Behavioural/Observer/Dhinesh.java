//Concrete observer
public class Dhinesh implements Kid {
    @Override
    public void notifyIceCreamTruck(String flavor) {
        System.out.println("Dhinesh runs outside for " + flavor + " ice cream!");
    }
}