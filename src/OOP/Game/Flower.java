package OOP.Game;

public class Flower implements Fieldable {

    private int transistors;
    @Override
    public String getSymbol() {
        return String.valueOf(transistors);
    }

    public Flower(int transistors) {
        this.transistors = transistors;
    }
    public int getTransistors() {
        return transistors;
    }

}
