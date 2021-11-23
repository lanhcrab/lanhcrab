package week10;


import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
    /* Thứ tự nhập
        +) Số lượng các cuốn sách

        +) 1 số nguyên 0 hoặc 1 (nếu 0 là sách tham khảo, 1 là sách giáo khoa)

        +)  id (mã sách), name (tên sách), quantity (số lượng), publisher (NXB), price (giá)

        +)  status (trạng thái) với sách giáo khoa,  tax (thuế) đối với sách tham khảo.
    */
    public Book[] readData(Scanner sc) {

        int n = Integer.parseInt(sc.nextLine());
        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            Book book;
            int a = Integer.parseInt(sc.nextLine());
            if (a == 1) {

                String id = sc.nextLine();
                String name = sc.nextLine();
                int quantity = Integer.parseInt(sc.nextLine());
                String publisher = sc.nextLine();
                double price = Double.parseDouble(sc.nextLine());
                boolean status = Boolean.parseBoolean(sc.nextLine());

                book = new TextBook(id, name, quantity, publisher, price, status);

            }
            else {

                String id = sc.nextLine();
                String name = sc.nextLine();
                int quantity = Integer.parseInt(sc.nextLine());
                String publisher = sc.nextLine();
                double price = Double.parseDouble(sc.nextLine());
                double tax = Double.parseDouble(sc.nextLine());

                book = new ReferenceBook(id, name, quantity, publisher, price, tax);

            }

            books[i] = book;

        }

        return books;
    }
    // In thong tin các cuốn sách
    public void printBooks(Book[] books) {

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }

    }
    // Tìm các cuốn sách của nhà xuất bản publisher
    public ArrayList<Book> findBooks(Book[] books, String publisher) {

        ArrayList<Book> resFind = new ArrayList<Book>();
        for (int i = 0; i < books.length; i++) {
            Book x = books[i];
            if (x.getPublisher().equals(publisher)) {
                resFind.add(x);
            }
        }
        return resFind;

    }
    // Tính giá trị trung bình của các cuốn sách thuộc thể loại typeOfBooks
    public double computeAverage(Book[] books, String typeOfBooks) {

        double sum = 0.0;
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            Book y = books[i];
            if (y.getName().equals(typeOfBooks)) {
                sum += y.getPrice();
                count++;
            }
        }

        return sum/count;
    }
    // Sắp xếp các cuốn sách tăng dần về giá tiền
    public void sortByPrice(Book[] books) {

        for (int i = 0; i < books.length - 1; i++) {
            for (int j = i + 1; j > books.length ; j++) {
                if (books[i].getAmount() < books[j].getAmount()) {
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
    }
}

