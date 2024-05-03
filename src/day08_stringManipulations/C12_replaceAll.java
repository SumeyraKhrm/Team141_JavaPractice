package day08_stringManipulations;

public class C12_replaceAll {
    public static void main(String[] args) {


        // SORU :-verilen String'deki tum ozel karakterleri,
        // sayilari ve yanyana birdenfazla olan space'leri temizleyin
        // ornek  input : J10a6%v*a     C^7an@90dir
        //        output: Java Candir

        String input = "J10a6%v*a++000     C^7an_@90#0#dir";

        //birden fazla olan spaceleri tek space e indirelim
        input = input.replaceAll("\\s+"," ");

        // tüm sayıları yok edelim
        input = input.replaceAll("\\d","");

        // space lerı korumak ıcın ,space yerine hıc kullanılmayan karakter atalım
        input = input.replaceAll("\\s+","5");

        // ozel karakterı yok edelım
        // boyle yapınca space de gidiyor
        input = input.replaceAll("\\W","");  // harfler, rakamlar ve _ dısındakı hersey

        //space yerine atadığımız 5 i eski hale getirelim
        input = input.replaceAll("5", " ");

        // W_' yi kapsamadıgındn, _' yi ozel olarak yok etmemiz lazım
        input = input.replace("_","");

        System.out.println(input);


        // String str =""Java""; bunu kabul etmez java
        System.out.println("\"Java\""); //"Java"

    }
}
