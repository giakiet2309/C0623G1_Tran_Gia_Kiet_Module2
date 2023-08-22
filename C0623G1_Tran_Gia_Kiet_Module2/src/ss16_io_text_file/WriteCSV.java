package ss16_io_text_file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteCSV {

    public static void main(String[] args) throws IOException {
        List<String> data = new ArrayList<>();
        data.add("Tên, Tuổi, Giới tính");
        data.add("Kiệt, 20, Nam");
        data.add("Xí, 21, Nữ");


        File file = new File("data.csv");
        FileWriter fw = new FileWriter(file);


        for (String line : data) {
            fw.write(line + "\n");
        }


        fw.close();
    }
}
