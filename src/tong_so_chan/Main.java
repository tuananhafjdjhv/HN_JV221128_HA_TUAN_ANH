package tong_so_chan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên dương n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("Tổng của các số chẵn trong khoảng từ 0 đến " + n + " là: " + sum);
    }
}
