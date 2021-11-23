import java.util.Scanner;

public class TrigonometricFunctions {
    public static double sin(double x, double saiso) {
        int i = 1;
        int dau = 1;
        double xx  = x;
        long gt = 1;
        double res = x;

        while(Math.abs(res - Math.sin(x)) > saiso) {
            i += 2;
            dau *= -1;
            xx = xx * x * x;
            gt = gt * (i - 1) * i;
            res = res + dau * (xx / gt);
        }
        return res;
    }

    public static double sin1(double x, double saiso) {
        int i = 1;
        int dau = 1;
        double val = x;
        double res = x;

        while (Math.abs(res - Math.sin(x)) > saiso) {
            i += 2;
            dau *= -1;
            val *= x / (i - 1);
            val *= x / (i);
            res += (val * dau);
            System.out.println(x + " " + i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double saiso = sc.nextDouble();

        System.out.println(sin(x, saiso));
    }
}