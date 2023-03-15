package I_O_Islemleri.FileOutputStrem_Sinifi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        String yazi = "Lorem Ipsum Dor";
        try {
            FileOutputStream output = new FileOutputStream("patika.txt" , true);
            byte[] yaziByte =  yazi.getBytes();
            output.write(yaziByte);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
