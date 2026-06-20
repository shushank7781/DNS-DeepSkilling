import java.util.Arrays;
import java.util.Comparator;

public class TestSearch {

    public static void main(String[] args) {

        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(3, "Shoes", "Fashion"),
            new Product(4, "Watch", "Accessories")
        };

        Product linearResult =
                SearchEngine.linearSearch(products, "Phone");

        if (linearResult != null) {
            System.out.println("Linear Search Found: "
                    + linearResult.productName);
        }

        Arrays.sort(products,
                Comparator.comparing(p -> p.productName));

        Product binaryResult =
                SearchEngine.binarySearch(products, "Phone");

        if (binaryResult != null) {
            System.out.println("Binary Search Found: "
                    + binaryResult.productName);
        }
    }
}