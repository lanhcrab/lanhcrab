package week11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<String, Student> stringStudentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());

        switch (a) {
            case 1:
                System.out.println("Nhap N: ");
                int N = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < N; i++) {
                    Student student = new Student();
                    student.input();
                    stringStudentMap.put(student.getRollNo(), student);
                }
                break;

            case 2:
                System.out.println("Thong tin sinh vien");
                for (Map.Entry<String, Student> entry : stringStudentMap.entrySet() ) {
                    Student value = entry.getValue();
                }
                break;

            case 3:
                System.out.println("Nhap MSV can tim kiem: ");
                String rollNo = sc.nextLine();

                Student studentFind = stringStudentMap.get(rollNo);
                studentFind.display();
                break;

            case 4:
                System.out.println("Exit!!!");
                break;
        }
    }

}

