package Collection_Map_Interface.Set_Interface_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<Integer>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(30);
        hSet.add(10);

       // System.out.println(hSet.size());

       /*
          for(Integer sayi : hSet){
            System.out.println(sayi);
        }
        */

        Iterator<Integer> itr = hSet.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
