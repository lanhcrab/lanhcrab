import java.util.Scanner;

/**
 * chương trình nhập số nguyên n và mảng gồm n số nguyên
 * hàm/phương thức groupArray xếp số lẻ về đầu, số chẵn về cuối mảng
 * Bổ sung thêm các hàm/phương thức khác nếu cần
 * */

public class GroupArray{

    // Định nghĩa hàm/phương thức groupArray() ở đây
    // .....  groupArray(.....)
    public static int[] input(Scanner sc) {

        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int[] groupArray(int[] array) {

        int[] b = new int[array.length];
        int begin = 0;
        int end = b.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                b[begin] = array[i];
                begin++;
            }
        }

        for (int i = array.length - 1; i >= 0 ; i--) {
            if (array[i] % 2 == 0) {
                b[end] = array[i];
                end--;
            }
        }
        return b;
    }

    public static void output(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int[] a = {2, 3, 5, 4, 6, 11};
        int[] res = groupArray(a);
        output(res);
    }
}