public class BikeDelivery implements DeliveryStrategy {
    @Override
    public void deliver(String packageDetails) {
        System.out.println("Delivering " + packageDetails + " via Bike.");
    }
}