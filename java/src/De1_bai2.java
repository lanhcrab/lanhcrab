/**
 * Hoàn thiện các phương thức trong lớp De1_bai2 theo các yêu cầu
 * như trong phần mô tả và đề bài. Các phương thức cần được giữ nguyên dạng
 * tên / danh sách tham đối/ kiểu trả về/ mẫu khai báo ....
 * */
import java.util.Scanner;

public class De1_bai2{

    /* thực hiện nhập số nguyên m, n và trả lại mảng hai chiều m x n số nguyên nhập từ bàn phím */
    public static int[][] readMatrix(Scanner reader){

        int m = reader.nextInt();
        int n = reader.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = reader.nextInt();
            }
        }
        return array;

    }

    /* thực hiện việc in mảng hai chiều Mtr ra màn hình dạng ma trận */
    public static void printMatrix(int[][] Mtr){

        for (int i = 0; i < Mtr.length; i++) {
            for (int j = 0; j < Mtr[i].length; j++) {
                System.out.print(Mtr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /* thực hiện kiểm tra trong ma trận Mtr có hai cột bằng nhau  hay không. */
    public static boolean checkColumn(int[][] Mtr, int x, int y) {

        for (int[] ints : Mtr) {
            if (ints[x] != ints[y]) {
                return false;
            }
        }
        return true;

    }

    public static boolean isColsEqual(int[][] Mtr){

        for (int i = 0; i < Mtr[i].length - 1; i++) {
            for (int j = i + 1; j < Mtr[i].length; j++) {
                if (checkColumn(Mtr, i, j)) {
                    return true;
                }
            }
        }
        return false;

    }

    /* thực hiện tính và trả về tổng các phần tử dòng thứ k của Mtr (chỉ số chiều thứ nhất) */
    public static int sumRowsMember(int[][] Mtr, int k){

        int sum = 0;
        for (int i = 0; i < Mtr.length; i++) {
            for (int j = 0; j < Mtr[i].length; j++) {
                if (j == k) {
                    sum += Mtr[i][j];
                }
            }

        }
        return sum;
    }


    /* thực hiện việc tính và in tổng phần tử các dòng của Mtr ra màn hình */
    public static void printRowsSum(int[][] Mtr){

        for (int i = 0; i < Mtr.length; i++) {
            int sum = 0;
            for (int j = 0; j < Mtr[i].length; j++) {
                sum += Mtr[i][j];
            }
            System.out.println(sum + " ");
        }
        System.out.println();

    }

    

}
