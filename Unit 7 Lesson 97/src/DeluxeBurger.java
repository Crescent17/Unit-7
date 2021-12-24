public class DeluxeBurger extends BasicHamburger {
    public DeluxeBurger() {
        super("White", "Sausage and Bacon", 8);
        super.addAddition1("Chips", 2);
        super.addAddition2("Drink", 1.2);
    }

    @Override
    public void addAddition1(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }
}
