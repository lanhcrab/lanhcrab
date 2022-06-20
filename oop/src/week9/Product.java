package week9;

public class Product {

    private String id;
    private Category category;
    private double price;

    public Product() {

    }

    public Product(String id, Category category, double price) {

        this.id = id;
        this.category = category;
        this.price = price;

    }

    public Product(String id, Category category) {

        this.id = id;
        this.category = category;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id = '" + id + '\'' +
                ", category = " + category +
                ", price = " + price +
                '}';
    }
}
