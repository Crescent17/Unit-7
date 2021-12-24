public class HealthyBurger extends BasicHamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Brown rye", meat, price);
    }

    public void addHealthAddition1(String name, double price) {
        if (healthyExtra1Name == null) {
            this.healthyExtra1Name = name;
            this.healthyExtra1Price = price;
            System.out.println("Added " + name + ". Its price is " + price);
        } else {
            System.out.println("You've already used this addition");
        }
    }

    public void addHealthAddition2(String name, double price) {
        if (healthyExtra2Name == null) {
            this.healthyExtra2Name = name;
            this.healthyExtra2Price = price;
            System.out.println("Added " + name + ". Its price is " + price);
        } else {
            System.out.println("You've already used this addition");
        }
    }

    @Override
    public double getHamburgerPrice() {
        double healthyBurgerPrice = super.getHamburgerPrice();
        if (healthyExtra1Name != null) {
            healthyBurgerPrice += healthyExtra1Price;
        }
        if (healthyExtra2Name != null) {
            healthyBurgerPrice += healthyExtra2Price;
        }
        return healthyBurgerPrice;
    }
}
