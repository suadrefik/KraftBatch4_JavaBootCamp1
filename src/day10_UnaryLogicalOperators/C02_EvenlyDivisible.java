package day10_UnaryLogicalOperators;

import java.util.Scanner;

public class C02_EvenlyDivisible {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");

        int number = scan.nextInt();

        boolean isDivisibleByTwo = number%2==0;
        boolean isDivisibleByThree = number%3==0;
        boolean isDivisibleByFive = number%5==0;

        System.out.println(number + " isDivisibleByTwo = " + isDivisibleByTwo);
        System.out.println(number + " isDivisibleByThree = " + isDivisibleByThree);
        System.out.println(number + " isDivisibleByFive = " + isDivisibleByFive);





    }
}
