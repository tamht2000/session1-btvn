package ra.bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chiều dài: ");
        int dai = sc.nextInt();
        System.out.println("Nhập chiều rộng: ");
        int rong = sc.nextInt();

        int chuVi = (dai + rong) * 2;
        int dienTich = dai * rong;

        System.out.println("Chu vi: "+ chuVi );
        System.out.println("Diện tích: "+ dienTich );

    }
}
