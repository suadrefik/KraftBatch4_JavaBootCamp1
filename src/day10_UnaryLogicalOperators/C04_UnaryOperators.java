package day10_UnaryLogicalOperators;

public class C04_UnaryOperators {
    public static void main(String[] args) {

        int num1 = +3;
        int num2 = -2;
        System.out.println(num1>0);
        System.out.println(num2>0);


        System.out.println("-----------------");

        int a =10;
        ++a;// a dan çnce gelen 2 adet + pre increment oluyor ve sayının değerini 1 arttırır
        System.out.println("a = " + a);
        --a; // a dan önce gelen 2 adet - pre decrement oluyor ve sayının değerini 1 azaltıyor
        System.out.println("a = " + a);

        System.out.println("-----------------");

        int b = 99;
        System.out.println(++b);

        int c = 99;
        System.out.println(c++);    //c den sonra gelen 2 adet - post decrement oluyor sayıyı bir sonraki hamlede 1 azaltıyor
        System.out.println(c);

        System.out.println("-----------------");

        int x = 201;

        System.out.println(--x);

        int y = 201;

        System.out.println(y--);
        System.out.println(y);

        System.out.println("----------------------");

        int z = 44;
        System.out.println(++z);
        System.out.println(z++);
        System.out.println(z);

        int i = 42;
        System.out.println(--i);
        System.out.println(i--);
        System.out.println(i);

    }
}
