package Diger_Faydali_Konular.Stream_Api;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(12);
        list.add(3);
        list.add(89);
        list.add(25);
        list.add(44);
        list.add(100);
        list.add(7);
        list.add(63);

        // Foreach
      //  list.stream().forEach(i -> System.out.println(i));

        // Filter
      //  list.stream().filter(number -> number > 60).forEach(num -> System.out.println(num));

        // Distinc()
      // list.stream().distinct().forEach(i -> System.out.println(i));

        // Sorted()
     // list.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));

        // limit()

     //  list.stream().limit(5).forEach(i-> System.out.println(i));




    }
}
