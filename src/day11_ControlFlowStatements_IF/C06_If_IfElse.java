package day11_ControlFlowStatements_IF;

public class C06_If_IfElse {
    public static void main(String[] args) {

        // A ve B 2 adet sayıyı karşılaştırı
        // A büyüktür Bden
        // B büyüktür A dan
        // A ve B eşittir
/*
        int a =10;
        int b=20;
        if (a>b){
            System.out.println("A büyüktür B den");
        } else if (b == a) {
            System.out.println("A ve B Eşittir");
        }else{
            System.out.println("B büyüktür A dan");
        }


        //3 adet iç açı alsın ve bunun üçgen olup olmadığını kontrol etsin

        int x,y,z;
        x=70;
        y=80;
        z=35;

        if ((x+y+z)==180){
            System.out.println("Üçgendir");
        }else{
            System.out.println("Üçgen değil");
        }

*/
        int x,y,z;
        x=60;
        y=90;
        z=30;
        if ((x+y+z)==180) {
            if (x == 90 || y == 90 || z == 90) {
                System.out.println("bu bir dik üçgendir");
            }else {
                System.out.println("bu bir dik üçgen değildir");
            }
        }



        else {
            System.out.println("Üçgen değil");
        }


    }
}
