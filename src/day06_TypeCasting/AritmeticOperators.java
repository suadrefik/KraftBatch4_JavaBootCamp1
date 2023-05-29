package day06_TypeCasting;

public class AritmeticOperators {
    public static void main(String[] args) {
        int x=5;
        int y=2;

        double z=x/(double)y;
        System.out.println(z);
        double t=x/y;

        System.out.println(t);

        int sayi=3+5/2*4%(12-9);
        //Öncelik Her zaman Parantez içi
        //sayi =3+5/2*4%3
        //sonra çarpma,bölme,mod alma işlemleri soldan sağa doğru
        //sayi =3+2(2,5 fakat int değer olduğu içib 2 alacağız)*4%3
        //sayi =3+8%3
        //sayi =3+2
        //sayi =5


        System.out.println(sayi);



    }
}
