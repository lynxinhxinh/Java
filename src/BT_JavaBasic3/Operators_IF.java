package BT_JavaBasic3;

public class Operators_IF {
    //Tạo ra ít nhất 3 biến bất kỳ lưu giá trị trong class đó
    // Thực hiện các loại toán tử trên các biến trên: &&, ||, >, <, ==
    int a = 10;
    int b = 20;
    int c = 30;

    public boolean operators() {
        if ((a > b) || ((b < c) && (c == 30))) {
            return true;
        } else {
            return false;
        }
    }

    //Tạo hàm truyền tham số int "n" và Dùng câu lệnh IF Else để đặt điều kiện cho tham số n truyền vào đó:
    //        + TH1:  n == number
    //        + TH2:  n < number
    //        + TH3:  n > number
    int number = 100;

    public void comparation(int n) {
        if (n <= 30) {
            System.out.println("n <= 30");
        } else {
            if ((n < number) && (n > 30)) {
                System.out.println("n (" + n + ") > 30 and < " + number);
            } else if (n == number) {
                System.out.println("n (" + n + ") = " + number);
            } else System.out.println("n (" + n + ") > " + +number);
        }
    }

    public static void main(String[] args) {
        Operators_IF op = new Operators_IF();
        System.out.println(op.operators());;
        op.comparation(30);
        op.comparation(31);
        op.comparation(100);
        op.comparation(101);
    }
}

