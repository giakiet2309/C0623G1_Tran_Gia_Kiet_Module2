package mvc_IO.product_management.repository;

import mvc_IO.product_management.model.Product;

import java.util.List;

public interface IProductRepo {
    void addProduct(Product product);

    List<Product> showDisplay();

    List<Product> searchInfoByName(String name);


    Product searchInfoById(int id);
}
