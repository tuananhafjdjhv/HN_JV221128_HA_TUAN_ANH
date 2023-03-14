package random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // In ra Mảng
        int[] arr = new int[50];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100)+1;
        }
        System.out.println("Mảng được tạo là: [");

        String arrStr = Arrays.toString(arr).replace("[", "").replace("]", "");

        // In ra mảng dưới dạng chuỗi
        System.out.println(arrStr);
        System.out.println("]");



        // Tìm giá trị max min của mảng
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
        System.out.print("Giá trị lớn nhất trong mảng là: " + max);

        // In mảng tăng dần
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // In mảng sau khi đã sắp xếp tăng dần
        System.out.println("Mảng sau khi sắp xếp tăng dần:"+"\n");
        System.out.println(Arrays.toString(arr));

        // Đếm số lần xuất hiện của các số nguyên tố trong mảng
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của các số nguyên tố trong mảng là: " + count);
    }

    // Kiểm tra xem một số có phải là số nguyên tố hay không
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.pow(n,0.5); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
