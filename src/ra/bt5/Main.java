package ra.bt5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập điểm Toán: ");
        double toan = sc.nextDouble();
        System.out.println("Nhập điểm Lí: ");
        double li = sc.nextDouble();
        System.out.println("Nhập điểm Hoá: ");
        double hoa = sc.nextDouble();
        System.out.println("Nhập điểm Văn: ");
        double van = sc.nextDouble();
        System.out.println("Nhập điểm Anh: ");
        double anh = sc.nextDouble();

        do {
            System.out.print("Nhập điểm Toán (0-10): ");
            toan = sc.nextDouble();
        } while (toan < 0 || toan > 10);

        do {
            System.out.print("Nhập điểm Lí (0-10): ");
            li = sc.nextDouble();
        } while (li < 0 || li > 10);
        do {
            System.out.print("Nhập điểm Hoá (0-10): ");
            hoa = sc.nextDouble();
        } while (hoa < 0 || hoa > 10);
        do {
            System.out.print("Nhập điểm Văn (0-10): ");
            van = sc.nextDouble();
        } while (van < 0 || van > 10);
        do {
            System.out.print("Nhập điểm Anh (0-10): ");
            anh = sc.nextDouble();
        } while (anh < 0 || anh > 10);

        double dtb = (toan + li + hoa + van + anh) / 5;

        if(dtb < 5 && dtb >= 0) {
            System.out.println("điểm trung bình: " + dtb + " Xếp loại yếu");
        } else if(dtb < 6.5) {
            System.out.println("điểm trung bình: " + dtb + "Xếp loại trung bình");
        } else if(dtb < 8) {
            System.out.println("điểm trung bình: " + dtb + "Xếp loại khá");
        } else if(dtb < 9) {
            System.out.println("điểm trung bình: " + dtb + "Xếp loại giỏi");
        } else{
            System.out.println("điểm trung bình: " + dtb + "Xếp loại xuất sắc");
        }
    }
}
