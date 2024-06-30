package week2.preview.overriding;

public class CarMain {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        GasCar gasCar = new GasCar();

        electricCar.move();
        electricCar.charge();

        gasCar.move();
        gasCar.fillup();
    }
}
