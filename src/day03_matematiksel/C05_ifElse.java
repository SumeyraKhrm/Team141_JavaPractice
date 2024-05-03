package day03_matematiksel;

import java.util.Scanner;

public class C05_ifElse {
    public static void main(String[] args) {
        /*
        //Soru :- Kullanicidan yasini isteyin,
        //        65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        //        yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yasınızı giriniz");
        int yas = scan.nextInt();
        int gereklıyıl= 65-yas;
        if (yas>=65 || yas>65){System.out.println("Emekli olabilirsin");}
        else {
            //System.out.println("emekli olman icin calisman gereken yil :" + gereklıyıl);
            System.out.println("emekli olman icin calisman gereken "+ (65-yas) + " yıl var");}
*/

        //Soru :- Kullanicidan bir harf isteyin,
        //        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //        yoksa girilen karakteri girildigi gibi yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char girilenKarakter = scanner.nextLine().charAt(0);

        if ( Character.isLowerCase(girilenKarakter)){  // kucuk harf mi (is ile baslayan tum kelımeler)
            System.out.println(Character.toUpperCase(girilenKarakter));}
        else {
            System.out.println(girilenKarakter);}

    }
}
