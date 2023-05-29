package day08_ScannerAndOperators;

import java.util.Scanner;

public class C07_ScannerTask2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen İsminizi Giriniz: ");
        String isim=scan.nextLine();

        System.out.println("Lütfen Soyisminizi Giriniz: ");
        String soyIsim=scan.nextLine();

        System.out.println("Lütfen Yaşınızı Giriniz: ");
        int yas=scan.nextInt();
scan.nextLine();
        System.out.println("Doğum Yeriniz: ");
        String dogumYeri=scan.nextLine();

        System.out.println("isim = " + isim);
        System.out.println("soyIsim = " + soyIsim);
        System.out.println("yas = " + yas);
        System.out.println("dogumYeri = " + dogumYeri);
        System.out.println("Tebrikler Kaydınız Başarıyla Alınmıitır");







    }
}
