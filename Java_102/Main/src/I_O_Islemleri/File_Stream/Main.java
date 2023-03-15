package I_O_Islemleri.File_Stream;

import java.io.File;
import java.io.IOException;

/*
-  Dosya olusturma => createNewFile()
-  Dosya Silme => delete()
-  Dosya Okuma => read()
-  Dosya Yazma => write()
-  Dizin Olusturma => mdkir()
 */


public class Main {
    public static void main(String[] args)  {
        File dosya = new File("src/I_O_Islemleri/File_Stream/patika.txt");
        try {
           if(dosya.createNewFile()){ // dosya olusturucak ve boolean deger dondercek
               System.out.println(dosya.getName() + "Dosyasi olusturuldu");
           }else{
               System.out.println("Dosya zaten olusturuldu");
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
