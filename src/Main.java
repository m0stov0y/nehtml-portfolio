// Main.java
public class Main {
    public static void main(String[] args) {
        Switchable laptop = new Laptop();
        Switchable microwave = new Microwave();
        Switchable refrigerator = new Refrigerator();

        switchOnDevice(laptop);
        switchOnDevice(microwave);
        switchOnDevice(refrigerator);
    }

    public static void switchOnDevice(Switchable device) {
        device.switchOn();
    }
}