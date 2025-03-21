package JavaBasic.BT_JavaBasic1;

public class SinhVien {

    String school = "Lê Hồng Phong"; // Bien instance
    static int grade=12;// Bien static

    public void name(){
        String name="Tran Linh"; // Bien local
        System.out.println(name);
    }

    public static void main(String[] args) {
        SinhVien SV1= new SinhVien();
        System.out.println(SV1.school);
        System.out.println(grade);
        SV1.name();
        System.out.println(ThongTin.school2);
    }
}