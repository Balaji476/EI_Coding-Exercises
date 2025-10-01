//Concrete observer
public class Ganesh implements Kid {
    @Override
    public void notifyIceCreamTruck(String flavor) {
        System.out.println("Ganesh runs outside for " + flavor + " ice cream!");
    }
}
