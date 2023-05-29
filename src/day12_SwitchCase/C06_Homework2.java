package day12_SwitchCase;

import java.util.Scanner;

public class C06_Homework2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int sayi=15;
        System.out.println("Tahmin ettiğim sayı sence kaç?");
        int sayitahmin = scan.nextInt();

        if (sayitahmin<sayi){
            if (Math.abs(sayitahmin-sayi)<5){
                System.out.println("Yaklaştın biraz az söyledin");
            }else {
                System.out.println("Ufak attın");
            }
        } else if (sayitahmin>sayi){
            if ((sayitahmin-sayi)<5){
                System.out.println("Yaklaştın biraz fazla söyledin");
            }else {
                System.out.println("Amma salladın");
        }
        }
        else{
                System.out.println("Tebrikler Tam Tahmin Ettiğim Sayı");
            }


    }
}
