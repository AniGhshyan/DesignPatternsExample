package openClosedPrincipale;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);
        Product clothes = new Product("clothes", Color.RED, Size.MEDIUM);

        List<Product> products = new ArrayList<>();
        products.add(apple);
        products.add(tree);
        products.add(house);
        products.add(clothes);

        ProductFilter pf = new ProductFilter();
        System.out.println("Green products (old):");
        pf.filterByColor(products, Color.GREEN).forEach(p -> System.out.println(" - " + p.name + " is green"));

        BetterFilter bf = new BetterFilter();
        System.out.println("Green products (new):");
        bf.filter(products, new ColorSpecification(Color.GREEN)).forEach(p -> System.out.println(" - " + p.name + " is green"));

        System.out.println("Large blue items: ");
        bf.filter(products, new AndSpecification<>(new ColorSpecification(Color.BLUE),
                new SizeSpecification(Size.LARGE))).forEach(p -> System.out.println(" - " + p.name + " is large and blue"));
    }
}
