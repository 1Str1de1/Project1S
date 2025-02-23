package OOP.New;

import java.io.*;

public class Files {
    public static void main(String[] args) {

        try (FileReader file = new FileReader("C:/Users/mrstr/OneDrive/Desktop/To-do-List.txt")) {
            int c;

            while ((c = file.read()) != -1) {

                System.out.println((char) c);

            }
        } catch (IOException ex ){
            System.out.println(ex.getMessage());
        }


    }
}
