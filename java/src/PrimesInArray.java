import java.util.Scanner;

public class PrimesInArray {

    public static int[] input(Scanner sc) {

        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static boolean check(int k) {

        if (k < 2) return false;
        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0) return false;
        }
        return true;
    }

    public static void isPrime(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (check(array[i]) == true) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = input(sc);
        isPrime(a);
    }
}
