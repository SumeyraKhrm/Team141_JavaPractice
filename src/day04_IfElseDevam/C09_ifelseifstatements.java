package day04_IfElseDevam;

import java.util.Scanner;

public class C09_ifelseifstatements {
    public static void main(String[] args) {

        //SORU :- Kullanicidan mesafeyi kilometre olarak alin
        //        ve cevirmek istedigi birimi sorun,
        //        istedigi birim metre veya santimetre ise cevirip yazdirin,
        //        yoksa “istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("mesafeyi km olarak mesafeyi giriniz");
        double mesafe= scan.nextDouble();

        System.out.println("lütfen çevirmek istedigınız birimi giriniz");
        String bırım= scan.next();

        if(bırım.equalsIgnoreCase("metre"))   // buyuk, kucuk yazımı farketmeksizin
            System.out.println("Girilen mesafe metre olarak :"+ mesafe*1000+ " metredir");
            else if (bırım.equalsIgnoreCase("santimetre"))
                System.out.println("Girilen mesafe metre olarak :"+ mesafe*1000000+ " santimetredir");
                else System.out.printf("istediginiz birim sisteme kayitli degil");






    }
}
