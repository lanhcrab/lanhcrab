package week10;

public class TextBook extends Book {

    private boolean status;

    public TextBook(boolean status) {

        this.status = status;

    }

    public TextBook(String id, String name, int quantity, String publisher, double price, boolean status) {

        super(id, name, quantity, publisher, price);
        this.status = status;

    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public double getAmount() {
        if (isStatus() == true) {
            return getPrice() * getQuantity();
        }
        else return getPrice() * getQuantity() * 0.5;
    }

    @Override
    public String toString() {
        return "TextBook [status=" + status + ", getId()=" + getId() + ", getName()=" + getName() + ", getQuantity()="
                + getQuantity() + ", getPublisher()=" + getPublisher() + ", getPrice()=" + getPrice() + ", getAmount()="
                + getAmount() + "]";
    }
}

