package JavaOOP.BT_JavaBasic3;

public class If {
    int a = 10;
    int b = 12;
    int c = 14;
    int number = 100;

    public boolean practice() {
        if ((a < b) || (b < c) && (b > 11)) {
            return true;
        } else return false;
    }

    public void comparation(int n) {
        if (n < 100) {
            System.out.println("n < 100");
        } else if (n == 100) {
            System.out.println("n =100");
        } else {
            System.out.println("n >100");
        }
    }

    public static void main(String[] args) {
        If operator = new If();
        System.out.println(operator.practice());
        operator.comparation(99);
        operator.comparation(100);
        operator.comparation(101);
    }
}
