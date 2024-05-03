package day10_nestedForLoop;

import java.util.Scanner;

public class C01_faktoryel {
    public static void main(String[] args) {

        /*
        //Soru :- Kullanicidan 14’den kucuk bir sayi alip,
        //        bu sayinin faktoryel degerini hesaplayin.
        //        5 ! = 5 * 4 * 3 * 2 * 1 ==> 120


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 14'den kucuk pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        int faktoryel = 1;

        for (int i =  sayi; i>=1 ; i--){
            faktoryel *= i;
        }

        System.out.println(faktoryel);

         */


        //Soru :- Kullanicidan 14’den kucuk bir sayi alip,
        //        bu sayinin faktoryel degerini hesaplayin.
        //        Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //	      Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 14'den kucuk pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        int faktoryel = 1;

        System.out.print( sayi +" ! = ");

        for (int i = sayi; i>=1 ; i--){

            faktoryel *=i;

            if (i !=1){      // son 1 de yıldız olmaması ıçın ozel durum
                System.out.print( i +" * ");
            } else {
            System.out.print( i + " ");}

        }
        System.out.print( "= "+ faktoryel );



    }
}
