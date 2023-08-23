package ss17_io_binary_file_and_serialization.exercise.copy_file;


import java.io.*;

public class FileCopyBinary {
    public static void main(String[] args) {

        String sourceFilePath = "C:\\Users\\Gia Kiet\\Desktop\\C0623G1_Tran_Gia_Kiet_Module2\\C0623G1_Tran_Gia_Kiet_Module2\\src\\ss17_io_binary_file_and_serialization\\exercise\\copy_file\\5_230804355623232.jpg";
        String targetFilePath = "C:\\Users\\Gia Kiet\\Desktop\\C0623G1_Tran_Gia_Kiet_Module2\\C0623G1_Tran_Gia_Kiet_Module2\\src\\ss17_io_binary_file_and_serialization\\exercise\\copy_file\\filecopy.jpg";

        File sourceFile = new File(sourceFilePath);
        File targetFile = new File(targetFilePath);

        if (!sourceFile.exists()) {
            System.out.println("Tập tin nguồn không tồn tại.");
            return;
        }

        if (targetFile.exists()) {
            System.out.println("Tập tin đích đã tồn tại. Vui lòng chọn tên tập tin khác.");
            return;
        }

        try (
                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(targetFile);
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;


            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Đã sao chép tệp thành công.");
            System.out.println("Số byte sao chép: " + targetFile.length());
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi sao chép tệp: " + e.getMessage());
        }
    }
}
