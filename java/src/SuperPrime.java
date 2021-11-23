// Bài lập trình kiểm tra một số có là số siêu nguyên tố không
// kết quả in ra True nếu số là số siêu nguyên tố, False nếu số không là số siêu nguyên tố
import java.util.Scanner;

public class SuperPrime{

    public static boolean isPrime(int k){

        if(k < 2) return false;
        for(int i = 2; i < Math.sqrt(k); i++) {
            if(k % i == 0) return false;
        }
        return true;
    }

    public static boolean isSuperPrime(int n){

        if(n == 0) return false;

        while(n != 0) {
            if(isPrime(n) == true) {
                n /= 10;
            }
            else return false;

        }
        return true;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(isSuperPrime(m));
    }


}