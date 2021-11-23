import java.util.Scanner;

/**
 * Chương trình nhập một số nguyên n và mảng gồm n số nguyên
 * sau đó in ra giá trị nhỏ nhất và lớn nhất của mảng trên cùng dòng, 
 * cách nhau bởi một khoảng trống. Cần giữ khung chương trình.
 * */
//import <libraries needed here>

public class FindMinMax{

    public static int[] input(Scanner sc) {

        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int findMin(int Array[]){

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] < min)
                min = Array[i];

        }
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == min)
                min = Array[i];
        }
        return min;
    }

    public static int findMax(int Array[]){

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > max)
                max = Array[i];
        }
        return max;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int[] a = input(sc);
        System.out.print(findMin(a) + " " + findMax(a));
        
    }

}