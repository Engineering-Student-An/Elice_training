package week2.preview.overriding;

public class ElectricCar extends Car{

    public void charge() {
        System.out.println("차를 충전합니다.");
    }

    public void move() {
        System.out.println("전기차를 이동합니다!!");
    }
}
