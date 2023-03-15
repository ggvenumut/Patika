package Nested_Sinif.Nested_Inner_Siniflar;

public class Main {
    public static void main(String[] args) {
        // Nested Class (Ic Ice Siniflar)
        // -Inner Class (Ic Siniflar)
        //    -> static
        //    -> non-static
        // -Local Class (Yerel Siniflar)
        // -Anonymus Class (Anonim Siniflar)

        Out o = new Out();
        Out.In in = o.new In();
        in.run();

    }
}
