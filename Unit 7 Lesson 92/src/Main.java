public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Phone phone = new Phone(true);
        Chandelier chandelier = new Chandelier();
        Room room = new Room(computer, phone, chandelier);
        room.makeACall();
        room.getComputer().computerSwitch();
        room.getComputer().computerSwitch();
        room.getChandelier().chandelierSwitch();
        room.getChandelier().chandelierSwitch();
    }
}
