package day07_Aritmetic_Operators;

import java.util.Scanner;

public class Homework_Saniye {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Saniye Giriniz: ");

        int saniye= scan.nextInt();
        int saat=(saniye/3600);
        int dakika=(saniye%3600)/60;
        int kalan_saniye=(saniye%60);

        System.out.println("saat = " + saat);
        System.out.println("dakika = " + dakika);
        System.out.println("saniye = " + kalan_saniye);


    }
}
