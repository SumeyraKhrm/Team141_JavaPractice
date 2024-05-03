package day02_dataCasting;

public class C06_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 130;
        int sayi3 = 140;
        int sayi4 = 250;
        int sayi5 = 520;
        double dbl = 24.5;

        int sayi = (int)dbl;

        System.out.println("24.5'i integer'a cast edersek : " + sayi);
        // 24.5'i integer'a cast edersek : 24

        byte byt = (byte)sayi1;

        byt = (byte)sayi2;
        System.out.println("130'u byte'a cast edersek : " + byt);
        // 130'u byte'a cast edersek : -126

        byt = (byte)sayi3;
        System.out.println("140'u byte'a cast edersek : " + byt);
        // 130'u byte'a cast edersek : -116

        byt = (byte)sayi4;
        System.out.println("250'yi byte'a cast edersek : " + byt);
        // 130'u byte'a cast edersek : -6 ,her 256 da sıfıra gelicek

        byt = (byte)sayi5;
        System.out.println("520'yi byte'a cast edersek : " + byt);
        // 130'u byte'a cast edersek : 8


        int sayiA= 24;
        int sayiB = 8;
        int sayiC = 10;

        System.out.println( sayiA / sayiB ); // 3

        System.out.println( sayiA / sayiC ); // 24 / 10 ==> 2.4 ==> 2

        // isleme giren sayilarin ikisi de int oldugundan, Java sonucu da int olarak verir.

        double dblA = 24;

        System.out.println( dblA / sayiB ); // 24.0 / 8 ==> 3.0

        System.out.println(  dblA / sayiC ); // 24.0 / 10 ==> 2.4

        // isleme giren sayilardan biri double oldugundan, Java sonucu da double olarak verir.


        int a = 27;
        int b = 4;

        // a/b'yi ondalikli olarak yazdirin


        // direk bolsek
        System.out.println( a / b); // 27 / 4 ==> 6.75 ==> 6

        // bolme isleminin sonucunu double variable'a atasak
        double sonuc = a / b ;

        System.out.println(sonuc); // 6.0


        // sayilardan birini double'a cast edelim

        sonuc = (double)a / b ;

        System.out.println(sonuc); // 6.75



    }
}
