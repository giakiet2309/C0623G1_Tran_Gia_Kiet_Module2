package ss16_io_text_file.exercise.read_csv_file;


import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String[]> list = new ArrayList<String[]>();
        list = ReadCsvFile.readCSVFile("C:\\Users\\Gia Kiet\\Desktop\\C0623G1_Tran_Gia_Kiet_Module2\\C0623G1_Tran_Gia_Kiet_Module2\\src\\ss16_io_text_file\\exercise\\read_csv_file\\Nation.csv");

        for (String[] strings : list) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Danh sách các quốc gia có trong list");

    }
}
