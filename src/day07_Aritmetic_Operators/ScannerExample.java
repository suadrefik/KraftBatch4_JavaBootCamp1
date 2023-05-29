package day07_Aritmetic_Operators;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
/*
        Scanner scan= new Scanner(System.in);
        System.out.println("Kimya:");
        int kimya=scan.nextInt();
        System.out.println("Fizik:");
        int fizik=scan.nextInt();
        double ortalama=((double)fizik+kimya)/2;
        System.out.println("ortalama "+ortalama);

        Scanner scan=new Scanner(System.in);
        System.out.println("Doğum Yılınız: ");
        int yil=scan.nextInt();
        int yas=2023-yil;
        System.out.println("yas = "+yas);

*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Fizik: ");
        double f=scan.nextDouble();
        System.out.println("Kimya: ");
        double k=scan.nextDouble();
        System.out.println("Matematik: ");
        double m=scan.nextDouble();
        double ortalama=(f+k+m)/3;

        System.out.println("ortalama = " + ortalama);




    }
}
