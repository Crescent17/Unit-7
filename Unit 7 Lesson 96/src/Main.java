public class Main {
    public static void main(String[] args) {
        Car mazda = new Mazda(8, "CX5");
        Car mercedes = new Mercedes(10, "AMG");
        Car audi = new Audi(9, "R8");
        System.out.println(mazda.accelerate());
        System.out.println(mercedes.brake());
        System.out.println(audi.startEngine());
    }
}
