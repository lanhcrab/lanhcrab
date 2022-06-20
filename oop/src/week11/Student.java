package week11;

import java.util.Scanner;

public class Student {

    private String rollNo;
    private String name;
    private String gender;
    private int age;
    private String email;
    private String address;

    public Student() {

    }

    public Student(String rollNo, String name, String gender, int age, String email, String address) {

        this.rollNo = rollNo;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.address = address;

    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("RollNo: ");
        rollNo = sc.nextLine();
        System.out.println("Gender: ");
        gender = sc.nextLine();
        System.out.println("Age: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Email: ");
        email = sc.nextLine();
        System.out.println("Address: ");
        address = sc.nextLine();

    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo = '" + rollNo + '\'' +
                ", name = '" + name + '\'' +
                ", gender = '" + gender + '\'' +
                ", age = " + age +
                ", email = '" + email + '\'' +
                ", address = '" + address + '\'' +
                '}';
    }
}
