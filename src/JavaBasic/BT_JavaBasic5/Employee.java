package JavaBasic.BT_JavaBasic5;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    // Hàm nhập thông tin Employee
    public static List<String> addEmployee(String name, String age, String location) {
        List<String> employee = new ArrayList<>();
        employee.add(name);
        employee.add(age);
        employee.add(location);
        return employee;
    }

    public static void main(String[] args) {
        List<String> employee = addEmployee("Linh", "25", "Saigon");

        // Duyet gia tri trong Array list
        for (int i = 0; i < employee.size(); i++) {
            System.out.println(employee.get(i));
        }
    }
}
