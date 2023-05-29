package day13_ForLoops;

import java.util.Scanner;

public class C11_TekCiftSayilarToplami {
    public static void main(String[] args) {
/* Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın
girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
tek ve çift tamsayıların toplamını ayrı ayrı ekrana yazdıran programı
yazınız./*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Lüften bir sayı giriniz: ");
        int sayi= scan.nextInt();
        int teksayi=0;
        int ciftsayi=0;

        for (int i=0;i<=sayi;i++){
            if (i%2==1){
                teksayi=teksayi+i;
        }else {
                ciftsayi=ciftsayi+i;
            }
            System.out.println("ciftsayi = " + ciftsayi);
            System.out.println("teksayi = " + teksayi);
        }

//        if (i % 2 == 1) {
//        System.out.print(i + " ");
//    }

//        for (int i = 1; i <= 100; i++) {
//            sum = sum + i;






    }
}
