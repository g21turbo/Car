class Ford extends Car{


    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "You start the " + getName() + "'s engine";
    }

    @Override
    public String accelerate() {
        return "You mash the gas and take off.";
    }

    @Override
    public String brake() {
        return "You pump the brakes as you come to the stop sign.";
    }

}



