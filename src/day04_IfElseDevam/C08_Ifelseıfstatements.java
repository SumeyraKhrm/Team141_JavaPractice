package day04_IfElseDevam;

import java.util.Scanner;

public class C08_Ifelseıfstatements {
    public static void main(String[] args) {

        /*
            -Verilen gorev sonucunda yazdigimiz kod else ile bitmeyebilir

            -EGER
            if, else-if,.... cumleleri else ile bitmiyorsa
            bazi degerler icin hic bir if body'sinin calismayacagini
            gozonunde bulundurmaliyiz
         */

        // SORU :- kullanicdan bir tamsayi alin ,sayi 0'dan kucukse "negatif sayi" yazdirin,
        // negatif olmayan sayilardan, tek basamakli olanlar icin "Rakam",
        // iki basamakli sayilar icin "Sayi", uc basamakli sayilar icin "Buyuk sayi" yazdirin

        /*

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi < 0) System.out.println("Negatif sayi");
        else if (girilenSayi < 10) System.out.println("Rakam");
        else if (girilenSayi<100) System.out.println("Sayi");
        else if (girilenSayi<1000) System.out.println("Buyuk sayi");
         */


        /*
            - Bize verilen gorevdeki siralama farkli olsa da
            if, else-if ... cumlelerinin bir elek gibi calistigini unutmamaliyiz
            en cok kisitlama olani en basa yazmaliyiz
            - KODLAR TEK SATIR ISE SUSLU PARANTEZ SART DEGILDIR
         */

        // SORU :- Kullanicidan bir tamsayi isteyin
        // sayi 7 ile bolunuyorsa "7'nin kati" , sayi 5 ile bolunuyorsa "5'in kati"
        // her ikisine de bolunuyorsa "Super sayi" ,ikisine de bolunemiyorsa "Kotu sayi" yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");
        int sayı =scan.nextInt();

        if(sayı%7==0 &sayı%5==0)
            System.out.printf("Super sayi");
        else if (sayı%5==0)
            System.out.printf("5'in katı");
        else if(sayı%7==0)
            System.out.println("7'nin kati");
        else System.out.println("Kotu sayi");


    }
}
