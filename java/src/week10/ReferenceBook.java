package week10;

class ReferenceBook extends Book {

    private double tax;

    public ReferenceBook(String id, String name, int quantity, String publisher, double price) {

        super(id, name, quantity, publisher, price);

    }

    public ReferenceBook(String id, String name, int quantity, String publisher, double price, double tax) {

        super(id, name, quantity, publisher, price);
        this.tax = tax;

    }

    @Override
    public double getAmount() {
        return getPrice() * getQuantity() + this.tax;
    }

    @Override
    public String toString() {
        return "ReferenceBook [tax=" + tax + ", getId()=" + getId() + ", getName()=" + getName() + ", getQuantity()="
                + getQuantity() + ", getPublisher()=" + getPublisher() + ", getPrice()=" + getPrice()+ ", getAmount()=" + getAmount() +  "]";
    }
}

