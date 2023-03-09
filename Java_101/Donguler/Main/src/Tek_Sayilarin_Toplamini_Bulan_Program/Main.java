package Tek_Sayilarin_Toplamini_Bulan_Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int total = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Sayi Giriniz : ");
        n = scan.nextInt();

        for (int i = 0; i <= n ; i++) {
            if(i % 2 == 1){
                total += i;
            }

        }

        System.out.println("Toplam : " + total);

    }
}
