package bai_1.bai_tap;

import java.util.Scanner;
public class B2_Converted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd, result;
        System.out.println("Enter VND: ");
        usd = scanner.nextDouble();
        result = usd*23000;
        System.out.printf("USD: %.0f!",result);
    }
}
