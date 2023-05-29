package day14_NestedWhileDoWhile;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {
            for (int colmn = 1; colmn <= 5; colmn++) {
                System.out.print("I");
            }
            System.out.println();
        }
        System.out.println("-------------------------");

        for (int x = 1; x <= 6; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();


        }
        System.out.println("---------------------------------");
for (int i =6;i>=0;i--){
for (int j =1;j<=i;j++){
    System.out.print("*");
}
    System.out.println();
}










    }
}
