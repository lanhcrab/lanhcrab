package week7;
import java.util.Date;

public class Payment {

    private double amount;
    private Date date;

    public Payment() {

    }

    public Payment(double amount, Date date) {

        this.amount = amount;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Payment{" + "amount = " + amount + ", date = " + date + '}';
    }
}
