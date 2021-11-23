import java.util.Scanner;

public class NameSort {
    public static void print (String[] a) {
        for (String s : a) {
            System.out.println(s);
        }
    }
    public static Character firstChar (String name) {
        int flag = 0;
        for (int i = name.length(); i > 0; i--) {
            if (name.charAt(i-1) == ' ') {
                flag = i;
                break;
            }
        }
        return name.charAt(flag);
    }

    public static void sort (String[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i+1; j < list.length; j++) {
                if (firstChar(list[i]).compareTo(firstChar(list[j])) > 0) {
                    String temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] students = new String[n];
        for (int i = 0; i < n; i++) {
            students[i] = sc.nextLine();
        }
        sort(students);
        print(students);
    }
}
