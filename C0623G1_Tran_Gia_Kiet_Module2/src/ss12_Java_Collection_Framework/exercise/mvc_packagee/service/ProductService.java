package ss12_Java_Collection_Framework.exercise.mvc_packagee.service;

import ss12_Java_Collection_Framework.exercise.mvc_packagee.model.Product;
import ss12_Java_Collection_Framework.exercise.mvc_packagee.repository.IProductRepo;
import ss12_Java_Collection_Framework.exercise.mvc_packagee.repository.ProductRepo;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static IProductRepo productRepo = new ProductRepo();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct() {
        System.out.println("Nhập ID sản phẩm vào : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm vào đây");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm vào đây : ");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        productRepo.addProduct(product);
    }

    @Override
    public void editProductById() {
        System.out.println("Nhập ID cần tìm kiếm vào đây");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Tên mới của sản phẩm");
        String newName = scanner.nextLine();
        System.out.println("Gía tiền mới của sản phẩm");
        int newPrice = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, newName, newPrice);
        System.out.println(productRepo.editProductById(id, product));
    }

    @Override
    public void delProductById() {
        System.out.println("Nhập ID cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println(productRepo.delProductById(id));

    }

    @Override
    public void displayProduct() {
        List<Product> productsList = productRepo.displayProduct();
        for (Product product : productsList) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProductByName() {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm ");
        String name = scanner.nextLine();
        System.out.println(productRepo.searchProductByName(name));
    }

    @Override
    public void ascendingSort() {
        List<Product> productsList = productRepo.ascendingSort();
        for (Product product : productsList) {
            System.out.println(product);
        }
    }

    @Override
    public void desendingSort() {
        List<Product> productsList = productRepo.desendingSort();
        for (Product product : productsList) {
            System.out.println(product);
        }


    }

}