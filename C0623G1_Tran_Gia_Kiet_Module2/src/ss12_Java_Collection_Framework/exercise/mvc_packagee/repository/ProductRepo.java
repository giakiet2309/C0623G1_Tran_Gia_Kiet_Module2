package ss12_Java_Collection_Framework.exercise.mvc_packagee.repository;

import com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORB;
import ss12_Java_Collection_Framework.exercise.mvc_packagee.model.Product;
import ss12_Java_Collection_Framework.exercise.mvc_packagee.utils.AscendingSort;
import ss12_Java_Collection_Framework.exercise.mvc_packagee.utils.DesendingSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepo implements IProductRepo {

    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Táo", 10000));
        productList.add(new Product(2, "Lê", 20000));
        productList.add(new Product(3, "Ổi", 30000));
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public String editProductById(int id, Product product) {
        boolean check = true;
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.get(i).setName(product.getName());
                productList.get(i).setPrice(product.getPrice());
                check = false;
                break;
            }

        }
        if (check) {
            return "Id không tồn tại";
        }
        return "Edit Thành công";
    }

    @Override
    public String delProductById(int id) {
        boolean check = true;
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.remove(productList.get(i));
                check = false;
                break;
            }
        }
        if (check) {
            return "Id không tồn tại";
        }
        return "Xóa thành công";
    }

    @Override
    public List<Product> displayProduct() {
        return productList;
    }

    @Override
    public String searchProductByName(String name) {
        boolean check = true;
        List<Product> newName = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                newName.add(productList.get(i));
                check = false;
            }
        }
        if (check) {
            return "Không tìm ra";
        } else {
            return newName.toString();
        }
    }

    @Override
    public List<Product> ascendingSort() {
        AscendingSort ascendingSort = new AscendingSort();
        Collections.sort(productList, ascendingSort);
        return productList;
    }

    @Override
    public List<Product> desendingSort() {
        DesendingSort desendingSort = new DesendingSort();
        Collections.sort(productList, desendingSort);
        return productList;
    }
}
