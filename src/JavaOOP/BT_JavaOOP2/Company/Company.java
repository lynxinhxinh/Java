package JavaOOP.BT_JavaOOP2.Company;
import JavaOOP.BT_JavaOOP2.Person.Person;

public class Company {
    public static void main(String[] args) {
        System.out.println("--");
        Person person = new Person("Thao",28,"Femal","HCM","123456789");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
    }

}
