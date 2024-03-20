// Laptop.java
public class Laptop extends ElectricDevice implements Switchable {
    @Override
    public void switchOn() {
        System.out.println("Laptop включено");
    }
}