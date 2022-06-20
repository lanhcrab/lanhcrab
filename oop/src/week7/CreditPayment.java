package week7;

import java.util.Date;

public class CreditPayment extends Payment {

    private String transactionNumber;
    private String cardNumber;

    public CreditPayment(double amount, Date date, String transactionNumber, String cardNumber) {

        super(amount, date);
        this.transactionNumber = transactionNumber;
        this.cardNumber = cardNumber;

    }

    @Override
    public String toString() {
        return "CreditPayment{" +
                "transactionNumber = '" + transactionNumber + '\'' +
                ", cardNumber = '" + cardNumber + '\'' +
                '}';
    }
}
