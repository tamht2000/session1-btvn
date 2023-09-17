package ra.bt7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int so = sc.nextInt();

        System.out.println(readNumber(so));


    }


    public static String readNumber(int so) {
        switch (so) {
            case 0:
                return "Số không";
            case 1:
                return "Số một";
            case 2:
                return "Số hai";
            case 3:
                return "Số ba";
            case 4:
                return "Số bốn";
            case 5:
                return "Số năm";
            case 6:
                return "Số sáu";
            case 7:
                return "Số bảy";
            case 8:
                return "Số tám";
            case 9:
                return "Số chín";
            default:
                return "số không hợp lệ.";
        }
    }
}


