package day12_SwitchCase;

import java.util.Scanner;

public class C03_Nested_If {
    public static void main(String[] args) {
        // bir restorana girişte kullanıcıya 18 yaşında olup olmadığını soran 18 yaşın altında ise giremez şeklinde ikaz verip programı kapatsın
        Scanner scan=new Scanner(System.in);
        System.out.println("Yaşınız:");
        int yas=scan.nextInt();


        if (yas>=18){
            System.out.println("Yanınızda hanımefendi var mı? (Evet/Hayır)");
            String yanit=scan.next();
            if (yanit.equals("Evet")){
                System.out.println("Hosgeldiniz");

            } else {
                System.out.println("Giremezsiniz");

            }
        }else {
            System.out.println("Giremezsiniz");
        }



    }
}
