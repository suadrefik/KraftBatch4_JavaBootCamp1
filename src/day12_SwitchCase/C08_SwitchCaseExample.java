package day12_SwitchCase;

import java.util.Scanner;

public class C08_SwitchCaseExample {
    public static void main(String[] args) {
/*,
        +,-,*,/
        4 işlem yapacak şekilde bir hesap makinesi yapın
        kullanıcıdan 2 sayı alın
        yapmak istedği işlemi seçsin +,-,*,/
        ekrana sonuç döndüren programı yazın
         */
/*
        Scanner scan=new Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        double num1 = scan.nextDouble();
        System.out.println("Bir sayı giriniz");
        double num2 = scan.nextDouble();
        System.out.println("Yapılacak işlemi seçiniz ( +,-,*,/ )");
        String islem = scan.next();

        switch (islem){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("hatalı giriş");

        }
*/
        int beden=50;

        switch (beden){
            case 38:
                System.out.println("38 numara bir small bedendir");
                break;
            case 40:
                System.out.println("40 numara bir small bedendir");
                break;
            case 42:
                System.out.println("42 numara bir small bedendir");
                break;
            case 44:
                System.out.println("44 numara bir medium bedendir");
                break;
            case 46:
                System.out.println("46 numara bir medium bedendir");
                break;
            case 48:
                System.out.println("48 numara bir medium bedendir");
                break;
            case 50:
                System.out.println("50 numara bir large bedendir");
                break;
            case 52:
                System.out.println("52 numara bir large bedendir");
                break;
            case 54:
                System.out.println("54 numara bir large bedendir");
                break;
            default:
                System.out.println("Hatalı giriş");

        }



    }
}
