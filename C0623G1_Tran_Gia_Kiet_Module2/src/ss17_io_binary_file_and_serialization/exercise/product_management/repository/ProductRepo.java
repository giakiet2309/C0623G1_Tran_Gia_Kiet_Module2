package ss17_io_binary_file_and_serialization.exercise.product_management.repository;

import ss17_io_binary_file_and_serialization.exercise.product_management.model.Product;
import ss17_io_binary_file_and_serialization.exercise.product_management.utils.ReadAndWrite;
import sun.invoke.empty.Empty;


import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class ProductRepo implements IProductRepo {
    private final String FILE_PATH = "C:\\Users\\Gia Kiet\\Desktop\\C0623G1_Tran_Gia_Kiet_Module2\\C0623G1_Tran_Gia_Kiet_Module2\\src\\ss17_io_binary_file_and_serialization\\exercise\\product_management\\data\\product.csv";


    @Override
    public void addProduct(Product product) {
        List<Product> productList = this.showDisplay();
        productList.add(product);
        List<String> stringList = converToString(productList);
        ReadAndWrite.write(FILE_PATH, stringList);
    }

    @Override
    public List<Product> showDisplay() {
        List<String> stringList = ReadAndWrite.read(FILE_PATH);
        List<Product> newList = new ArrayList<>();
        String[] arrString = null;
        for (String p : stringList) {
            arrString = p.split(",");
            newList.add(new Product(Integer.parseInt(arrString[0]), arrString[1], Integer.parseInt(arrString[2]), arrString[3], arrString[4]));
        }
        if (!newList.isEmpty()) {
            return newList;
        }
        return new ArrayList<>();
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
