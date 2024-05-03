package day03_matematiksel;

import java.util.Scanner;

public class C04_ifSorular {
    public static void main(String[] args) {

        // Kullanicidan bir harf alin, girilen harf kucuk harf ise "Kucuk", buyuk harf ise "buyuk" yazdirin
/*
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char harf =scan.next().charAt(0);

        if (harf>='a' && harf<='z'){System.out.printf("Kucuk");}
        if (harf>='A' && harf<='Z'){ System.out.printf("Buyuk");}

*/

        // kullanicidan notunu isteyin
        // kullanici 0 ile 100 arasinda olmayan bir not girerse
        // gecersiz not yazdirin
        // 0 ile 100 arasinda (sinirlar dahil) bir not girerse
        // gecerli not yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir not giriniz");
        double not= scan.nextDouble();
        if(not>=0 & not<=100 ){
            System.out.println("gecerli not");}
        if (not<0 || not>100) {
            System.out.println("gecersiz not");}
        //    else {System.out.println("gecersiz not");}
    }
}
