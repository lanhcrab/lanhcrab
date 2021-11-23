package week10;

public class Book {
    private String id;
    private String name;
    private int quantity;
    private String publisher;
    private double price;
    private double amount;

    public Book() {
        // TODO Auto-generated constructor stub
    }

    public Book(String id, String name, int quantity, String publisher, double price) {

        super();
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.publisher = publisher;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return price*quantity;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}

