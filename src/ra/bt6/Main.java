package ra.bt6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập một số: ");
        int so = sc.nextInt();

        if(so % 3 == 0 && so % 5 == 0) {
            System.out.println("Số của bạn chia hết cho cả 3 và 5");
        } else if(so % 3 == 0) {
            System.out.println("Số của bạn chỉ chia hết cho 3");
        } else if(so % 5 == 0) {
            System.out.println("Số của bạn chỉ chia hết cho 5");
        } else {
            System.out.println("Số của bạn không chia hết cho cả 3 và 5");
        }
    }
}
