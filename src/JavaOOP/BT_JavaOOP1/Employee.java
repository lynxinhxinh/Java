package JavaOOP.BT_JavaOOP1;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    public String name;
    public int age;
    public String location;

    public List<String> employee(String name, String age, String location){
        List<String> employee = new ArrayList<>();
        employee.add(name);
        employee.add(age);
        employee.add(location);
        return employee;
    }

}
