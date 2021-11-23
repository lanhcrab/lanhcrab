import java.util.Scanner;

/**
 * Chương trình nhập ma trận nguyên kích thước m x n,
 * sau đó xóa đi dòng có chỉ số k
 * **/
public class XoaCot {

    public static int[][] input(int m, int n, Scanner sc) {

        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }

    public static int[][] delCol(int m, int n, int c, int[][] array) {

        int [][] b = new int[m][n - 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j != c) {
                    if (j < c) {
                        b[i][j] = array[i][j];
                    }
                    else b[i][j - 1] = array[i][j];
                }
            }
        }
        return b;
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
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] a = input(m, n, sc);
        int[][]res = delCol(m, n, k, a);
        output(res);

    }
}
