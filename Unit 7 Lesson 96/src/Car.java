public class Car {
    private int cylinders;
    private String name;
    private int wheels;
    private boolean engine;

    public Car(int cylinders, String name) {
        this.wheels = 4;
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Audi extends Car {
    public Audi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Audi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Audi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Audi -> brake()";
    }
}

class Mercedes extends Car {
    public Mercedes(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        return "Mercedes -> brake()";
    }

    @Override
    public String startEngine() {
        return "Mercedes -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mercedes -> accelerate()";
    }
}

class Mazda extends Car {
    public Mazda(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mazda -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mazda -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mazda -> brake()";
    }
}

