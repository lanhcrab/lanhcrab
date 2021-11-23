import java.util.Scanner;

/**
 * Nhập số nguyên N và một mảng A gồm N số nguyên từ bàn phím
 * Sắp xếp A tăng dần về giá trị và in ra mảng đã sắp xếp
 * */
class SortArray{

    public static int[] input(Scanner sc) {

        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int[] sortArray(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void output(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = input(sc);
        int[] res = sortArray(a);
        output(res);
    }


}