package ss17_io_binary_file_and_serialization.exercise.product_management.repository;


import ss17_io_binary_file_and_serialization.exercise.product_management.model.Product;

import java.util.List;

public interface IProductRepo {
    void addProduct(Product product);

    List<Product> showDisplay();

    List<Product> searchInfoByName(String name);



    Product searchInfoById(int id);
}
