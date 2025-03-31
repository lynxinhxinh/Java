package JavaOOP.BT_JavaBasic2;

public class Calculator {

    public long sum(int a, int b){
        return a+b;
    }

    public double multiple(float a, float b){
        return a*b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2,3));
        System.out.println(calculator.multiple(2.5F,2.7F));
    }
}
