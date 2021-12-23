public class Chandelier {
    private boolean isOn;

    public Chandelier() {
        this.isOn = false;
    }

    public void chandelierSwitch() {
        if (!isOn) {
            isOn = true;
            System.out.println("Chandelier was turned on");
        } else {
            isOn = false;
            System.out.println("Chandelier was turned off");
        }
    }
}
