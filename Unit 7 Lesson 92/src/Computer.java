public class Computer {
    private boolean isOn;

    public Computer() {
        this.isOn = false;
    }

    public void computerSwitch() {
        if (!isOn) {
            isOn = true;
            System.out.println("Computer was turned on");
        } else {
            isOn = false;
            System.out.println("Computer was turned off");
        }
    }
}
