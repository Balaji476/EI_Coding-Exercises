//Delivery System
import java.util.*;

public class Main {
    public static void main(String[] args) {
        DeliveryService service = new DeliveryService();

        
        service.setDeliveryStrategy(new BikeDelivery());
        service.deliverPackage("Documents");

        service.setDeliveryStrategy(new TruckDelivery());
        service.deliverPackage("Furniture");

        
        service.setDeliveryStrategy(new DroneDelivery());
        service.deliverPackage("Medicines");
    }
}

