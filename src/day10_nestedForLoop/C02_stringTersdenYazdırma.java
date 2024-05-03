package day10_nestedForLoop;

import java.util.Scanner;

public class C02_stringTersdenYazdırma {
    public static void main(String[] args) {


        // Soru :-(interview)- Kullanicidan bir String isteyin
        //        ve String’i tersten yazdirin.
        //       Orn :  input : Java Candir   Output : ridnaC avaJ

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        for (int i =metin.length()-1 ;i>=0 ; i--){

            System.out.print(metin.charAt(i));
        }

    }
}
