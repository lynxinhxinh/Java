package JavaOOP.BT_JavaOOP1;

import java.util.ArrayList;
import java.util.List;

public class Information {
    public static void main(String[] args) {
        Employee employee = new Employee();

        List<String> info = employee.employee("Linh", "21", "HCM");
        for (String i:info){
            System.out.println(i);
        }

    }
}
