package day08_ScannerAndOperators;

public class C01_NonPrimitiveDataTypes {
    public static void main(String[] args) {

        String fullName="Ali OZTURK";

        String firstLetter="A";
        char firstLetter2='B';
//primitive data türünde değişkenler sadece veri taşıyor
        // non primitive data türünde değişkenler hem veri taşıyor hemde methodları var.

        System.out.println(firstLetter.toLowerCase());

        String metin="sdfghjklşidafdsgfd+jkfdsladakfgjfd+"+fullName+"asdfadsf" +
                "asdfasdf" +firstLetter+"sadsadasd"+firstLetter2;

        System.out.println(metin);

        String not= "not";
        String Not= "Variable isimlerine büyük harfle başlamak tavsiye edilmez ama java kabul eder";
        String nOT= "Bir kere declare ettiğim bir değişkeni tekrar declare edilemez";
        String noT= "ama isimler farklı olursa java bunları farklı değişkenler olarka kabul eder ve işler";

        //name convention : değişken isimleri küçük harfle başlar, sonraki kelimer bitişik ve büyük Harfle başlar
        // Örnek : fullName, firstName, ogrenciAdi, okulNumarasi,
        //camelCase : bu yazı tipine verilen ad
        //CamelCase : Classlarda bu şekilde kullanıyoruz




    }

}
