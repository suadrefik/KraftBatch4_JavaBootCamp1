package day12_SwitchCase;

import java.util.Scanner;

public class C02_IF_Else_Example {
    public static void main(String[] args) {
        /*,
        +,-,*,/
        4 işlem yapacak şekilde bir hesap makinesi yapın
        kullanıcıdan 2 sayı alın
        yapmak istedği işlemi seçsin +,-,*,/
        ekrana sonuç döndüren programı yazın
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        double num1 = scan.nextDouble();
        System.out.println("Bir sayı giriniz");
        double num2 = scan.nextDouble();
        System.out.println("Yapılacak işlemi seçiniz ( +,-,*,/ )");
        String islem = scan.next();

        if (islem.equals("+")){
            System.out.println(num1+num2);
        } else if (islem.equals("-")) {
            System.out.println(num1-num2);
        } else if (islem.equals("*")) {
            System.out.println(num1*num2);
        } else if (islem.equals("/")) {
            System.out.println(num1/num2);
        }else {
            System.out.println("Geçersiz değer girildi");
        }


    }
}
