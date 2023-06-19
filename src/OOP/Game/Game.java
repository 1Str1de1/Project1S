package OOP.Game;

public class Game {

    private int sizeX;
    private int sizeY;
    private int amountOfEnemies;
    private int transistorsAmountNeeded;
    private int movesLeft;
    private int transistorsGathered;
    private Field field;

    public Game(int sizeX, int sizeY, int amountOfEnemies, int transistorsAmountNeeded, int movesLeft) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.amountOfEnemies = amountOfEnemies;
        this.transistorsAmountNeeded = transistorsAmountNeeded;
        this.movesLeft = movesLeft;
        field = new Field(sizeX,sizeY);
    }

}
