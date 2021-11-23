import java.util.Scanner;

public class UCLN {

    public static int isGCD(int a, int b) {

        for (int i = Math.min(a,b); i > 0 ; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = isGCD(a, b);
        System.out.println(x + " ");
    }
}
