package day13_ForLoops;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen pozitif bir sayı giriniz : ");
        int num= scan.nextInt();

        if (num%2==0){
            System.out.println("çift sayı");
        }else {
            System.out.println("tek sayı");
        }
        System.out.println("-------------------------");

        System.out.println(num%2==0? "Çift sayı":"Tek sayı");














    }
}
