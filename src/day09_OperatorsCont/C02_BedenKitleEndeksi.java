package day09_OperatorsCont;

import java.util.Scanner;

public class C02_BedenKitleEndeksi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Boyunuzu Giriniz (ornek 1,85) : ");
        double boy = scan.nextDouble();

        System.out.print("Kilonuzu Giriniz (ornek 80,5) : ");
        double kilo = scan.nextDouble();

        double bki = ((kilo)/(boy*boy));

        System.out.println("Vücut Kitle Endeksiniz : "  +bki );
    }
}
