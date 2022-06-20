package week7;

import java.util.ArrayList;
import java.util.List;

public class Reservation {

    private String reservationNumber;
    private List<Client> list;
    private Payment payment;

    public String getReservationNumber() {
        return reservationNumber;
    }

    public Reservation() {

        this.list = new ArrayList<>();

    }

    public Reservation(String reservationNumber, List<Client> list, Payment payment) {

        this.reservationNumber = reservationNumber;
        this.payment = payment;
        this.list = list;

        if (list.size() <= 100 ) {
            this.list = list;
        }
        else System.out.println("Too many people");

    }

    public void print() {
        System.out.println("Reservation[reservationNumber = " + reservationNumber + " , " + list.size() + " clients, payment = "
                + payment + ", Due With Discount: " + getDueWithDiscount() + "]");

    }

    public double getDue() {
        return list.size() * payment.getAmount();
    }

    public double getDueWithDiscount() {

        double sum = 0.0;

        for (Client i: list) {
            if (i.getType() == Type.GOLD) {
                sum += payment.getAmount() * 0.8;
            }
            else if (i.getType() == Type.SILVER) {
                sum += payment.getAmount() * 0.9;
            }
            else sum += payment.getAmount();
        }

        return sum;

    }
}
