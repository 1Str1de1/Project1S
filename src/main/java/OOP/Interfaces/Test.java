package OOP.Interfaces;

public class Test {
    public static void main(String[] args) {

        Movable moveBike = new Bike();
        Flyable flyableAirplane = new Airplane();
        Honkable honkableTruck = new Truck();
        CargoTransport cargoAirplane = new Airplane();
        Helicopter helicopter = new Helicopter();

        helicopter.fly();
        helicopter.carryCargo();
        helicopter.honk();

        flyableAirplane.fly();
        honkableTruck.honk();
        cargoAirplane.carryCargo();

        moveBike.move();
        moveBike.stop();


    }
}
