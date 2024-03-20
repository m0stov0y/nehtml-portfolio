// Refrigerator.java
public class Refrigerator extends ElectricDevice implements Switchable {
    @Override
    public void switchOn() {
        System.out.println("Refrigerator включено");
    }
}