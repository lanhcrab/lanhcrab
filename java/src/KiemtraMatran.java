import java.util.Scanner;

/**
 * Chương trình nhập một số nguyên dương n và ma trận nguyên A kích thước n x n
 * sau đó kiểm tra xem các phần tử của ma trận có giá trị từ 1 đến n*n hay không
 * Nếu đúng in ra màn hình thông báo "YES", nếu sai, in ra thông báo "NO"
 * **/
public class KiemtraMatran{

    public static int[][] input(Scanner sc, int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < (a[j])) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static int[] matrixToArray(int[][] matrix) {
        int n = 0;
        int[] arrray = new int[matrix.length*matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                arrray[n] = matrix[i][j];
                n++;
            }
        }
        return arrray;
    }

    public static boolean check(int[][] matrix) {
        int[] array = matrixToArray(matrix);
        sort(array);
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > matrix.length * matrix.length || array[i] < 1 || array[i] == array[i+1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = input(sc, n);
        if (check(a) == true)
            System.out.println("YES");
        else System.out.println("NO");
    }
}