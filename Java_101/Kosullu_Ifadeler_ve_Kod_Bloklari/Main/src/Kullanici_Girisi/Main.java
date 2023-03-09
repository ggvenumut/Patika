package Kullanici_Girisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName , password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanici Adiniz : ");
        userName = inp.nextLine();

        System.out.print("Sifreniz : ");
        password = inp.nextLine();

        if ( userName.equals("test") && password.equals("test123")){
            System.out.print("Giris Yaptiniz");
        }else {
            System.out.print("Kullanici Adi veya Parola Hatali");
        }

    }
}
