package ss12_Java_Collection_Framework.exercise.mvc_packagee.controller;

import ss12_Java_Collection_Framework.exercise.mvc_packagee.service.IProductService;
import ss12_Java_Collection_Framework.exercise.mvc_packagee.service.ProductService;

import java.util.Scanner;

public class MainController {
    private static IProductService productService = new ProductService();

    public static void showMenu() {

        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            System.out.println("Chương Trình Quản Lý Sản Phẩm");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1. Thêm sản phẩm ");
            System.out.println("2. Sửa thông tin sản phẩm theo id ");
            System.out.println("3. Xóa sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm ");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("0. Thoát");
            System.out.println("Chọn chức năng : ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.editProductById();
                    break;
                case 3:
                    productService.delProductById();
                    break;
                case 4:
                    System.out.println("1. Sắp xếp tăng");
                    System.out.println("2. Sắp xếp giảm");
                    System.out.println("0. Quay lại");
                    int selecetOption ;
                    selecetOption = Integer.parseInt(scanner.nextLine());
                    switch (selecetOption) {
                        case 1:
                            productService.ascendingSort();
                            break;
                        case 2:
                            productService.desendingSort();
                            break;
                        case 0:
                            showMenu();
                            break;
                    }
                    break;
                case 5:
                    productService.searchProductByName();
                    break;
                default:
                    System.out.println("Nhập lại");
                case 0:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

}
