public class BasicHamburger {
    private String breadRollType;
    private String meat;
    private double price;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public BasicHamburger(String breadRollType, String meat, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        System.out.println("Default price is " + price);
    }

    public void addAddition1(String name, double price) {
        if (addition1Name == null) {
            this.addition1Name = name;
            this.addition1Price = price;
            System.out.println("Added " + name + ". Its price is " + price);
        } else {
            System.out.println("You've already used this addition");
        }
    }

    public void addAddition2(String name, double price) {
        if (addition2Name == null) {
            this.addition2Name = name;
            this.addition2Price = price;
            System.out.println("Added " + name + ". Its price is " + price);
        } else {
            System.out.println("You've already used this addition");
        }
    }

    public void addAddition3(String name, double price) {
        if (addition3Name == null) {
            this.addition3Name = name;
            this.addition3Price = price;
            System.out.println("Added " + name + ". Its price is " + price);
        } else {
            System.out.println("You've already used this addition");
        }
    }

    public void addAddition4(String name, double price) {
        if (addition4Name == null) {
            this.addition4Name = name;
            this.addition4Price = price;
            System.out.println("Added " + name + ". Its price is " + price);
        } else {
            System.out.println("You've already used this addition");
        }
    }

    public double getHamburgerPrice() {
        double hamburgerPrice = this.price;
        if (addition1Name != null) {
            hamburgerPrice += addition1Price;
        }
        if (addition2Name != null) {
            hamburgerPrice += addition2Price;
        }
        if (addition3Name != null) {
            hamburgerPrice += addition3Price;
        }
        if (addition4Name != null) {
            hamburgerPrice += addition4Price;
        }
        return hamburgerPrice;
    }
}
