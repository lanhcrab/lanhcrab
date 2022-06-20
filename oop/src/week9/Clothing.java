package week9;

public class Clothing extends Product {

    private String brand;
    private String deparment;

    public Clothing(String id, Category category, double price, String brand, String deparment ) {

        super(id, category, price);
        this.brand =  brand;
        this.deparment = deparment;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "brand='" + brand + '\'' +
                ", deparment='" + deparment + '\'' +
                '}';
    }
}
