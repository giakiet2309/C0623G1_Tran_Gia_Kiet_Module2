package ss07_abtract_class_and_interface.practice.interface_comparable;

import java.util.Arrays;

public class ComparableTest {
    public static void main(String[] args) {
        ComparabelCircle[] comparabelCircle = new ComparabelCircle[4];
        comparabelCircle[0] = new ComparabelCircle(3.2);
        comparabelCircle[1] = new ComparabelCircle(1);
        comparabelCircle[2] = new ComparabelCircle(5);
        comparabelCircle[3] = new ComparabelCircle(3.5);
        System.out.println("Trước khi sắp xếp");

        for (ComparabelCircle c : comparabelCircle) {
            System.out.println(c);
        }

        System.out.println("Trước khi sắp xếp");
        Arrays.sort(comparabelCircle); // thư viện sắp xếp của Java
        for (ComparabelCircle c : comparabelCircle) {
            System.out.println(c);
        }
    }
}
