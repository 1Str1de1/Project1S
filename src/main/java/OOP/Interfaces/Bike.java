package OOP.Interfaces;

public class Bike implements Movable {

    String brand;

    @Override
    public void move() {
        System.out.println("Велосипед едет");
    }

    @Override
    public void stop() {
        System.out.println("Велосипед остановился");
    }
}
