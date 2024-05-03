package day10_nestedForLoop;

import java.util.Scanner;

public class C03_stringTerseCevırme {
    public static void main(String[] args) {

        //Soru :- (interview)- Kullanicidan bir String isteyin
        //        ve String’i tersine cevirip kaydedin.
        //       Orn :  metin : Java Candir   tersMetin : ridnaC avaJ

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        String tersMetin = "";

        for (int i= metin. length()-1 ; i>=0 ;i--){

            tersMetin +=metin.charAt(i);
        }
        System.out.println(tersMetin);

        // verilen metnin palindrome (tersten ve duzden ayni metin)
        // olup olmadigini yazdirin

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin PALINDROME");
        }else{
            System.out.println("Girilen metin PALINDROME degil");
        }

    }
}
