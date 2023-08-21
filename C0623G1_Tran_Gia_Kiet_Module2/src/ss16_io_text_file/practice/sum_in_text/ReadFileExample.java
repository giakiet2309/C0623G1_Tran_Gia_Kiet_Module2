package ss16_io_text_file.practice.sum_in_text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            // Đọc file hướng dẫn
            File file = new File(filePath);
            // Kiểm tra mếu không có file thì ném ra ngoại lệ
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);

            }
            br.close();
            // Hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng = " + sum);

        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file:");
        Scanner scanner = new Scanner(System.in);
        String path= scanner.nextLine();
        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(path);
    }
}