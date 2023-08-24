package mvc_IO.product_management.service;

import mvc_IO.product_management.model.Product;
import mvc_IO.product_management.repository.IProductRepo;
import mvc_IO.product_management.repository.ProductRepo;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static IProductRepo productRepo = new ProductRepo();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct() {
        int id = 0;
        int price = 0;
        boolean idCheck = false;
        boolean priceCheck = false;
        do {
            try {
                System.out.println("Nhập id sản phẩm vào đây : ");
                id = Integer.parseInt(scanner.nextLine());
                idCheck = true;
            } catch (NumberFormatException e) {
                System.out.println("Không hợp lệ");
            }
        } while (!idCheck);
        System.out.println("Nhập tên sản phẩm vào đây:");
        String name = scanner.nextLine();
        do {
            try {
                System.out.println("Nhập giá sản phẩm vào đây");
                price = Integer.parseInt(scanner.nextLine());
                priceCheck = true;
            } catch (NumberFormatException e) {
                System.out.println("Không hợp lệ");
            }
        } while (!priceCheck);
        System.out.println("Nhập hãng sản xuất vào đây :");
        String manufacturer = scanner.nextLine();
        System.out.println("Nhập mô tả vào đây");
        String detail = scanner.nextLine();
        Product product = new Product(id, name, price, manufacturer, detail);
        productRepo.addProduct(product);
    }

    @Override
    public void showDisplay() {
        List<Product> productList = productRepo.showDisplay();
        if (!productList.isEmpty()) {
            for (Product product : productList) {
                System.out.println(product);
            }
        } else {
            System.out.println("Trong này ko có gì");
        }
    }


    @Override
    public void searchInfoByName() {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm ");
        String name = scanner.nextLine();
        for (Product product : productRepo.searchInfoByName(name)) {
            System.out.println(product);
        }
    }

    @Override
    public void searchInfoById() {
        int id = 0;
        boolean check = false;
        do {
            try {
                System.out.println("Nhập id sản phẩm bạn muốn tìm ");
                id = Integer.parseInt(scanner.nextLine());
                check = true;
            } catch (NumberFormatException e) {
                System.out.println("Không hợp lệ");
            }
        } while (!check);
        Product product = productRepo.searchInfoById(id);
        if (product != null){
            System.out.println(product);
        } else {
            System.out.println("khong tim thay");
        }
    }
}
