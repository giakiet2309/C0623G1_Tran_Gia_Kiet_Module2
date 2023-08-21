package ss16_io_text_file.exercise.copy_text_file;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextFile {
    public static void main(String[] args) {
        String sourceFilePath = "source.txt";
        String targetFilePath = "target.txt";

        try {

            FileReader sourceFileReader = new FileReader(sourceFilePath);
            StringBuilder content = new StringBuilder();
            int character;
            while ((character = sourceFileReader.read()) != -1) {
                content.append((char) character);
            }
            sourceFileReader.close();


            FileWriter targetFileWriter = new FileWriter(targetFilePath);
            targetFileWriter.write(content.toString());
            targetFileWriter.close();

            int charCount = content.length();


            System.out.println("Đã sao chép thành công từ " + sourceFilePath + " đến " + targetFilePath);
            System.out.println("Số ký tự trong tệp là: " + charCount);
        } catch (IOException e) {

            System.err.println("Lỗi: " + e.getMessage());
        }
    }
}
