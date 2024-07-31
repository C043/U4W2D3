package entities;

public class Product extends HasNameAndId {
    private final String category;
    private final double price;

    public Product(String name, String category, double price) {
        super(name);
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
