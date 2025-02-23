package OOP.Game;

public class Flower implements Fieldable {

    private int transistors;
    private int rowIndex;
    private int columnIndex;

    @Override
    public String getSymbol() {
        return String.valueOf(" " + transistors + " ");
    }

    public Flower(int transistors, int columnIndex, int rowIndex) {
        this.transistors = transistors;
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }
    public int getTransistors() {
        return transistors;
    }

    public void setRowIndex(int columnIndex) {
        this.columnIndex = columnIndex;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (rowIndex != flower.rowIndex) return false;
        return columnIndex == flower.columnIndex;
    }

    @Override
    public int hashCode() {
        int result = rowIndex;
        result = 31 * result + columnIndex;
        return result;
    }

}
