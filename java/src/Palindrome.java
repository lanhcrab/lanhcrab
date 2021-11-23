//Kiem tra mot so nguyen co là doi xung
public class Palindrome
{

    //ham kiem tra so nguyen k co la doi xung?
    //@para n kieu in
    //@return boolean
    public static boolean isPalindrome(int k)
    {
        int res = 0;
        int a = k;
        while(k != 0) {
            int digit = k % 10;
            res = res * 10 + digit;
            k /= 10;
        }
        return a == res;

    }

    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        System.out.println(isPalindrome(n));


    }

}