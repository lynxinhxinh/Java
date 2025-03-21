package BT_JavaBasic4;

public class For {
    public static void main(String[] args) {
        //Tạo vòng lặp FOR để in ra các số chẵn từ 0 đến 50
        int num = 0;
        for (int i = 0; i <= 50; i += 2) {
            System.out.println(i);
            num += 1;
        }
        System.out.println("---------------");
        System.out.println("Total number is: " + num);
        System.out.println("---------------");

        //Tạo mảng để lưu những số chẵn đó vào
        int arr[] = new int[26];
        int index = 0;
        for (int i = 0; i <= 50; i += 2) {
            arr[index] = i;
            index++;
        }
        //Duyệt mảng để in ra kết quả sau khi nạp vào
        for (int y: arr){
            System.out.println(y);
        }

    }
}
