import java.util.Scanner;

public class Room {
    private Computer computer;
    private Phone phone;
    private Chandelier chandelier;

    public Chandelier getChandelier() {
        return chandelier;
    }

    public Room(Computer computer, Phone phone, Chandelier chandelier) {
        this.computer = computer;
        this.phone = phone;
        this.chandelier = chandelier;
    }

    public void makeACall() {
        if (phone.isCharged()) {
            System.out.print("Enter the number: ");
            Scanner scanner = new Scanner(System.in);
            while (true) {
                boolean isAnInt = scanner.hasNextInt();
                scanner.nextLine();
                if (isAnInt) {
                    System.out.println("Calling...");
                    break;
                } else {
                    System.out.println("Invalid number");
                }
            }
        } else {
            System.out.println("The phone is not charged");
        }
    }

    public Computer getComputer() {
        return computer;
    }
}
