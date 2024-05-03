package day04_IfElseDevam;

import java.util.Scanner;

public class C10_EmeklılıkSorusu {
    public static void main(String[] args) {

        //SORU :- Kullanicidan cinsiyetini ve yasini alin,
        //        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //        veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.


        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz: K:Kadın ,E:Erkek");
        char cinsiyet =scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasınızı giriniz");
        double yas = scan.nextDouble();

        if(cinsiyet=='K'&& yas>=60){
            System.out.println("Kadın,emekli olabilirsin"); }
            else if (cinsiyet=='K'&& yas<60) {
                System.out.println("Emekli olmak icin " +(60-yas)+ " yil daha calisman gerekir");}
        else if (cinsiyet=='E'&& yas>=65){
            System.out.println("Erkek,emekli olabilirsin");}
        else if (cinsiyet=='E'&& yas<65) {
            System.out.printf("Emekli olmak icin " +(65-yas)+ " yil daha calisman gerekir");}
        else System.out.printf("Girilen bilgiler yanlıs, lutfen kontrol ediniz");



    }
}
