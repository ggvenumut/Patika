package Exception_Handling.Throw;

import java.util.Scanner;

public class Main {

    public static void checkAge(int age) throws Exception {
        if(age < 18){
            throw  new Exception("Yasiniz Tutmuyor");
        }
    }


    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Yasinizi Girin : ");
        int age = input.nextInt();
        try{
            checkAge(age);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Program Bitti");
    }
}
