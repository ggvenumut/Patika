package Cin_Zodyagi_Hesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;

        Scanner input = new Scanner(System.in);
        System.out.print("Dogum Yilinizi Giriniz : ");
        yil = input.nextInt();

        int kalan = yil%12;

        switch (kalan){
            case 0:
                System.out.println("Cin Zodyagi Burcunuz : Maymun");
                break;
            case 1:
                System.out.println("Cin Zodyagi Burcunuz : Horoz");
                break;

            case 2:
                System.out.println("Cin Zodyagi Burcunuz : Köpek");
                break;
            case 3:
                System.out.println("Cin Zodyagi Burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Cin Zodyagi Burcunuz : Fare");
                break;

            case 5:
                System.out.println("Cin Zodyagi Burcunuz : Öküz");
                break;

            case 6:
                System.out.println("Cin Zodyagi Burcunuz : Kaplan");
                break;
            case 7:
                System.out.println("Cin Zodyagi Burcunuz : Tavşan");
                break;

            case 8:
                System.out.println("Cin Zodyagi Burcunuz : Ejderha");
                break;

            case 9:
                System.out.println("Cin Zodyagi Burcunuz : Yılan");
                break;
            case 10:
                System.out.println("Cin Zodyagi Burcunuz : At");
                break;
            case 11:
                System.out.println("Cin Zodyagi Burcunuz : Koyun");
                break;
            default:
                System.out.println("Lutfen Gecerli Bir Yil Giriniz");
        }

    }
}
