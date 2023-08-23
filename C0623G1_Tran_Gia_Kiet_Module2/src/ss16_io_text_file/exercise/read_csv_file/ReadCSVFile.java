package ss16_io_text_file.exercise.read_csv_file;


import java.io.*;
import java.util.ArrayList;

public class ReadCsvFile {
    public static ArrayList<String[]> readCSVFile(String path) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        ArrayList<String[]> list = new ArrayList<String[]>();
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                list.add(data);

            }


        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return list;
    }
}
