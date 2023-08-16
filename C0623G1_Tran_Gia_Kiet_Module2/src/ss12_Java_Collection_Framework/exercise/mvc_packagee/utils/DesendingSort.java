package ss12_Java_Collection_Framework.exercise.mvc_packagee.utils;

import ss12_Java_Collection_Framework.exercise.mvc_packagee.model.Product;

import java.util.Comparator;

public class DesendingSort implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
