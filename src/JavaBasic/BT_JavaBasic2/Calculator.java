package JavaBasic.BT_JavaBasic2;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public float multiply(float c, float d) {
        return c * d;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.sum(10,5);
        cal.multiply(1.2F, 3.5F);

        System.out.println( cal.sum(10,5));
        System.out.println(cal.multiply(1.2F, 3.5F));
    }
}