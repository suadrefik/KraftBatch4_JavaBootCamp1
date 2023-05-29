package day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class C04_IF_ELSE {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Ders Notlarını Giriniz");
        System.out.println("Fizik : ");
        double f= scan.nextDouble();
        System.out.println("Kimya :");
        double k=scan.nextDouble();
        System.out.println("Matematik :");
        double m=scan.nextDouble();

        System.out.println("Geçme Notu :");
        double gecmeNotu=scan.nextDouble();
        double ort=(f+k+m)/3;

        if (ort>=gecmeNotu){
            System.out.println("Geçti");
        }else {
            System.out.println("Kaldı");
        }








    }
}
