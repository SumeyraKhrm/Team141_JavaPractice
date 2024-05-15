package day40_exceptions;

import java.util.Scanner;

public class C05_DahaKapsamliTekException {

    public static void main(String[] args) {

        //ikisinde de sorunu yazdırıyor fakat detay vermiyor yani sorunun kaynagını vermiyor

        String str = "Java gun gectikce guzellesir ";

        // Kullanicidan pozitif bir tamsayi alin
        // ve bu tamsayiyi index olarak kabul edip
        // str'da o index'deki harfi yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz...");

        try {
            int index = scanner.nextInt(); // InputMissmatchException

            System.out.println(str.charAt(index)); // StringIndexOutOfBoundsException

        } catch (Exception e) { // RunTimeException da olur
            // Exception ve RunTimeException daha kapsamli olduklarindan
            // hem InputMissmatchException'i hem de StringIndexOutOfBounds Exception'i yakalar
            // ama sorunun hangisinden kaynaklandigini bilemeyiz
            System.out.println("girilen deger sonuc yazdirmaya uygun degil");

        }


    }
}
