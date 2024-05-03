package day09_forLoop;

import java.util.Scanner;

public class C05_forLoop_devam {
    public static void main(String[] args) {

        // Soru :10 ile 50 arasındaki 9 ile bolunebilen sayıları toplayın

        int toplam =0;

        for (int i = 10; i <50 ; i++) {

            if(i%9==0) { toplam += i ;}
        }

        // forloop parentezini kapattıkdan sonra yazdır ki tekrarlamasın
        System.out.println("9 ile bolunebılen sayıların toplamı : "+ toplam);


        // Soru : 2 basamaklı pozitif ve negatif tum sayıların toplamını yazdırın

        toplam = 0;

        for (int i =-99 ; i<100 ; i++){ //arada

            if (!(i>=-9 && i<10)){
                toplam += i;
            }
        }

        System.out.println("iki basamaklı tum sayıların toplamı : " + toplam);


        // Soru : bir kronometre yapin , kullanicidan aldiginiz pozitif sayidan
        // 1'e kadar tum sayilari yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        for (int i = sayi; i >= 1 ; i--) {
            System.out.print(i + " ");
        }



    }
}
