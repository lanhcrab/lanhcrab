package week11;

/**
 * Lớp Person - cơ sở của các lớp Student và Staff.
 * Các phương thức dựng không tham số và đủ tham số.
 * Trường name cần được chuẩn hóa bằng phương thức String normalizeName(String) trước khi gán
 * Các phương thức đã định nghĩa đầy đủ thì không cần thay đổi. Các phương thức khác cần viết đủ
 * nhưng phải giữ nguyên cấu trúc khai báo/định nghĩa và kiểu trả về, chỉ thay giá trị sau lệnh return
 * Có thể bổ sung phương thức nếu cần, nhưng phải giữ lại đầy đủ các phương thức đã được khai báo sẵn
 * */
public class Person{
    private String personCode = "00000000";
    private String name = "UnRegistered";
    private Date birthday = new Date();
    private boolean gender;
    private String email = "Un@Registered";
    private String address = "UnRegistered";

    public Person(){
    }

    public Person(String code, String name, Date birthday, boolean gender, String mail, String address){

        this.name = normalizeName(name);
        this.personCode = code;
        this.birthday = birthday;
        this.gender = gender;
        this.email = mail;
        this.address = address;


    }

    public static String normalizeName(String name){
        String str = name;
        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        char[] ch = str.toCharArray();

        ch[0] = Character.toUpperCase(ch[0]);

        for(int i = 1 ; i < ch.length; i++)
            if(ch[i-1] == ' ')
                ch[i] = Character.toUpperCase(ch[i]);
            else
                ch[i] = Character.toLowerCase(ch[i]);

        return String.valueOf(ch);
    }

    public String getLastName(){

        int l = name.length() - 1;
        while(l > 0 && name.charAt(l) != ' ')
            l--;

        return name.substring(l + 1 , name.length());
    }
    @Override
    public String toString(){

        return personCode + ": " + getName() + "; B.day: " + getBirthday() + " (" + getGender() + ") Mail: " + email +"; Addr:" + getAddress();

    }

    public int getAge(int currentYear) throws ArithmeticException{
        if (birthday.getYear() > currentYear)
            throw new ArithmeticException("Birthday: Invalidate data! Year of birth has to be less than current year!");
        return currentYear - birthday.getYear();
    }

    public String getPersonCode() {
        return personCode;
    }

    public String getName() {
        return name;
    }

    public boolean isGender() {
        return gender;
    }

    public String getBirthday(){
        return this.birthday.toString();
    }

    public String getGender(){
        if(this.gender == false)
            return "M";
        else
            return "FM";
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
