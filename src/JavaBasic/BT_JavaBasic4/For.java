package JavaOOP.BT_JavaBasic4;

public class For {

    public static void main(String[] args) {
        int y=0;
        int a[] = new int[26];

        for (int i = 0; i<=50; i+=2){
            System.out.println(i);
            a[y]=i;
            y++;
        }
        System.out.println("----");
        System.out.println("So phan tu trong mang: "+y);
        System.out.println("----");

        System.out.println("In mang:");
        for (int i: a){
            System.out.println(i);
        }

    }
}
