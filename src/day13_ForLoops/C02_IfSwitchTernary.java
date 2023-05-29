package day13_ForLoops;

import java.util.Scanner;

public class C02_IfSwitchTernary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir harf giriniz:");
        char harf=scan.next().charAt(0);            //scanner sınıfı ile harf alamıyoruz fakat scanner ile bir string aldık ve charAt metoduyla ilk harfi aldık

        if (harf=='p' || harf=='P'){
            System.out.println("Pazar, Pazartesi, Perşembe");
        } else if (harf=='s' || harf=='S') {
            System.out.println("Salı");
        } else if (harf=='c'||harf=='C') {
            System.out.println("Carsamba, Cuma, Cumartesi");
        }else {
            System.out.println("Gecersiz Harf");
        }


        System.out.println("-----------------------");

        switch (harf){
            case 's','S':
                System.out.println("Salı");
                break;
            case 'c','C':
                System.out.println("Carsamba, Cuma, Cumartesi");
                break;
            case 'p','P':
                System.out.println("Pazar, Pazartesi, Perşembe");
                break;
            default:
                System.out.println("gecersiz harf");
        }

        String result= (harf=='p' || harf=='P') ? "Pazar, Pazartesi, Perşembe" : (harf=='s' || harf=='S') ? "Salı" : (harf=='c'||harf=='C') ? "Carsamba, Cuma, Cumartesi": "Geçersiz Harf";
        System.out.println(result);



    }
}
