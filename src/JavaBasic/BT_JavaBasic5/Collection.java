package JavaOOP.BT_JavaBasic5;

import java.util.ArrayList;
import java.util.List;

//Req:
//- Tạo class mới tại bài tập JAVA BASIC 5 để xử lý bài tập Java Basic 4 với ArrayList
//- Tạo hàm riêng để thêm thông tin cơ bản của một nhân viên vào collection đã học phù hợp
//- Trong hàm main gọi lại hàm trên để in ra thông tin nhân viên đó với vòng lặp for CƠ BẢN

public class Collection {
    // Xu ly bai tap 4 bang ArrayList
    public void array(){
        ArrayList<Integer> array = new ArrayList<>();
        for (int i=0;i<=50;i+=2){
            array.add(i);
      }
        for (int number:array){
            System.out.println(number);
        }
    }

    //Luu thong tin co ban cua mot nhan vien vao collection phu hop
    public List<String> employee(){
        List<String> employee = new ArrayList<>();
        employee.add("Linh, 21, HCM");
        employee.add("Thao, 15, HCM");
        employee.add("Huy, 22, HCM");
        return employee;
    }

    public static void main(String[] args) {
        Collection collection = new Collection();
        collection.array();
        List<String> a = collection.employee();

        for (int i = 0; i<a.size(); i++){
            System.out.println(a.get(i));
        }

    }
}
