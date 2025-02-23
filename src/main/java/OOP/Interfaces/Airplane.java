package OOP.Interfaces;

public class Airplane implements Flyable, Honkable, CargoTransport {


    @Override
    public void carryCargo() {
        System.out.println("Самолёт везёт груз.");
    }

    @Override
    public void fly() {
        System.out.println("Самолёт летит.");
    }

    @Override
    public void honk() {
        System.out.println("Самолёт адски гудит.");
    }
}
