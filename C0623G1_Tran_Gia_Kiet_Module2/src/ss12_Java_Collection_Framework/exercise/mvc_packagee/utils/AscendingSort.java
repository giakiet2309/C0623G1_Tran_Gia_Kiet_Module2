package ss12_Java_Collection_Framework.exercise.mvc_packagee.utils;

import ss12_Java_Collection_Framework.exercise.mvc_packagee.model.Product;

import java.util.Comparator;

public class AscendingSort implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
