package OOP.Interfaces;

public class Helicopter implements Flyable, Honkable, CargoTransport {

    @Override
    public void carryCargo() {
        System.out.println("Вертолёт везёт груз.");
    }

    @Override
    public void fly() {
        System.out.println("Вертолёт летит.");
    }

    @Override
    public void honk() {
        System.out.println("ВРВРРВРВРВРВРРВР");
    }
}
