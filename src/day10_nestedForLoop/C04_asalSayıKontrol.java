package day10_nestedForLoop;

import java.util.Scanner;

public class C04_asalSayıKontrol {
    public static void main(String[] args) {

        //Soru :- Kullanicidan pozitif bir tamsayi isteyip,
        //         sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        int flag = 20;


        for (int i=2; i < sayi ; i++)
        {
            if(sayi %i ==0){
                System.out.println("verilen sayı" + i +" ye bolunuyor, asal sayı değildir");
                flag =10;
                break; // break komutu loop a derhal bitirir
            }
        }

        if (flag == 20){
            System.out.println( "sayı asal");
        }

    }
}
