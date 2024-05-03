package day02_dataCasting;

import java.util.Scanner;

public class C09_Modulus {
    public static void main(String[] args) {

        System.out.println( 25 % 4 ); // 1

        System.out.println(23454321 % 7); // 2 bu sayi 7 ile tam bolunmez

        // 354645241 sayisi 17'ye bolunur mu ?

        System.out.println(354645241 % 17 ); // 13 tam bolunemiyor

        int verilenSayi = 456;

        System.out.println( 456 % 2 ); // 0 ==> verilen sayi cift sayi


        // verilen sayinin birler basamagini yazdirin

        System.out.println( verilenSayi % 10 ); // 6

        System.out.println( verilenSayi / 10 ); // 456/10 ==> 45,6 java 45 yazdirir

        System.out.println((double)verilenSayi / 10); // 45.6

        // soru: verilen 3 basamaklı birsayının rakamlar toplamını bulun

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 3 basamaklı bir sayı giriniz");
        int sayı = scan.nextInt();


        int sayi = sayı;
        int birlerBasamagi = 0 ;
        int rakamToplami = 0;


        // 245 sayısı için ;

        birlerBasamagi = sayi % 10 ;  // 5
        rakamToplami = rakamToplami+birlerBasamagi;  // 0 + 5
        sayi = sayi / 10;   //245 / 10= 24

        birlerBasamagi = sayi % 10 ; // 4
        rakamToplami = rakamToplami + birlerBasamagi; // 5+4
        sayi = sayi / 10;   // 24/10= 2

        rakamToplami = rakamToplami + sayi;  // 9+ 2

        System.out.println("Girilen " + sayı + " sayisinin rakamlar toplami : " +
                rakamToplami);

    }
}
