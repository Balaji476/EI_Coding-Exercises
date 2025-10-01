public class DeliveryService {
    private DeliveryStrategy strategy;

   
    public void setDeliveryStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public void deliverPackage(String packageDetails) {
        strategy.deliver(packageDetails);
    }
}
