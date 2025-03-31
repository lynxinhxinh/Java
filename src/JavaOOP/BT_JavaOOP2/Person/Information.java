package JavaOOP.BT_JavaOOP2.Person;

public class Information {
    public static void main(String[] args) {
        Person person = new Person("Linh",28,"Femal","HCM","123456789");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println(person.getAddress());
        System.out.println(person.getPhone());
    }
}
