package day09_OperatorsCont;

import java.util.Scanner;

public class C03_SayininRakamlariToplami {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen 3 basamakli pozitif bir sayi giriniz :");

        int number= scan.nextInt();
        int lastDigit=(number%10);
        int secondDigit=((number/10)%10);
        int firstDigit=((number/100)%10);
        int totalOfDigits=lastDigit+secondDigit+firstDigit;

        System.out.println("Girdiğiniz sayinin rakamlari toplami "+totalOfDigits);



    }
}
