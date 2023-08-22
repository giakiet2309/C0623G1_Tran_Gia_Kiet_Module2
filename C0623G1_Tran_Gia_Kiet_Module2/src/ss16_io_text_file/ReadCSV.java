package ss16_io_text_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadCSV {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File("data.csv");
        FileReader fr = new FileReader(file);
        Scanner sc = new Scanner(fr);


        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] data = line.split(",");


            System.out.println(data[0] + ", " + data[1] + ", " + data[2]);
        }

        sc.close();
    }
}
