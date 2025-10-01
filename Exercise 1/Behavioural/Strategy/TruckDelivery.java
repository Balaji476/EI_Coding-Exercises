public class TruckDelivery implements DeliveryStrategy {
    @Override
    public void deliver(String packageDetails) {
        System.out.println("Delivering " + packageDetails + " via Truck.");
    }
}
