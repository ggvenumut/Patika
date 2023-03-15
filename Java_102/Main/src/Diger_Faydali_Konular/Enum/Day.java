package Diger_Faydali_Konular.Enum;

public enum Day {
    PAZARTESI(1),
    SALI(2),
    CARSAMBA(3);

    private int day;

     Day(int day){
        this.day = day;

    }

    public int getDay(){
        return this.day;
    }

}
