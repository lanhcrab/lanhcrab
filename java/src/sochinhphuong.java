import java.util.Scanner;

public class sochinhphuong {

    public static int[][] innputMatrix(Scanner reader) {

        int n = reader.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = reader.nextInt();
            }
        }
        return a;
    }

    public static void isFind(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (isCheck(array[i][j]) == true) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }

    public static boolean isCheck(int k) {

        if (k <= 0) return false;

        if (Math.sqrt(k) * Math.sqrt(k) != k)
            return false;
        return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isCheck(a));

//        int[][] a = innputMatrix(sc);
//        isFind(a);
    }
}
