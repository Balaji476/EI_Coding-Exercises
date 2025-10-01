//Client side 
import java.util.*;

public class SmartHomeHub {
    public static void main(String[] args) {
        
        List<SmartDevice> devices = new ArrayList<>();
        devices.add(new DeviceAdapter(new PhilipsBulb()));
        devices.add(new DeviceAdapter(new XiaomiBulb()));

        System.out.println("Turning ON all devices !!!");
        for (SmartDevice device : devices) {
            device.turnOn();
        }

        System.out.println("\nTurning OFF all devices !!!");
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }
}

