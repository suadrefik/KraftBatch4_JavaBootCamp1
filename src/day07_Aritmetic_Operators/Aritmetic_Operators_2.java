package day07_Aritmetic_Operators;

public class Aritmetic_Operators_2 {
    public static void main(String[] args) {
     /*   int x=5;
        int y=10;
        int z=x+y;
        System.out.println(z);


        int dogum_yili=1990;
        int yas=2023-dogum_yili;
        int ahmet_yas=yas-5;
        System.out.println("yas = " + yas);
        System.out.println("ahmet_yas = " + ahmet_yas);


        //300 Fahrenheit kaç celciustur?
        //celcius=(fahrenheit-32)/1.8

        double f=300;
        double c=(f-32)/1.8;
        System.out.println("c = " + c);

//32 celcius kaç fahrenheit dır?
// tesine atıp çarp

        double c1=32;
        double f1=(c1*1.8)+32;
        System.out.println("f1 = " + f1);

*/

        //ali fizikten 92,
        //kimyadan55,
        //matematikten89 almıştır not ortalaması kaçtır?
/*
        double f=92;
        double k=60;
        double m=89;
        double ort=(f+k+m)/3;
        boolean gecti=ort>80;
        System.out.println("ort = " + ort);
        System.out.println(gecti);

// sınıf geçme not ortalaması 80 üzeri olduğuna göre ali sınıfı geçtiyse true geçmediyse false yazdırın.
*/

        int sira=15;
        int siradaki_koltuk=12;
        int katilimci=113;

        int salon_kapasite=sira*siradaki_koltuk;
        int bos_koltuk=salon_kapasite-katilimci;
        int kac_sirada_oturulur=(katilimci/siradaki_koltuk)+1;
        int bos_sira_adeti=sira-kac_sirada_oturulur;
        int siradaki_bos_koltuk=siradaki_koltuk-(katilimci%siradaki_koltuk);
        System.out.println(salon_kapasite);
        System.out.println(bos_koltuk);
        System.out.println(kac_sirada_oturulur);
        System.out.println(bos_sira_adeti);
        System.out.println(siradaki_bos_koltuk);
    }
}
