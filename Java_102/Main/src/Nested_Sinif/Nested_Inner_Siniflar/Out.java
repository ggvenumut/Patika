package Nested_Sinif.Nested_Inner_Siniflar;

public class Out {
    public int a = 5;
    // Inner Class
    public class In {
        public int a = 10;
        public void run() {
            int a = 1;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Out.this.a);
        }
    }
    public void run() {
        In in = new In();
        in.run();
    }
}
