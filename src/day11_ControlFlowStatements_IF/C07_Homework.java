package day11_ControlFlowStatements_IF;

public class C07_Homework {
    public static void main(String[] args) {

        //üç numara kabul etsin büyük olanı versin
        //2 veya üç yolla çöz

        int x,y,z;
        x=60;
        y=40;
        z=30;

        if (x>y && x>z){
            System.out.println(x);
        }else if (y>z && y>x){
            System.out.println(y);
        }else
            System.out.println(z);



    }
}
