package day07_Aritmetic_Operators;

public class Aritmetic_Operators_3 {
    public static void main(String[] args) {
        //4500dk kaç saattir.
      //  int dk = 4500;
        //int saat = dk / 60;
        //System.out.println("saat = " + saat);

        //31502 saniye kaç saat kaç dakika kaç saniyedir?

        int sn=31502;
        //60*60sn=1 saat
        int saat=sn/3600;
        int dakika=sn%3600/60;
        int saniye=sn%60;
        System.out.println("saat = " + saat);
        System.out.println("dakika = " + dakika);
        System.out.println("saniye = " + saniye);

    }
}
