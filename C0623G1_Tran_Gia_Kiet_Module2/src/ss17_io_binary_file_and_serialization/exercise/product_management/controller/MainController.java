package ss17_io_binary_file_and_serialization.exercise.product_management.controller;

import ss17_io_binary_file_and_serialization.exercise.product_management.model.Product;
import ss17_io_binary_file_and_serialization.exercise.product_management.service.IProductService;
import ss17_io_binary_file_and_serialization.exercise.product_management.service.ProductService;

import java.util.Scanner;

public class MainController {
    private static IProductService productService = new ProductService();

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("Chương Trình Quản Lý Sản Phẩm");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1. Thêm sản phẩm ");
            System.out.println("2. Hiển thị danh sách sản phẩm ");
            System.out.println("3. Tìm kiếm thông tin sản phẩm theo tên");
            System.out.println("4. Tìm kiếm thông tin sản phẩm theo ID");
            System.out.println("0. Thoát");
            try {
                System.out.println("Chọn chức năng : ");
                select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                        productService.addProduct();
                        break;
                    case 2:
                        productService.showDisplay();
                        break;
                    case 3:
                        productService.searchInfoByName();
                        break;
                    case 4:
                        productService.searchInfoById();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Không có chức năng này");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập số vào b ơi ");
            }
        } while (true);
    }

}
