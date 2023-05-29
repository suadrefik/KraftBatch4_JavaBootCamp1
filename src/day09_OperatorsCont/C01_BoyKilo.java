package day09_OperatorsCont;

import java.util.Scanner;

public class C01_BoyKilo {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen Boyunuzu Giriniz:");
        double boy= input.nextDouble();

        System.out.println("Lütfen Kilonuzu Giriniz:");
        double kilo= input.nextDouble();

        System.out.println("Lütfen İsminizi Giriniz:");
        input.nextLine();
        String isim=input.nextLine();

        System.out.println("Soyisminizi Giriniz: ");
        String soyisim= input.nextLine();

        System.out.println(isim +soyisim     +" Boyunuz : "+boy+" Kilonuz : "+kilo);
    }
}
//nextLine yazıp girdiğin tüm veriyi alır
//next ilk boşluğa kadar olan yazıyı alır