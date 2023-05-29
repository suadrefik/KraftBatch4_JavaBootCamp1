package day13_ForLoops;

public class C06_Tasks {

    public static void main(String[] args) {
//0 ile 100 arasındaki tüm sayıları yazdırın
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("-------------------");
        for (int i = 15; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------------");
        for (int i = 100; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------------");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("-------------------");

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("-------------------");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Sum : " + sum);
        System.out.println();
        System.out.println("-------------------");

        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " " + i * i * i);
        }
        System.out.println();
        System.out.println("-------------------");
        for (int i = 23; i <= 50; i++) {
            System.out.println(i + "Celcius = " + (i * 1.8 + 32));
        }
        System.out.println("-------------------");
        System.out.println();
for (char ch='a';ch<='z';ch++){
    System.out.print(ch+" ");
}
        System.out.println();
        System.out.println("-------------------");

        for (int i=1;i<=10;i++){
            System.out.println("9 X "+i+" = "+9*i);
        }

        System.out.println();
        System.out.println("-------------------");


//Homework
        for (int i = 10; i <= 1000; i++) {
            if (i % 10 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("-------------------");


    }

}
