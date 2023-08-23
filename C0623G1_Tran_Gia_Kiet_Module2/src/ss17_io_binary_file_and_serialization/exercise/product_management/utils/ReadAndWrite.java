package ss17_io_binary_file_and_serialization.exercise.product_management.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void write(String filePath, List<String> string) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : string) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static List<String> read(String filePath) {
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> strings = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return strings;
    }
}
