package day11_ControlFlowStatements_IF;

import java.util.Scanner;

public class C05_IF_ELSE_Example {
    public static void main(String[] args) {
        //hava sıcaklığı 20 derece altında ise hava soğuk eşit ve üzerindeyse sıcak yazsın
/*
        double degree=25;
        if (degree>=20){
            System.out.println("Hava Sıcak");
        }else {
            System.out.println("Hava Soğuk");
        }
*/
        Scanner scan=new Scanner(System.in);

        System.out.println("Bir sayı yazınız :");
        int n = scan.nextInt();
        boolean result =(n%2==0);

        if (result){
            System.out.println("Çift Sayı");
        }else {
            System.out.println("Tek Sayı");
        }




    }
}
