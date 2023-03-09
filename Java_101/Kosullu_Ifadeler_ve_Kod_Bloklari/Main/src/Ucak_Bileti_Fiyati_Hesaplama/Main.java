package Ucak_Bileti_Fiyati_Hesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe;
        int yas;
        int yolculukTipi;
        float mbu = 0.10F;
        float toplamUcret = 0;
        float indirim = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi Km Turunden giriniz : ");
        mesafe = input.nextInt();
        if (mesafe <= 0){
            System.out.println("Lutfen Gecerli Bir Mesafe Giriniz");
            return;
        }
        System.out.print("Yasinizi Giriniz : ");
        yas = input.nextInt();
        if ((yas <= 0) && (yas > 120) ){
            System.out.println("Lutfen Gecerli Bir Yas Giriniz");
            return;
        }

        System.out.print("1 = Tek Yon \n 2 =  Gidis Donus \n   Yolculuk Tipini Giriniz: ");
        yolculukTipi = input.nextInt();
        if (!(yolculukTipi == 1 || yolculukTipi == 2)) {
            System.out.println("Lutfen Gecerli Bir Yolculuk Tipi Secin");
            return;
        }

        toplamUcret = mesafe * mbu ;

        if(yas < 12){
            indirim =  (toplamUcret * 50) / 100;
            if (yolculukTipi == 2){
                indirim +=((toplamUcret * 20) / 100);
            }
        } else if (yas > 12 && yas < 24  ) {
            indirim = (toplamUcret * 10) / 100;
            if (yolculukTipi == 2){
                indirim += ((toplamUcret * 20) / 100);
            }
        }else if (yas > 65){
            indirim = (toplamUcret * 30) / 100;
            if (yolculukTipi == 2){
                indirim += ((toplamUcret * 20) / 100);
            }
        }else {
            if (yolculukTipi == 2){
                indirim += ((toplamUcret * 20) / 100);
            }
        }

        System.out.println( "Toplam Tutar : " + (toplamUcret - indirim));


    }
}
