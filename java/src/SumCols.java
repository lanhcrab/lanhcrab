import java.util.Scanner;

// Nhập ma trận A cỡ m x n, sau đó in ra n tổng các phần tử của n cột.
class SumCols {

    public static int[][] input(Scanner sc) {

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }

    public static void sumCol(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[j][i];
            }
            System.out.print(sum + " ");
        }
    }

    public static void output(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int n = sc.nextInt();
        int[][] a = input(sc);
        output(a);
        sumCol(a);
    }
}