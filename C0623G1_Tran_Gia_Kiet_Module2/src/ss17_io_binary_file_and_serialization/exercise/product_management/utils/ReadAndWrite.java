package ss17_io_binary_file_and_serialization.exercise.product_management.utils;

import ss17_io_binary_file_and_serialization.exercise.product_management.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void writeFile(String path, List<Product> products) {
        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Product product : products) {
                oos.writeObject(product);
            }
            oos.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Product> readFile(String path) {
        List<Product> products = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(path);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (fis.available() > 0) {
                Product product = (Product) ois.readObject();
                products.add(product);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return products;
    }
}
