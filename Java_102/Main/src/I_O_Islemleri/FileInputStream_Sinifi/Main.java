package I_O_Islemleri.FileInputStream_Sinifi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("src/I_O_Islemleri/FileInputStream_Sinifi/patika.txt");
            while (input.read() != -1){

                System.out.println( input.read());
            }
            input.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
