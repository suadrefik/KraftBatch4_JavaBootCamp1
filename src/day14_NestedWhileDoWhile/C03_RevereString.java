package day14_NestedWhileDoWhile;

public class C03_RevereString {
    public static void main(String[] args) {

//        String name = "Ali";
//        System.out.println(name.length());
//        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(1));
//        System.out.println(name.charAt(2));

        String str="teneke";
        String reversed="";
        System.out.println("str.lenght() = " + str.length());

        for (int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }

        for (int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);







    }
}
