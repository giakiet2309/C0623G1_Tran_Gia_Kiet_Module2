package ss17_io_binary_file_and_serialization.exercise.product_management.repository;

import ss17_io_binary_file_and_serialization.exercise.product_management.model.Product;
import ss17_io_binary_file_and_serialization.exercise.product_management.utils.ReadAndWrite;
import sun.invoke.empty.Empty;


import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class ProductRepo implements IProductRepo {
    private final String FILE_PATH = "C:\\Users\\Gia Kiet\\Desktop\\C0623G1_Tran_Gia_Kiet_Module2\\C0623G1_Tran_Gia_Kiet_Module2\\src\\ss17_io_binary_file_and_serialization\\exercise\\product_management\\data\\product.dat";


    @Override
    public void addProduct(Product product) {
        List<Product> productList = this.showDisplay();
        productList.add(product);
        ReadAndWrite.writeFile(FILE_PATH, productList);
    }

    @Override
    public List<Product> showDisplay() {
        List<Product> stringList = ReadAndWrite.readFile(FILE_PATH);
        return stringList;
    }

    @Override
    public List<Product> searchInfoByName(String name) {
        List<Product> newName = this.showDisplay();
        List<Product> result = new ArrayList<>();
        for (Product product : newName) {
            if (product.getName().contains(name)) {
                result.add(product);
            }
        }
        return result;
    }

    @Override
    public Product searchInfoById(int id) {
        List<Product> newId = this.showDisplay();
        for (int i = 0; i < newId.size(); i++) {
            if (newId.get(i).getId() == id) {
                return newId.get(i);
            }
        }
        return null;
    }

    public static List<String> converToString(List<Product> productList) {
        List<String> stringList = new ArrayList<>();
        for (Product product : productList) {
            stringList.add(product.getId() + "," + product.getName() + "," + product.getPrice() + "," + product.getManufacturer() + "," + product.getDetail());
        }
        return stringList;
    }
}
