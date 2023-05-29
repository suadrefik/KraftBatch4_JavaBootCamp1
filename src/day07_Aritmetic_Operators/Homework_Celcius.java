package day07_Aritmetic_Operators;

import java.util.Scanner;

public class Homework_Celcius {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Fahrenheit Değeri Giriniz: ");
        double f=scan.nextDouble();
        double celcius=(f-32)/1.8;
        System.out.println("celcius = " + celcius);
    }
}
