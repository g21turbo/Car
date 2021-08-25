public class Main {


    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Porsche nineEleven = new Porsche(6, "911");
        System.out.println(nineEleven.startEngine());
        System.out.println(nineEleven.accelerate());
        System.out.println(nineEleven.brake());

        Ford taurusSHO = new Ford(6, "Taurus SHO");
        System.out.println(taurusSHO.startEngine());
        System.out.println(taurusSHO.accelerate());
        System.out.println(taurusSHO.brake());


    }
}
