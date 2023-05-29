package day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class C03_IF_Example {
    public static void main(String[] args) {

        //alinin fizik not 50
        // kimya 30 ortalamsı 50 üzerindeyse ekrana geçti yazsın
        // 50 ve altındaysa herhangi birşey yazmasın

    /*    double f = 50;
        double k = 55;
        double ort = (f + k) / 2;
        double gecmeNotu = 50;

        if (ort > gecmeNotu) {
            System.out.println("Ali geçti");
        }
*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Ders Notlarını Giriniz");
        System.out.println("Fizik : ");
        double f= scan.nextDouble();
        System.out.println("Kimya :");
        double k=scan.nextDouble();
        System.out.println("Geçme Notu :");
        double gecmeNotu=scan.nextDouble();
        double ort=(f+k)/2;

        if (ort>=gecmeNotu){
            System.out.println("Geçti");
        }


    }
}
