// Microwave.java
public class Microwave extends ElectricDevice implements Switchable {
    @Override
    public void switchOn() {
        System.out.println("Microwave включено");
    }
}