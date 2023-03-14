package can_chi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao tuoi cua ban: ");
        int age = sc.nextInt();

        // Tinh nam am lich tuoi hien tai
//        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
//        int lunarYear = (currentYear / 60) * 60 + 4 - age;
//        System.out.println(lunarYear);
        int lunarYear = 2023- age;

        // Tinh can chi tu nam am lich
        String[] can = {"Canh", "Tân", "Nhâm", "Quý", "Giáp", "Ất","Bính", "Đinh", "Mậu", "Kỷ"};
        String[] chi = { "Thân", "Dậu", "Tuất", "Hợi","Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi",};
        String canChi = can[lunarYear % 10] + " " + chi[lunarYear % 12];

        System.out.println("Can chi cua ban la: " + canChi);
    }
}
