package BT_JavaBasic5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForBT4 {

    //1. Tạo class mới tại bài tập JAVA BASIC 5 để xử lý bài tập Java Basic 4 với ArrayList
    public void arrayList() {
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i <= 50; i += 2) {
            number.add(i);
        }
        //Show ArrayList
        for (int i : number) {
            System.out.println(i);
        }
    }
     public static void main(String[] args) {
        //1
        ArrayListForBT4 s1 = new ArrayListForBT4();
        s1.arrayList();
    }
}
