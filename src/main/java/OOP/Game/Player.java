package OOP.Game;

public class Player implements OOP.Game.Fieldable {

    private int rowIndex;
    private int columnIndex;
    private Field field;
    private Game game;
    private static final String MOVE_LEFT = "a";
    private static final String MOVE_RIGHT = "d";
    private static final String MOVE_UP = "w";
    private static final String MOVE_DOWN = "s";
    private static final String NO_MOVE = "z";


    @Override
    public String getSymbol() {

        return " $ ";

    }

    public Player(int rowIndex, int columnIndex, Game game) {

        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
        this.game = game;
        this.field = game.getField();
        field.setFieldable(rowIndex, columnIndex, this);

    }

    public void setRowIndex(int rowIndex) {

        this.rowIndex = rowIndex;

    }

    public int getRowIndex() {

        return rowIndex;

    }

    public void setColumnIndex(int columnIndex) {

        this.columnIndex = columnIndex;

    }

    public int getColumnIndex() {

        return columnIndex;

    }

    public Boolean makeMove(String command) {

        Boolean isIncorrectMove = true;

        switch (command) {
            case MOVE_LEFT:
                isIncorrectMove = movePlayer(0, -1);
                break;

            case MOVE_RIGHT:
                isIncorrectMove = movePlayer(0, 1);
                break;

            case MOVE_UP:
                isIncorrectMove = movePlayer(-1, 0);
                break;

            case MOVE_DOWN:
                isIncorrectMove = movePlayer(1, 0);
                break;

            case NO_MOVE:
                isIncorrectMove = false;
                break;

            default:
                showError(command);
                break;
        }

        return isIncorrectMove;
    }

    public Boolean movePlayer(int deltaRowIndex, int deltaColumnIndex) {

        int newRowIndex = rowIndex + deltaRowIndex;
        int newColumnIndex = columnIndex + deltaColumnIndex;

        if ((newRowIndex >= 0) && (newRowIndex < field.getSizeX())
                && (newColumnIndex >= 0) && (newColumnIndex < field.getSizeY())
                && !((field.getFieldable(newRowIndex, newColumnIndex) instanceof Enemy))) {

            if (field.getFieldable(newRowIndex, newColumnIndex) instanceof Flower) {

                Flower flower = (Flower) field.getFieldable(newRowIndex, newColumnIndex);
                game.setTransistorsGathered(flower.getTransistors());
                game.getFlowerArrayList().remove(flower);
                swapPlayer(newRowIndex, newColumnIndex);

            }

            if (field.getFieldable(newRowIndex, newColumnIndex) instanceof EmptyCell) {
                swapPlayer(newRowIndex, newColumnIndex);
            }
            return false;

        }
        else {
            return true;
        }
    }

    private void swapPlayer(int newRowIndex, int newColumnIndex) {
        field.setFieldable(newRowIndex, newColumnIndex, this);
        field.setFieldable(rowIndex, columnIndex, new EmptyCell());
        rowIndex = newRowIndex;
        columnIndex = newColumnIndex;

    }

    private void showError(String command) {

        System.out.println("Sorry, there is no " + command +
                " command, please verify and try again");

    }
}
