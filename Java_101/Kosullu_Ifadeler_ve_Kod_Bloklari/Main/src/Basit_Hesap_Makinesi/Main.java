package Basit_Hesap_Makinesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1 , n2 , select;

        Scanner input = new Scanner(System.in);

        System.out.print("Ilk Sayiyi giriniz : ");
        n1 = input.nextInt();

        System.out.print("Ikinci Sayiyi giriniz : ");
        n2 = input.nextInt();

        System.out.println("1- Toplama \n 2- Cikarma \n 3- Carpma \n 4- Bolme");
        System.out.print("Secimi Yapiniz : ");
        select = input.nextInt();
        
        if(select == 1){
            System.out.println("Toplam: " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("Cikarma: " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("Carpma: " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0){
            System.out.println("Bolme: " + (n1 / n2));
            } else {
                System.out.println("Bir Sayi 0'a Bolunemez !");
            }
        }else {
            System.out.println("Yanlis Secim Yaptiniz . Tekrar Deneyiniz");
        }

    }
}
