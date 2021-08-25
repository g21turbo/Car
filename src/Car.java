public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public boolean isEngine() {
        return engine;
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



class Porsche extends Car{


    public Porsche(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "You start the " + getName() + "'s engine";
    }

    @Override
    public String accelerate() {
        return "You press the gas and begin to accelerate.";
    }

    @Override
    public String brake() {
        return "You come to a slow stop as you approach a red light.";
    }

}



