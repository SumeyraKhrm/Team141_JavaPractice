package day01_JavaGırıs;

import java.util.Scanner;

public class C04_Swap {
    public static void main(String[] args) {

        //Soru- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen birinci sayı giriniz");

        int sayi1 = scanner.nextInt();

        System.out.println("lütfen ikinci sayıyı giriniz");

        int sayi2 = scanner.nextInt();

        int temp = 0;           // yer değişimi için bir boşluk oluşturuluyor

        temp = sayi1 ;

        sayi1 = sayi2;

        sayi2 = temp;

        System.out.println("sayilarin yerini degistirdim " +
                "\nSayi1 : " + sayi1 + ", Sayi2 : " + sayi2 + " oldu.");


    }
}
