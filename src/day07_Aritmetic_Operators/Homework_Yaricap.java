package day07_Aritmetic_Operators;

import java.util.Scanner;

public class Homework_Yaricap {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Yarıçap Giriniz: ");
        double r=scan.nextDouble();
        double PI=3.14;
        double alan=(PI*r*r);
        double cevre=(2*PI*r);
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
    }
}
