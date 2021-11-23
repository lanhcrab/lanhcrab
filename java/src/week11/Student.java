package week11;

/** Class Student:
 * Dẫn xuất từ (con của) lớp Person. Cần hoàn thiện các phương thức chưa có
 * nhưng phải giữ nguyên mẫu phương thức (khai báo, đối số, kiểu trả về)
 * Có thể thay đổi giá trị sau lệnh return cuối các phương thức nhưng cần
 * giữ nguyên kiểu trả về. Có thể bổ sung phương thức nếu cần, nhưng phải
 * giữ lại đầy đủ các phương thức đã được khai báo sẵn
 * */

public class Student extends Person{
    private String  majors = "UnRegistered";
    private double scoreAvg;

    public Student(){
        majors = " ";
        scoreAvg = 0.0;
    }

    public Student(String SVcode, String mail, String majors, double score, String name, Date birthday, boolean gender, String address){

        super(SVcode, name, birthday, gender, mail, address);
        this.majors = majors;
        this.scoreAvg = score;

    }


    public String getMajors() {
        return majors;
    }

    public double getScoreAvg() {
        return scoreAvg;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public void setScoreAvg(double scoreAvg) {
        this.scoreAvg = scoreAvg;
    }

    public double getPayment(double baseAmount){

        if (scoreAvg < 4.0)
            return baseAmount * 1.5;
        else if (scoreAvg > 4.0 && scoreAvg < 8.0)
            return baseAmount;
        else if (scoreAvg > 8.0 && scoreAvg < 9.0)
            return baseAmount * 0.75;
        else
            return baseAmount * 0.5;

    }


    public String toString(){
        String str = "";
        str = "Student Code: " + super.toString()+ "; AVG score:" + String.valueOf(scoreAvg) + " Majors: " + majors;
        return str;
    }

}
