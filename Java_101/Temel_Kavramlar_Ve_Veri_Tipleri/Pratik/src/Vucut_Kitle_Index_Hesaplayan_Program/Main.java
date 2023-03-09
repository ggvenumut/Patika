package Vucut_Kitle_Index_Hesaplayan_Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kilo;
        float boy;

        Scanner input = new Scanner(System.in);

        System.out.print("Lufen Kilonuzu Giriniz : ");
        kilo = input.nextInt();

        System.out.print("Lufen Boyunuzu Giriniz : ");
        boy = input.nextFloat();

        float vki = kilo / (boy*boy);
        System.out.println("Vucut Kitle Indexi : " + vki);

    }
}
