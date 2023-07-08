package OOP.Game;

public class Game {

    private int sizeX;
    private int sizeY;
    private int amountOfEnemies;
    private int transistorsAmountNeeded;
    private int movesLeft;
    private int transistorsGathered;
    private Field field;
    private boolean isGameFinished;

    public Game(int sizeX, int sizeY, int amountOfEnemies, int transistorsAmountNeeded, int movesLeft) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.amountOfEnemies = amountOfEnemies;
        this.transistorsAmountNeeded = transistorsAmountNeeded;
        this.movesLeft = movesLeft;
        field = new Field(sizeX, sizeY);

    }

    public void fillFieldWithEmptyObjects() {

        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                field.setFieldable(i, j, new EmptyCell());
            }
        }
    }

    public void startGame() {

        possesPlayer();
        possesEnemies();
        possesFlowers();

        while(!isGameFinished) {

            showField();
            playerTurn();
            computerTurn();
            checkIfGameNotFinished();
        }
    }

    private void possesPlayer() {

    }
    private void possesEnemies() {

    }
    private void possesFlowers() {

    }

    private void showField() {

    }
    private void playerTurn() {

    }
    private void computerTurn() {

    }
    private void checkIfGameNotFinished() {

    }
}
