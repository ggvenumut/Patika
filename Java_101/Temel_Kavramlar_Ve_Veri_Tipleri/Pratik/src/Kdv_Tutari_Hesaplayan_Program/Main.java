package Kdv_Tutari_Hesaplayan_Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar , kdvOran = 0.18 , kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Ucret Tutarini giriniz : ");
        tutar = input.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar :  " + tutar);
        System.out.println("KDV  Orani :  " + kdvOran);
        System.out.println("KDV Tutari :  " + kdvTutar);
        System.out.println("KDV'li Tutari :  " + kdvliTutar);
    }
}
