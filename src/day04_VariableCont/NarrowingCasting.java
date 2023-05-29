package day04_VariableCont;

public class NarrowingCasting {
    public static void main(String[] args) {

        double rate=3.9;
        int num;

        num=(int)rate;                              //double tipindeki 3.9 sayısını int kısmını al diye narrowing casting yaptık
                                                    // type dönüşümü manual yapıldığı için manual casting deniyor


        System.out.println(num);




    }
}
