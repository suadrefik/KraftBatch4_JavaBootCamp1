package day12_SwitchCase;

import java.util.Scanner;

public class C04_Example {
    public static void main(String[] args) {
        //öğrencinin ortalamasını alın
        // ortalama 50 nin altında ise zayıf
        // 50 dahil 70 e kadar orta
        // 70 dahil 85 arası iyi
        //85 üzeri pekiyi ekrana yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Ortalamanızı Giriniz:");
        double sayi = scan.nextDouble();

        if (sayi<50){
            System.out.println("Not ortalamnız zayıftır");
        } else if (sayi>=50 && sayi<70) {
            System.out.println("Orta");
        } else if (sayi>=70 && sayi<85) {
            System.out.println("İyi");
        } else if (sayi>=85) {
            System.out.println("Pekiyi");
        }


    }
}
