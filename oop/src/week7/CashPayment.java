package week7;

import java.util.Date;

public class CashPayment extends Payment{

    private String receiptNumber;

    public CashPayment(double amount, Date date, String receiptNumber) {

        super(amount, date);
        this.receiptNumber = receiptNumber;

    }

    @Override
    public String toString() {
        return "CashPayment{" +
                "receiptNumber = '" + receiptNumber + '\'' +
                '}';
    }
}
