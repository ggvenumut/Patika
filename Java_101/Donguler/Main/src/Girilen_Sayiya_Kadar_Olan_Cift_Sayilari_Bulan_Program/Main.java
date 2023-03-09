package Girilen_Sayiya_Kadar_Olan_Cift_Sayilari_Bulan_Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayi Giriniz :");
        k = inp.nextInt();

        for (int i = 1; i < k ; i++) {
            if(i % 2 ==0){
                System.out.println(i);
            }
        }
    }
}
