package day08_ScannerAndOperators;

import java.util.Scanner;

public class C06_ScannerTask1 {
    public static void main(String[] args) {

        //Kullanıcıdan bir sayı alın
        //Sayının karesini alıp konsola yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        int s= scan.nextInt();

        System.out.println("Girdiğiniz sayının karesi = " +(s*s) + "dir.");

        scan.close();





    }
}
