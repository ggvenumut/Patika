package Nested_Sinif.Generic_Methodlar;

public class Print {
    public static <T> void printArray(T[] arr){
        for(T i : arr){
            System.out.println(i);
        }
    }
}
