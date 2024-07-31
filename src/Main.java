import entities.Customer;
import entities.Order;
import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private final static Random rand = new Random();

    public static void main(String[] args) {
        List<Product> books = new ArrayList<>();
        List<Product> babyProducts = new ArrayList<>();
        List<Product> boysProducts = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            Product book = new Product("Book " + i, "Books", rand.nextInt(5, 200));
            books.add(book);
        }
        for (int i = 0; i < 10; i++) {
            Product babyProduct = new Product("Baby product " + i, "Baby", rand.nextInt(5, 50));
            babyProducts.add(babyProduct);
        }
        for (int i = 0; i < 10; i++) {
            Product boysProduct = new Product("Boy product " + i, "Boys", rand.nextInt(5, 50));
            boysProducts.add(boysProduct);
        }

        Customer aldo = new Customer("Aldo Baglio", 2);
        Customer giovanni = new Customer("Giovanni Storti", 3);
        Customer giacomo = new Customer("Giacomo Poretti", 1);

        Order aldoOrder = new Order("Sent", addToCart(books, babyProducts, boysProducts), aldo);
        Order giovanniOrder = new Order("Pending", addToCart(books, babyProducts, boysProducts), giovanni);
        Order giacomoOrder = new Order("Sent", addToCart(books, babyProducts, boysProducts), giacomo);

        System.out.println(aldoOrder);
        System.out.println(giovanniOrder);
        System.out.println(giacomoOrder);


        System.out.println("--------------Es1------------------");
        System.out.println("Lista libri:");
        books.forEach(System.out::println);
        List<Product> expensiveBooks = books.stream().filter(book -> book.getPrice() > 100).toList();
        System.out.println("Lista libri costosi:");
        expensiveBooks.forEach(System.out::println);
    }

    public static List<Product> addToCart(List<Product> list1, List<Product> list2, List<Product> list3) {
        List<Product> shoppingCart = new ArrayList<>();
        for (int i = 0; i < rand.nextInt(0, 10); i++) {
            int randomList = rand.nextInt(1, 3);
            switch (randomList) {
                case 1 -> shoppingCart.add(list1.get(i));
                case 2 -> shoppingCart.add(list2.get(i));
                case 3 -> shoppingCart.add(list3.get(i));
            }
        }
        return shoppingCart;
    }
}