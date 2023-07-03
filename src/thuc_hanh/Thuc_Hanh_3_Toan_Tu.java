package bai_1.thuc_hanh;

import java.util.Scanner;

public class Thuc_Hanh_3_Toan_Tu {
    public static void main(String[] args) {
        double width;
        double height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        double area = width * height;
        System.out.println("Area is: " + area);
    }
}
