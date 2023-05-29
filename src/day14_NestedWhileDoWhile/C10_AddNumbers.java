package day14_NestedWhileDoWhile;

import java.util.Scanner;

public class C10_AddNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz:");
        int n=scan.nextInt();
        int sum=n;

        while (n!=0){
            System.out.println("Toplanmasını istediğiniz sayıyı girin: ");
            n= scan.nextInt();
            sum+=n;

        }
        System.out.println("Toplam ="+sum);

    }
}
