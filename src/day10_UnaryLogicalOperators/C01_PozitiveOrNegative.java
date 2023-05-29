package day10_UnaryLogicalOperators;

import java.util.Scanner;

public class C01_PozitiveOrNegative {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz (Örnek : 200) : ");
        int sayi = scan.nextInt();

        boolean isPositive = sayi>0;
        boolean isNegative = sayi<0;
        boolean isZero = sayi==0;

        System.out.println( sayi + " is positive number "+isPositive);
        System.out.println( sayi + " is negative number "+isNegative);
        System.out.println( sayi + " is zero "+isZero);













    }
}
