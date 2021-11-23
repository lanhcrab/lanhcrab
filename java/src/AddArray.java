import java.util.Scanner;

/**
 * Chương trình cộng 2 mảng số nguyên: 
 * Cho phép đọc số nguyên n, và 2 mảng với n phần tử nguyên
 * Tính và in ra mảng có phần tử là tổng phần tử tương ứng
 * của 2 mảng nhập vào trên một dòng, cách nhau bởi khoảng trống.
 * Yêu cầu giữ cấu trúc các hàm/phương thức đã có, có thể bổ sung nếu cần
 * */
class AddArray{

    // hàm/phương thức SumArray trả về tổng 2 mảng nguyên A, B
    // .....{.......}
    public static int[] input(Scanner sc, int n) {

        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;

    }

    public static int[] SumArray(int[] a, int[] b) {

        int[] c = new int[a.length];
        for (int i = 0; i < c.length; i++) {
            c[i] += a[i] + b[i];
        }
        return c;
    }

    // hàm/phương thức printArray để in một mảng A ra màn hình
    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = input(sc, n);
        int[] b = input(sc, n);
        int[] res = SumArray(a, b);
        printArray(res);
    }
}