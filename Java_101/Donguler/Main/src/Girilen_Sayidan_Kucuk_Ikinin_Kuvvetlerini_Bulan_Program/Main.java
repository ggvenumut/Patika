package Girilen_Sayidan_Kucuk_Ikinin_Kuvvetlerini_Bulan_Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;


        Scanner scan = new Scanner(System.in);

        System.out.print("Sinir Sayisini Giriniz : ");
        n = scan.nextInt();

        for (int i = 1; i <= n ; i*=2) {
            System.out.println(i);
        }

    }
}
