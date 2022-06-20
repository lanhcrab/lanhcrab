package week9;

import java.util.Collection;

public class OrderTest {
    public static void main(String[] args) {
        Product book = new Book("BO1", Category.BOOK, 90000, "Mai mai la bao xa", "Diep Lac Vo Tam");
        Product book1 = new Book("B02", Category.BOOK, 75000, "Hoang tu be", "Antoine de Saint-Exupéry" );
        Product book2 = new Book("BO3",Category.BOOK, 137000, "Khong gia dinh", "Hector Malot" );
        Product book3 = new Book("BO4",Category.BOOK, 450000, "Sherlock Holmes", "Arthur Conan Doyle");


        Product clothing = new Clothing("TH1", Category.CLOTHING, 150000, "Viet Nam", "Nu");
        Product clothing1 = new Clothing("TH2", Category.CLOTHING, 1820634000, "Gucci", "Nam");
        Product clothing2 = new Clothing("TH3", Category.CLOTHING, 1497990000, "Chanel", "Nu");

        Product music = new Music("00M", Category.MUSIC, 150000, "Hoat hinh", "CD");
        Product music1 = new Music("00M1", Category.MUSIC, 15000000, "K-pop", "MP3");
        Product music2 = new Music("00M2", Category.MUSIC, 450000, "Ballad", "CD");

        Order order = new Order();
        order.addProduct(book);
        order.addProduct(book1);
        order.addProduct(clothing);
        order.addProduct(book2);
        order.addProduct(music);
        order.addProduct(book3);
        order.addProduct(clothing1);
        order.addProduct(music1);
        order.addProduct(music2);
        order.addProduct(clothing2);
        order.print();

    }


}
