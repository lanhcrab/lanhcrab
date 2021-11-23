package Card;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CardManagement {


    public CardManagement()
    {
        super();
    }
    /*
        Thứ tự nhập như sau:
        - Số lượng xe
        - Trong vòng lặp để nhập thông tin mỗi thẻ: nhập số nguyên c = 0 (thẻ học sinh) hoặc 1 (thẻ nhân viên)
        - Nhập thông tin mỗi thẻ: id, years, day, price, fee (với thẻ sinh viên), và card (với thẻ học sinh)
    */
    public ArrayList<Card> readData (String fileName)
    {
        ArrayList<Card> res = new ArrayList<Card>();

        try {
            Scanner sc = new Scanner(new File(fileName));
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                int c = Integer.parseInt(sc.nextLine());
                if (c == 0) {
                    String id = sc.nextLine();
                    int year = Integer.parseInt(sc.nextLine());
                    double days = Double.parseDouble(sc.nextLine());
                    double price = Double.parseDouble(sc.nextLine());
                    double fee = Double.parseDouble(sc.nextLine());

                    StudentCard studentCard = new StudentCard(id, year, days, price, fee);
                    res.add(studentCard);
                }

                else if (c == 1){
                    String id = sc.nextLine();
                    int year = Integer.parseInt(sc.nextLine());
                    double days = Double.parseDouble(sc.nextLine());
                    double price = Double.parseDouble(sc.nextLine());
                    double tax = Double.parseDouble(sc.nextLine());

                    StaffCard staffCard = new StaffCard(id, year, days, price, tax);
                    res.add(staffCard);
                }
            }
        }
        catch (Exception e) {
                e.printStackTrace();
        }

        return res;

    }

    public void printArrayList(ArrayList<Card> cards) {
        for (int i =0;i<cards.size();i++)
            System.out.println(cards.get(i).toString());
    }
    // Hoan thien phuong thuc findCards de tim nhung  xe co nam san xuat la year

    public ArrayList<Card> findCards (ArrayList<Card> cards, int year){

        ArrayList<Card> resFind = new ArrayList<Card>();
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getYear() == year)
                resFind.add(cards.get(i));
        }
        return resFind;

    }

    // Hoan thien phuong thuc getMaxAmount de tim cac xe thuoc the loai typeOfCard
    public ArrayList<Card> getMaxAmount (ArrayList<Card> cards, String typeOfCard){

        double max = Double.MIN_VALUE + 2;
        ArrayList<Card> resMaxAmount = new ArrayList<Card>();
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getClass().getSimpleName().equals(typeOfCard)) {
                if (cards.get(i).getAmount() > max) {
                    max = cards.get(i).getAmount();
                }
            }
        }

        for (int i = 0; i < cards.size(); i++) {
            if (max == cards.get(i).getAmount())
                resMaxAmount.add(cards.get(i));
        }
        return resMaxAmount;

    }


    // Hoan thien phuong thuc sortByAmount de sap xep cac xe theo thu tu giam dan
    public void sortByAmount (ArrayList<Card> cards) {

        for (int i = 0; i < cards.size() - 1; i++) {
            for (int j = i + 1; j < cards.size() ; j++) {
                if (cards.get(i).getAmount() < cards.get(j).getAmount()) {
                    Card temp = cards.get(i);
                    cards.set(i, cards.get(j));
                    cards.set(j, temp);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        CardManagement cardMng = new CardManagement();
        ArrayList<Card> cards = cardMng.readData("datas.txt");
    }

}

