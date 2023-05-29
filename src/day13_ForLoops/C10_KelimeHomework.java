package day13_ForLoops;

import java.util.Scanner;

public class C10_KelimeHomework {
    public static void main(String[] args) {
      /*Örnek: Kullanıcıdan bir kelime alın ve kaç defa yazdırmak istediğini
sorun . Kullanıcıdan aldığınız kelimeyi kullanıcının istediği kadar
ekrana yazdırın. */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime= scan.nextLine();
        System.out.println("Lütfen bir sayı giriniz");
        int num= scan.nextInt();
        for (int i=0;i<=num;i++){
            System.out.println(kelime);

        }





    }
}
