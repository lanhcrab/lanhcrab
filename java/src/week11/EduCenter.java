package week11;

/** Class EduCenter:
 * Lớp dùng để gọi thực hiện và kiểm thử các lớp đã xây dựng trước đó.
 * Cần hoàn thiện các phương thức chưa đầy đủ nhưng phải giữ nguyên mẫu
 * phương thức (khai báo, đối số, kiểu trả về). Có thể thay đổi giá trị
 * sau lệnh return cuối các phương thức nhưng cần giữ nguyên kiểu trả về.
 * Có thể bổ sung phương thức nếu cần, nhưng phải giữ lại đầy đủ các phương thức đã được khai báo sẵn
 * */


import jdk.jshell.PersistentSnippet;

import java.util.Scanner;
import java.util.ArrayList;

public class EduCenter{
    public static int currentYear = 2020;
    public static double baseAmount;

    public static Person[] readData(Scanner scan){

        //Person[] result = null;

        try{
            int n = Integer.parseInt(scan.nextLine());
            Person[] people = new Person[n];

            for (int i = 0; i < n; i++) {
                String personCode = scan.nextLine();
                String name = scan.nextLine();
                int day = scan.nextInt();
                int month = scan.nextInt();
                int year = scan.nextInt();
                Date date = new Date(year, month, day);
                scan.nextLine();
                boolean gender = Boolean.parseBoolean(scan.nextLine());
                String email = scan.nextLine();
                String address = scan.nextLine();

                if (personCode.charAt(0) == '1') {
                    double score = Double.parseDouble(scan.nextLine());
                    String major = scan.nextLine();
                    Student student = new Student(personCode, email, major, score, name, date, gender, address );
                    people[i] = (Person)student;

                }
                else {
                    String department = scan.nextLine();
                    double salary = Double.parseDouble(scan.nextLine());
                    int day0 = scan.nextInt();
                    int month0 = scan.nextInt();
                    int year0 = scan.nextInt();
                    Date recruiment = new Date(year0, month0, day0);
                    Staff staff = new Staff(personCode, email, department, salary, recruiment, name, date, gender, address);
                    people[i] = (Person) staff;
                }
            }
            return people;
        }

        catch(ArithmeticException ArtmExcp){
            System.out.print(ArtmExcp.getMessage() );
            return null;
        }

        catch(Exception Excp){
            System.out.println("Data types mismatch!");
            return null;
        }
        // Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        //return people;
    }

    public static ArrayList<Person> listOfStaff(Person[] listPerson){

        ArrayList<Person> results = new ArrayList<Person>();

        for (int i = 0; i < listPerson.length; i++) {
            if (listPerson[i].getClass().getName().equals("Staff"))
                results.add(listPerson[i]);
        }

        if ( results.size() > 0)
            return results;
        else
            return null;
    }

    public static void sortStaffBySalary(ArrayList<Person> listStaff){
        Staff tmp;
        int n = listStaff.size();
        Staff staffI, staffJ;
        for (int i = 0; i < n-1; i ++)
            for(int j = i + 1; j < n; j++){
                staffI = (Staff)listStaff.get(i);
                staffJ = (Staff)listStaff.get(j);
                if(staffI.getSalary() > staffJ.getSalary()){
                    tmp = (Staff)listStaff.get(i);
                    listStaff.set(i, listStaff.get(j) );
                    listStaff.set(j, tmp);
                }
            }
    }

    public static void sortStudentByScore(ArrayList<Person> listStudent){

        Student student1, student2;
        for (int i = 0; i < listStudent.size() - 1; i++) {
            for (int j = i + 1; j < listStudent.size(); j++) {
                student1 = (Student)listStudent.get(i);
                student2 = (Student)listStudent.get(j);
                if (student1.getScoreAvg() > student2.getScoreAvg()) {
                    Student temp = student1;
                    listStudent.set(i, student2);
                    listStudent.set(j, student1);
                }
            }
        }
    }

    public static ArrayList<Person> listOfStudent(Person[] listPerson){

        ArrayList<Person> results = new ArrayList<Person>();

        // bổ sung mã lệnh ở đây! Có thể sửa giá trị trả về của lệnh return
        // nhưng không thay đổi kiểu trả về!
        for (int i = 0; i < listPerson.length; i++) {
            if (listPerson[i].getClass().getName().equals("Student"))
                results.add(listPerson[i]);
        }
        if (results.size() > 0)
            return results;
        else
            return null;
    }

    public static Person searchByCode(Person[] listPerson, String code){

        for (int i = 0; i < listPerson.length; i++) {
            if (listPerson[i].getPersonCode().equals(code))
                return listPerson[i];
        }
        return null;
    }

    // Phương thức theo yêu cầu ở mục 4.2 trong mô tả
    public static void displayList(Person[] listPerson){
        if(listPerson != null) {
            for (int i = 0; i < listPerson.length; i++) {
                listPerson[i].toString();
            }

        }
        else {
            System.out.println("No any person in this list!");
        }
    }

    // Phương thức theo yêu cầu ở mục 4.3 trong mô tả
    public static void displayList(ArrayList<Person>  listPerson){
        // Bổ sung mã lệnh để phương thức này có thể thông tin ra màn hình đúng theo mẫu
        // cả trường hợp Student và Staff
        int n = listPerson.size();
        if(n > 0){

            for (int i = 0; i < n; i ++){
                if(listPerson.get(i).getClass().getSimpleName().equals("Staff")){
                    /* Đặt staff = (Staff)(đối tượng thứ i). Bổ sung lệnh để in ra xâu ký tự theo mẫu sau:
                    staff.toString() + " Income:" + String.valueOf(staff.getRealEarnings(currentYear)) */
                    Staff staff = (Staff) listPerson.get(i);
                    System.out.println(staff.toString() + " Income:" + String.valueOf(staff.getRealEarnings(currentYear)));
                }else{
                    /* Đặt student = (Student)(đối tượng thứ i). Bổ sung lệnh để in ra xâu ký tự theo mẫu sau:
                    student.toString() + " Total Fees:" + String.valueOf(student.getPayment(baseAmount) ) */;
                    Student student = (Student) listPerson.get(i);
                    System.out.println(student.toString() + " Total Fees:" + String.valueOf(student.getPayment(baseAmount)));
                }
            }
        }
        else{
            System.out.println("No any person in this list!");
        }
    }


    public static void sortByLastName(Person[] listPerson){
        // Bổ sung mã lệnh để phương thức này có thể sắp xếp mảng theo thứ tự tăng dần
        // của phần tên LastName (từ cuối cùng của tên đầy đủ) các đối tượng Person
        // Dùng phương thức lớp String: str1.compareTo(String str2) để so hai xâu str1 và str2.
    }

    // public static ArrayList<Person> searchByMajors(Person[] listPerson, String majors){

    //     ArrayList<Person> results = new ArrayList<Person>();
    //     ArrayList<Person> student = listOfStudent(listPerson);
    //      for (int i = 0; i < student.size(); i++) {
    //          if (student.get(i).getMajors().equals(majors)) {
    //              results.add(student.get(i));
    //          }
    //      }

    //     return null;
    // }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        currentYear = scan.nextInt();
        // Chỉ cần viết main để kiểm thử theo ý người lập trình
        // Phần chạy thử & chấm trên hệ thống đã có lớp khác.
    }

}
