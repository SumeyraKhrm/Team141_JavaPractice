package day03_matematiksel;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

         /*
            Bagimsiz if cumleleri,
            adindan anlasilacagi gibi kodun geriye kalanindan bagimsizdir

            sart'a odaklanir,
            sart true ise if body'si calisir,  sart false ise if body'si calismaz

            bagimsiz if cumleleri kod'un geriye kalaniyla ilgilenmediginden
            birden fazla bagimsiz if cumlesi oldugunda
            tumunun if body'si calisabilecegi gibi,
            hic birinin if body'sinin calismadigi da olabilir


        //sonuclar false olduğu için sonuçta birşey çıkmaz

        int a = 18;
        int b = 47;

        // Eger a b'den buyukse "a b'den buyuk" yazdirin
        if ( a > b ){ System.out.println("a b'den buyuk");}


        // b cift ise , " bu sayilarin carpimi cift olur" yazdirin
        if ( b % 2 == 0  ){ System.out.println("bu sayilarin carpimi cift olur");}


        // a 100'den buyukse "ilk sayi cok buyuk" yazdirin
        if ( a > 100 ){
            System.out.println("ilk sayi cok buyuk");}

        //Soru: Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz...");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1>0 ){ // Java'da uclu karsilastirma olmaz
            System.out.println("Eskenar ucgen");}

        */
        //Soru : Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //        NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //        Kullanici o veya O yazdiginda output Ocak olsun.


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char ay= scan.next().charAt(0);

        if (ay=='o' || ay=='O'){System.out.println("Ocak");}
        if (ay=='s' || ay=='S'){System.out.println("Subat");}




    }
}
