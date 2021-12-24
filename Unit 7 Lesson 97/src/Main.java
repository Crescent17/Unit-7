public class Main {
    public static void main(String[] args) {
        BasicHamburger basicHamburger = new BasicHamburger("Default", "meat", 10);
        basicHamburger.addAddition1("cheese", 2);
        basicHamburger.addAddition1("milk", 30);
        basicHamburger.addAddition2("tomato", 0.5);
        System.out.println("Total price is " + basicHamburger.getHamburgerPrice());

        HealthyBurger healthyBurger = new HealthyBurger("bacon", 5);
        System.out.println(healthyBurger.getHamburgerPrice());
        healthyBurger.addHealthAddition1("egg", 1);
        healthyBurger.addAddition2("qwet", 40);
        System.out.println(healthyBurger.getHamburgerPrice());
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addAddition1("qwe", 12);
        deluxeBurger.addAddition3("tq", 234);
        System.out.println(deluxeBurger.getHamburgerPrice());
    }
}
