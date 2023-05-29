package day10_UnaryLogicalOperators;

import java.util.Scanner;

public class C03_SwapVariables {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("a sayisi icin bir tam sayi giriniz: ");
        int a = scan.nextInt();

        System.out.println("b sayisi icin bir tam sayi giriniz: ");
        int b = scan.nextInt();


        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;

        a=b;
        b=temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);








    }
}
