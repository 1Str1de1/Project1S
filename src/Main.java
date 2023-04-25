public class Main {
    public static void main(String[] args) {
        int[][] matrice = {{12,34,32},
                          {28,46,-3},
                          {98,45,2}};
        for (int i = 0; i < matrice.length;i++){
            for (int j = 0; j < matrice[i].length;j++){
                System.out.print(matrice[i][j]+ " ");
            }
            System.out.println();
        }
    }

    }

