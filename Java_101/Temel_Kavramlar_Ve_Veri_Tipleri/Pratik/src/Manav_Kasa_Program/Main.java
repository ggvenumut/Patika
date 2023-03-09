package Manav_Kasa_Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float armutBF= 2.14F,elmaBF= 3.67F ,domatesBF= 1.11F ,muzBF=0.95F ,patlicanBF=5.00F;
        float toplam = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kac Kilo :");
        toplam += (inp.nextFloat() * armutBF);

        System.out.print("Elma Kac Kilo :");
        toplam += (inp.nextFloat() * elmaBF);

        System.out.print("Domates Kac Kilo :");
        toplam += (inp.nextFloat() * domatesBF);

        System.out.print("Muz Kac Kilo :");
        toplam += (inp.nextFloat() * domatesBF);

        System.out.print("Patlican Kac Kilo :");
        toplam += (inp.nextFloat() * patlicanBF);

        System.out.println("Toplam Tutar : " + toplam);
    }
}
