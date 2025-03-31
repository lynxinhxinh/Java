package JavaOOP.BT_JavaOOP2.Person;
// Req:
// + Tạo class "Person" với các thông tin: name, age, gender, address, phone
// + Hàm xây dựng và hàm get tương ứng để giải quyết bài toán theo yêu cầu
// + Tạo class "Information" để gọi lại tất cả các thông tin từ class Person

public class Person {
    // Cac thuoc tinh của class person
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;

    //Ham constructor
    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    //Ham getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
