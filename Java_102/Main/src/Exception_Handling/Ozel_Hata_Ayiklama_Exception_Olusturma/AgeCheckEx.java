package Exception_Handling.Ozel_Hata_Ayiklama_Exception_Olusturma;

public class AgeCheckEx extends  Exception {
    public AgeCheckEx(String message) {
        super(message);
        System.out.println("Yas Hataso aldiniz");
    }
}
