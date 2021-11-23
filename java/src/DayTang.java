import java.util.Scanner;

public class DayTang {

    public static int[] input(Scanner sc) {

        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static boolean check(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if (array[i] > array[j])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = input(sc);
        if (check(a) == true)
            System.out.println("YES");
        else System.out.println("NO");
    }
}
