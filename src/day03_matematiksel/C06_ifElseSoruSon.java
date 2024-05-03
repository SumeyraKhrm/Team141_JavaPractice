package day03_matematiksel;

import java.util.Scanner;

public class C06_ifElseSoruSon {
    public static void main(String[] args) {

        // kullanicidan bir sayi isteyin
        // sayi 100'den kucuk ise "tebrikler kazandiniz" yazdirin
        // sayi 100'den kucuk degilse
        // "Maalesef bu defa olmadi" yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayı= scan.nextDouble();
        if(sayı<100){
            System.out.println("tebrikler kazandiniz");
            System.out.println("adam kazandı");
        }
        else {
            System.out.println("Maalesef bu defa olmadi");
            System.out.println("adam kaybetti");
        }


        if(sayı<100){
            System.out.println("tebrikler kazandiniz");}
        else {
            System.out.println("Maalesef bu defa olmadi");}
        System.out.println("Bu satir her durumda calisir, if else'in bir parcasi degildir");


        /*
            If Else cumlelerinde
            {} kullanmak zorunlu degildir

            ANCAK

            Eger suslu parantez kullanmazsaniz
            if body'si olarak sadece tek bir satir kod yazabilirsiniz, 2.satiri yazamazsiniz
            else body'si olarak da sadece tek bir satir yazabilirsiniz,

            else'in devaminda 2. veya daha fazla satir yazilabilir
            ama o satirlar else body'si olmaz
            HER ZAMAN calisir

         */


    }
}
