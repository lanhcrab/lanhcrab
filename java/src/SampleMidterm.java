import java.util.Map;

public class SampleMidterm {

    public static int sum(int n, int m) {

        int sum = 0;
        for (int i = n; i <= m ; i++) {
            sum += i;
        }
        return sum;

    }

    public static int multi(int n, int m) {

        int multi = 0;
        for (int i = n; i <= m ; i++) {
            multi *= i;
        }
        return multi;

    }

    public static boolean isArithmeticSequence(int[] a) {

        int d = a[1] - a[0];
        for (int i = 1; i < a.length; i++) {
            if (d != a[i] - a[i - 1])
                return false;
        }
        return true;
    }

    public static boolean isGeometricSequence(int[] a) {

        int q = a[1] / a[0];
        for (int i = 1; i < a.length; i++) {
            if (q != a[i] / a[i - 1])
                return false;
        }
        return true;
    }

    public static boolean isPrime(int n) {

        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPerfectNum(int n) {

        int a = n;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum == a;
    }

    public static int gcd(int a, int b) {

        if (b == 0) return a;
        return gcd(b, a % b);

    }

    public static int lcm(int a, int b) {

        return (a * b) / gcd(a, b);
    }

    public static int[] getMirror(int[] a) {

      int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - i - 1];
        }
        return b;
    }

    public static void speacialSort(int[] a) {

        for(int i = 0; i < a.length - 1; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] % 2 != 0 && a[j] % 2 == 0){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

                if(a[i] % 2 == 0 && a[j] % 2 == 0 && a[i] > a[j]){
                    int temp1 = a[i];
                    a[i] = a[j];
                    a[j] = temp1;
                }
                if(a[i] % 2 != 0 && a[j] % 2 != 0 && a[i] < a[j]){
                    int temp2 = a[i];
                    a[i] = a[j];
                    a[j] = temp2;
                }

            }
        }
    }



    public static void main(String[] args) {
        int n = 4, m = 6;
        System.out.println("sum = "+sum(n,m));
        System.out.println("multiple = "+multi(n, m));
        int[] a = {1,2,3,4};
        int[] b = {1, 1, 1, 1};
        System.out.println("isArithmeticSequence a = "+isArithmeticSequence(a));
        System.out.println("isArithmeticSequence b = "+isArithmeticSequence(b));
        System.out.println("isGeometricSequence a = "+isGeometricSequence(a));
        System.out.println("isGeometricSequence b  = "+isGeometricSequence(b));

        int p = 7, k = 28;
        System.out.println("isPrime p = "+isPrime(p)+"; isPrime k = "+isPrime(k));
        System.out.println("isPerfectNum p = "+isPerfectNum(p)+"; isPerfectNum k = "+isPerfectNum(k));
        System.out.println("gcd (n, m) = "+ gcd(n, m));
        System.out.println("lcm (n,m) = "+lcm(n, m));

        int[] mirror = getMirror(a);
        if(mirror!=null)
        {
            System.out.println("a mirror:");
            for(int i = 0 ; i < mirror.length ; i++)
                System.out.print(mirror[i]+" ");
        }
        else
            System.out.println("null mirror");

        System.out.println();
        speacialSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}