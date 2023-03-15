package I_O_Islemleri.ByteArrayInputStream_ByteArrayOutputStream;

import java.io.ByteArrayInputStream;

public class Main {
    public static void main(String[] args) {
        byte[] dizi = {1,4,6,78,42};
        ByteArrayInputStream input = new ByteArrayInputStream(dizi);
        System.out.println(input.read());
        System.out.println(input.read());
        System.out.println(input.read());
        System.out.println(input.read());
    }
}
