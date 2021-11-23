import java.util.Scanner;

public class Bai2_de1 {

    public static int[][] inputMatrix(Scanner reader) {

        int n = reader.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = reader.nextInt();
            }
        }
        return a;

    }

    public static boolean isUpperTriangle(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < i; j++) {
                if (arr[i][j] != 0)
                    return false;
            }
        }
        return true;
    }

    public static int[] findRows(int[][] arr) {

        int[] b = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < min)
                    min = arr[i][j];
            }
            b[i] = min;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < b.length; i++) {
            if (max < b[i])
                max = b[i];
        }

        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (max == b[i])
                count++;
        }

        int[] c = new int[count];
        for (int i = 0; i < b.length; i++) {
            if (max == b[i])
                c[count] = b[i];
        }

        return c;
    }
}
