package Not_Ortalamasi_Hesaplayan_Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Degiskenler
        int mat, fizik,kimya,turkce,tarih,muzik;

        // Scanner Sinifini Dahil Etme
        Scanner inp = new Scanner(System.in);

        //Kullanicidan Degerleri Alma
        System.out.println("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.println("Turkce Notunuz : ");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.println("Muzik Notunuz : ");
        muzik = inp.nextInt();


        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6.0;
        System.out.println(sonuc);

    }
}