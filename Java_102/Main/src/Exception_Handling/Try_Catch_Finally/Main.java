package Exception_Handling.Try_Catch_Finally;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Basladi");

        int a = 0;
        int b = 20;
        try{
            System.out.println(b/a);
        }catch (Exception e){ // duruma ozel birden fazla catch yapisi kullanilabilir
            System.out.println(e.getMessage());
        } finally { // bu kisim kesinlikle calisacak
            System.out.println("Bitti");
        }

        System.out.println("Program Bitti");
    }
}
