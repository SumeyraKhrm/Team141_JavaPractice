package day40_exceptions;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class C04_TekTry2CatchBlogu {

    //bu da sorunu yazdırıyor ve hakkında detay veriyor yani sorunun kaynagını veriyor

    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesir ";

        // Kullanicidan pozitif bir tamsayi alin
        // ve bu tamsayiyi index olarak kabul edip
        // str'da o index'deki harfi yazdirin

        Scanner scanner = new Scanner(System.in);


        try {
            int index = scanner.nextInt(); // InputMissmatchException

            System.out.println(str.charAt(index)); // StringIndexOutOfBoundsException

        } catch (InputMismatchException e) {
            System.out.println("Pozitif tamsayi girmelisiniz...");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Girdiginiz sayi metnin sinirlari disinda");
        }

    }
}
