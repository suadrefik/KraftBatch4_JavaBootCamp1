package day07_Aritmetic_Operators;

import java.util.Scanner;

public class Homework_Koltuk {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Toplantı Salonu Sıra Adedi Girin: ");
        int sira_adet=scan.nextInt();

        System.out.println("Her Sıradaki Koltuk Adedi Girin: ");
        int siradaki_koltuk= scan.nextInt();

        System.out.println("Katılımcı Sayısı Girin: ");
        int katilimci_sayisi= scan.nextInt();

        int salon_kapasite=sira_adet*siradaki_koltuk;
        System.out.println("salon_kapasitesi = " + salon_kapasite);

        int bos_koltuk=salon_kapasite-katilimci_sayisi;
        System.out.println("bos_koltuk  = " + bos_koltuk);

        int oturulan_sira_sayisi=(katilimci_sayisi/siradaki_koltuk)+1;
        System.out.println("oturulan_sira_sayisi = " + oturulan_sira_sayisi);

        int bos_sira_sayisi=sira_adet-oturulan_sira_sayisi;
        System.out.println("bos_sira_sayisi = " + bos_sira_sayisi);

        int oturulan_siradaki_bos_koltuk_sayisi=siradaki_koltuk-(katilimci_sayisi%siradaki_koltuk);
        System.out.println("oturulan_siradaki_bos_koltuk_sayisi = " + oturulan_siradaki_bos_koltuk_sayisi);
    }
}
