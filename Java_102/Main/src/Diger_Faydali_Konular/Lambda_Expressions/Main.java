package Diger_Faydali_Konular.Lambda_Expressions;

public class Main {
    public static void main(String[] args) {
       Runnable r1 = new Runnable() {
           @Override
           public void run() {
               System.out.println("Runnable sinifi");
           }
       };

       r1.run();

       Runnable r2 = () -> {
           System.out.println("Lambda ");
       };


    }
}
