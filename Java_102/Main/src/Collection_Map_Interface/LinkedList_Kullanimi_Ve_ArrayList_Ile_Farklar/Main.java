package Collection_Map_Interface.LinkedList_Kullanimi_Ve_ArrayList_Ile_Farklar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> liste = new LinkedList<>();
        liste.add("Mustafa");
        liste.add("Guven");
        liste.add("Java");

        Iterator<String> itr = liste.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
