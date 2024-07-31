import entities.Product;

public class Main {
    public static void main(String[] args) {
        Product gamba = new Product("Gamba", "Arte", 10);
        System.out.println(gamba.getCategory());
    }
}