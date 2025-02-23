package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesProbovat {
    public static void main(String[] args) {

    File dir = new File("C://Dir");
    File file = new File("C://Anton//Dir", "ab.txt");

        File newFile = new File("C://Anton//Proga//NewFile");

        System.out.println(newFile.getName());

    }

}
