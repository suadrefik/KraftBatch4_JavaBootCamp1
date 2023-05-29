package day13_ForLoops;

import java.util.Scanner;

public class C03_NegativePozitiveTernary {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int n= scan.nextInt();

        if (n>0){
            System.out.println("Pozitive Number");
        } else if (n<0) {
            System.out.println("Negative Number");
        }else {
            System.out.println("Zero");
        }


        System.out.println("-----------------------------");

        String result = (n>0)? "Pozitive Number": (n<0)? "Negative Number": "Zero";
        System.out.println(result);




    }
}
