package JavaOOP.BT_JavaBasic1;

public class SinhVien {
    public String name = "Linh"; //Bien instance
    public static String location = "Hanoi"; //Bien static

    public void displayInfor(){
        int age = 21; // bien local
        System.out.println(age);
    }

    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien();
        System.out.println(sinhVien.name);
        sinhVien.displayInfor();
        System.out.println(location);

        System.out.println(ThongTin.job);


    }
}
