package OOP.Interfaces;

public class Truck implements Movable, Honkable, CargoTransport{

    String brand;
    int capacity;

    @Override
    public void move() {
        System.out.println("Грузовик едет.");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился.");
    }

    @Override
    public void carryCargo() {
        System.out.println("Грузовик везёт груз.");
    }

    @Override
    public void honk() {
        System.out.println("ГУУУУДООООК");
    }
}
