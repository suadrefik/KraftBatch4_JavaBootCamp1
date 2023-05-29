package day12_SwitchCase;

import java.util.Scanner;

public class C09_MotelHomework {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen motelimiz tanımak için (1-2-3) bir kat numarası girin ve oda adı seçiniz: ");

        int katno=scan.nextInt();

        System.out.println("Oda seçiniz");
        String odaNo= scan.nextLine();


        switch (katno) {
            case 1:
                System.out.println("1.kat: Resepsiyon - Güvenlik - Oda Hizmetleri");
                switch (odaNo){
                  case "Resepsiyon":
                System.out.println("tüm işlemleriniz için bekleriz");
                break;
                 case "Güvenlik":
                System.out.println("profosyonel bir hizmettir");
                break;
                   case "Oda hizmetleri":
                System.out.println("temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz");
                break;}
            case 2:



        }



    }
}
