package ss12_Java_Collection_Framework.exercise.mvc_packagee.repository;

import ss12_Java_Collection_Framework.exercise.mvc_packagee.model.Product;

import java.util.List;

public interface IProductRepo {


    void addProduct(Product product);

    String editProductById(int id,Product product);

    String delProductById(int id);

    List<Product> displayProduct();

    String searchProductByName(String name);

    List<Product> ascendingSort();

    List<Product> desendingSort();

}
