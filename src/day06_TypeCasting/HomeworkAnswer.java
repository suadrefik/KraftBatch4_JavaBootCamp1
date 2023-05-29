package day06_TypeCasting;

public class HomeworkAnswer {
    public static void main(String[] args) {
      double soru_sayisi=60;
      double ogrenci_neti=51.25;
      double kac_yanlis_bir_dogru_goturur=4;
      double ogrenci_yanlis_sayisi=(soru_sayisi-ogrenci_neti)/(1+1/kac_yanlis_bir_dogru_goturur);

        System.out.println(ogrenci_yanlis_sayisi);



        /* Ali sınıfta 7-7 halı saha maçı planlamak ve oynanan maçta hakem olmak istiyor,
        sınıfta 18 kişi var ise kaç kişi oyun dışı kalacaktır.
         */
        double sinif_Mevcudu=18;
        double hakem=1;
        double kacarli_takimlar=7;
        double oyun_disi_kalanlar=(sinif_Mevcudu-hakem-(2*kacarli_takimlar));
        System.out.println(oyun_disi_kalanlar);

        /*
        Ali oynanan maçlarda 1 hakem olacak şekilde okulda 7-7 halı saha maçları düzenlemek istiyor, okul mevcudu 188 kişi ise kaç kişi dışarıda kalır?
         */

        double okul_Mevcudu=188;
        double hakemm=1;
        double kacarli_takimlarr=7;
        double her_mactaki_kisi_sayisi=(hakemm+(2*kacarli_takimlarr));
        double oyun_disi_kalanlarr=(okul_Mevcudu%her_mactaki_kisi_sayisi);
        System.out.println(oyun_disi_kalanlarr);


        /*Ödev
        Bir havuzu A musluğu tek başına 12 saatte, B musluğu 30 saatte dolduruyor,
        C musluğu ise dolu havuzu 9 saatte boşaltıyor.
        Bu 3 musluk birlikte açıldığında havuz ne kadar sürede dolar.
         */

        double A_musluk=1/12;
        double B_musluk=1/30;
        double C_musluk=-1/9;
        double hepsi_acilirsa=1/(A_musluk+B_musluk+C_musluk);
        System.out.println(hepsi_acilirsa);





    }
}
