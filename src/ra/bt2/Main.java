package ra.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double rate = 23000.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số tiền (USD)");
        double usd = sc.nextDouble();

        double vnd = usd * rate;

        System.out.println("giá trị tương ứng: " + vnd + " VND");
    }
}
