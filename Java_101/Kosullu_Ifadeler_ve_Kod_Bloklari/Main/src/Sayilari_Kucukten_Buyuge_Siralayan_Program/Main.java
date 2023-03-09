package Sayilari_Kucukten_Buyuge_Siralayan_Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayi : ");
        a = input.nextInt();

        System.out.print("2. Sayi : ");
        b = input.nextInt();

        System.out.print("3. Sayi : ");
        c = input.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("A > B > C");
            } else {
                System.out.println("A > C > B");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("b > a > c");
            } else {
                System.out.println("b>c>a");
            }
        } else {
            System.out.println("c > b > a");
        }

    }

}
