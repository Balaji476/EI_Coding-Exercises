

// Adapter converts SmartDevice calls to real device methods
public class DeviceAdapter implements SmartDevice {
    private Object device;

    public DeviceAdapter(Object device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        if (device instanceof PhilipsBulb) {
            ((PhilipsBulb) device).powerOnHue();
        } else if (device instanceof XiaomiBulb) {
            ((XiaomiBulb) device).startBulb();
        }
    }

    @Override
    public void turnOff() {
        if (device instanceof PhilipsBulb) {
            ((PhilipsBulb) device).powerOffHue();
        } else if (device instanceof XiaomiBulb) {
            ((XiaomiBulb) device).stopBulb();
        }
    }
}

