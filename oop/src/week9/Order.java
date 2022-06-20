package week9;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String orderNumber;
    private List<Product> list;

    public String getOrderNumber() {
        return orderNumber;
    }

    public Order() {
        this.list = new ArrayList<>();
    }

    public void addProduct(Product product) {
        list.add(product);
    }

    public Order(String orderNumber, List<Product> list) {

        this.orderNumber = orderNumber;
        this.list = list;

        if (list.size() <= 100)
            this.list = list;
        else System.out.println("Excesssive");

    }
    public double getTotalPrice() {

        double totalPrice = 0.0;
        for (int i = 0; i < list.size(); i++) {
            totalPrice += list.get(i).getPrice();
        }
        return totalPrice;

    }

    public double getTotalPriceWithDiscount() {

        double totalPriceWithDiscount = 0.0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCategory().equals(Category.BOOK))
                totalPriceWithDiscount += list.get(i).getPrice() * 0.75;
            else totalPriceWithDiscount += list.get(i).getPrice();
        }
        return totalPriceWithDiscount;
    }

    public void print() {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        System.out.println("Total Price = " + getTotalPrice());
        System.out.println("Total Price With Discount = " + getTotalPriceWithDiscount());

    }




}
