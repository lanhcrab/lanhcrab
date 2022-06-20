package week7;

import java.util.*;

public class ReservationTester {

    public static void main(String[] args) {

        Payment credit = new CreditPayment(150000, new Date(), "198", "22210003857442");
        Payment cash = new CashPayment(1200000, new Date(), "125");
        List<Client> list = new ArrayList<>();
        list.add(new Client("0G1", Type.GOLD));
        list.add(new Client("0G2", Type.GOLD));
        list.add(new Client("0S3", Type.SILVER));
        list.add(new Client("0N4", Type.NORMAL));

        List<Client> list1 = new ArrayList<>();
        list1.add(new Client("0G5", Type.GOLD));
        list1.add(new Client("0N6", Type.NORMAL));
        list1.add(new Client("0G7", Type.GOLD));
        list1.add(new Client("0S8", Type.SILVER));

        Reservation reservation = new Reservation("198" , list, credit);
        System.out.println("Without Discount: " + reservation.getDue());
        System.out.println("Discount: " + reservation.getDueWithDiscount());
        reservation.print();

        System.out.println();

        Reservation reservation1 = new Reservation("125", list1, cash);
        System.out.println("Without Discount:" + reservation1.getDue());
        System.out.println("Discount:" + reservation1.getDueWithDiscount());
        reservation1.print();


    }

}
