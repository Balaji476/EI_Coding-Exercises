public class DroneDelivery implements DeliveryStrategy {
    @Override
    public void deliver(String packageDetails) {
        System.out.println("Delivering "+ packageDetails + " via Drone.");
    }
}