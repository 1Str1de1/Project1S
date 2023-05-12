package OOP.TasksFromInternet;

public class Matrice {

    private int rows;
    private int cols;
    private int [][] matrice = new int[rows][cols];

    public void setRows(int rows) {
        this.rows = rows;
    }
    public int getRows() {
        return rows;
    }
    public void setCols(int cols) {
        this.cols = cols;
    }
    public int getCols() {
        return cols;
    }public void setMatrice(int rows, int cols) {
        this.rows = rows;
    }
}
