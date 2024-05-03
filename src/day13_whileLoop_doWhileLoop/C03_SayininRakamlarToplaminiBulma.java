package day13_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_SayininRakamlarToplaminiBulma {

    public static void main(String[] args) {

        // Soru 2- While loop kullanarak
        //         kullanicidan alinan sayinin rakamlar toplamini bulun.


        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayi = scanner.nextInt();


        int enSondakiRakam = 0;
        int rakamlarToplamı = 0;
        int verilenSayi = sayi;


        while (verilenSayi >0 ){

            enSondakiRakam = verilenSayi % 10;
            rakamlarToplamı += enSondakiRakam ;
            verilenSayi /=10;

        }

        System.out.println("verilen " + sayi + " sayısının rakamlar toplamı " + rakamlarToplamı);


    }
}
