package OOP.Interfaces;

public class Car implements Movable, Honkable{


    @Override
    public void honk() {
        System.out.println("Бип-бип!!!");
    }

    @Override
    public void move() {
        System.out.println("Машина едет.");
    }

    @Override
    public void stop() {
        System.out.println("Машина остановилась.");
    }
}
