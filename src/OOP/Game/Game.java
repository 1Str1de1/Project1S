package OOP.Game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private int sizeX;
    private int sizeY;
    private int amountOfEnemies;
    private int transistorsAmountNeeded;
    private int movesLeft;
    private int transistorsGathered;
    private Field field;
    private Boolean isGameFinished = false;
    private int amountOfFlowers;
    private ArrayList<Flower> flowerArrayList = new ArrayList<Flower>();
    private ArrayList<Enemy> enemyArrayList = new ArrayList<Enemy>();
    private Random randomNumber = new Random();
    private Player player;
    private Scanner scanner = new Scanner(System.in);
    private Boolean isIncorrectCommand = true;
    private int triesToRegenerate = 10;

    public Game(int sizeX, int sizeY, int amountOfEnemies, int transistorsAmountNeeded, int movesLeft,
                int amountOfFlowers) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.amountOfEnemies = amountOfEnemies;
        this.transistorsAmountNeeded = transistorsAmountNeeded;
        this.movesLeft = movesLeft;
        this.amountOfFlowers = amountOfFlowers;
        field = new Field(sizeX, sizeY);

    }

    public Field getField() {
        return this.field;
    }

    public ArrayList<Flower> getFlowerArrayList() {
        return this.flowerArrayList;
    }

    public void setTransistorsGathered(int transistorsToAdd) {
        this.transistorsGathered += transistorsToAdd;
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

        while (!isGameFinished) {

            showField();
            playerTurn();
            if (isIncorrectCommand) {
                incorrectCommand();
                continue;

            }
            computerTurn();
            checkIfGameNotFinished();

        }
    }

    private void incorrectCommand() {

        System.out.println("You have entered an incorrect command!" +
                " Please verify and try again.");

    }


    private void possesPlayer() {

        int playerRowPosition = randomNumber.nextInt(sizeX);
        int playerColumnPosition = randomNumber.nextInt(sizeY);

        player = new Player(playerRowPosition, playerColumnPosition, this);

    }

    private void possesEnemies() {
        generateEnemies();
    }

    private void generateEnemies() {

        for (int i = amountOfEnemies - enemyArrayList.size(); i > 0; ) {

            int enemyRowPosition = randomNumber.nextInt(sizeX);
            int enemyColumnPosition = randomNumber.nextInt(sizeY);

             if (field.getFieldable(enemyRowPosition, enemyColumnPosition)
                    instanceof EmptyCell) {

                Enemy enemy = new Enemy(enemyRowPosition, enemyColumnPosition);
                field.setFieldable(enemyRowPosition, enemyColumnPosition, enemy);
                enemyArrayList.add(enemy);
                i--;

            }
        }
    }



    private void possesFlowers() {
        generateFlowers();
    }

    private void generateFlowers() {

        for (int i = amountOfFlowers - flowerArrayList.size(); i > 0; ) {

            int flowerAmountOfTransistors = randomNumber.nextInt(9) + 1;
            int flowerRowPosition = randomNumber.nextInt(sizeX);
            int flowerColumnPosition = randomNumber.nextInt(sizeY);

            if (field.getFieldable(flowerRowPosition, flowerColumnPosition)
                    instanceof Player) {

                transistorsGathered = transistorsGathered + flowerAmountOfTransistors;
                i--;

            } else if (field.getFieldable(flowerRowPosition, flowerColumnPosition)
                    instanceof EmptyCell) {

                Flower flower = new Flower(flowerAmountOfTransistors, flowerRowPosition, flowerColumnPosition);
                field.setFieldable(flowerRowPosition, flowerColumnPosition, flower);
                flowerArrayList.add(flower);
                i--;

            }
        }
    }

    private void showField() {

        System.out.println("\n\nMoves left: " + movesLeft +
                ", transistors gathered: " + transistorsGathered +
                "/" + transistorsAmountNeeded);

        field.showField();

    }

    private void playerTurn() {

        System.out.println("Please enter your command and press Enter");
        String command = scanner.nextLine();

        isIncorrectCommand = player.makeMove(command);
    }

    private void computerTurn() {

        enemyMove();
        generateFlowers();
        movesLeft--;

    }

    private void enemyMove() {

        int rowIndex = 0;
        int columnIndex = 0;
        int newRowIndex = 0;
        int newColumnIndex = 0;
        int regenerateIndex = 0;
        boolean isNeededToRegenerate = true;

        for (Enemy enemy : enemyArrayList) {

            rowIndex = enemy.getRowIndex();
            columnIndex = enemy.getColumnIndex();

            do {

                int deltaRow = randomNumber.nextInt(3) - 1;
                int deltaColumn = randomNumber.nextInt(3) - 1;

                newRowIndex = rowIndex + deltaRow;
                newColumnIndex = columnIndex + deltaColumn;

                if ((newRowIndex < 0) || (newColumnIndex < 0) || (newRowIndex >= field.getSizeX()) ||
                        (newColumnIndex >= field.getSizeY()) || (field.getFieldable(newRowIndex, newColumnIndex) instanceof Player) ||
                        (field.getFieldable(newRowIndex, newColumnIndex) instanceof Enemy)) {

                    regenerateIndex++;
                    isNeededToRegenerate = true;

                } else {
                    if (field.getFieldable(newRowIndex, newColumnIndex) instanceof Flower) {

                        Flower flower = (Flower) field.getFieldable(newRowIndex, newColumnIndex);
                        flowerArrayList.remove(flower);

                        isNeededToRegenerate = swapEnemy(rowIndex,columnIndex, newRowIndex, newColumnIndex, enemy);

                    } else {

                        isNeededToRegenerate = swapEnemy(rowIndex,columnIndex, newRowIndex, newColumnIndex, enemy);

                    }
                }

            } while (isNeededToRegenerate && regenerateIndex <= 10);

        }
    }

    private boolean swapEnemy(int rowIndex, int columnIndex, int newRowIndex, int newColumnIndex, Enemy enemy) {

        field.setFieldable(newRowIndex,newColumnIndex, enemy);
        field.setFieldable(rowIndex, columnIndex, new EmptyCell());

        enemy.setRowIndex(newRowIndex);
        enemy.setColumnIndex(newColumnIndex);

        return false;
    }

    private void checkIfGameNotFinished() {

        if (movesLeft == 0) {

            System.out.println("No moves left, you lost!");
            isGameFinished = true;

        } else if (transistorsGathered >= transistorsAmountNeeded) {

            System.out.println("\nYou have gathered the required amount of transistors, you won!!!\n");
            isGameFinished = true;

        }
    }


}
