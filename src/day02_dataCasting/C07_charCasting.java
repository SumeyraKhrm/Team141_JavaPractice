package day02_dataCasting;

import java.util.Scanner;

public class C07_charCasting {
    public static void main(String[] args) {

        // char data turu ozel bir data turudur
        // normal olarak '' icinde tek bir karakter olabilir
        // ANCAK char data turu int ile gecis ozelligine sahiptir
        // char data turundeki bir variable, matematiksel isleme sokulursa
        // ASCII tablosundaki degeri ile isleme girer
        // ayni sekilde ASCII tablosundaki deger ile
        // int data turu olarak kullanilabilir

        char harf = 'a';

        int sayi = harf;     //sayı değerinde bir variable olduğu için

        double dbl = harf;


        char chr1 = 243;


        System.out.println( 'd' + 'b'); // 198

        System.out.println( '4' + '2'); // 102

        // kullanıcıdan bir harf alın ve onsan sonraki 3 harfi yazdırın
/*

        Scanner scan =new Scanner(System.in);

        System.out.println("lütfen bir karekter giriniz");

        char girilenkarakter =scan.next().charAt(0);

        System.out.println("Girdiginiz karakterden bir sonraki karakter : " +(char)(girilenkarakter+1)); //b karakter yazımı için casting
        System.out.println("Girdiginiz karakterden iki sonraki karakter : " +(girilenkarakter+2)); //102
*/

        //- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod
        //yazin

        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen 3 sayı giriniz");

        int sayı1 = scanner.nextInt();
        int sayı2 = scanner.nextInt();
        int sayı3 = scanner.nextInt();

        System.out.println("girilen sayıların ortalaması :" +((sayı1+sayı2+sayı3)/3)); //13
        System.out.println("girilen sayıların ortalaması :" +(double)((sayı1+sayı2+sayı3)/3)); //13.0
        System.out.println("girilen sayıların ortalaması :" +(double)(sayı1+sayı2+sayı3)/3); //13.33333

        // bolme isleminde pay veya paydayi double yaparsak sonuc double olur




    }
}
