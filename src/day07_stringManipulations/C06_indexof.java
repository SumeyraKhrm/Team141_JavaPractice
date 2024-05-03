package day07_stringManipulations;

import java.util.Scanner;

public class C06_indexof {
    public static void main(String[] args) {

        // INDEXOF METODU

        String str = "Ali topu at, at Ali at";
        // indexof() parametre olarak hem string hem de char kabul eder

        System.out.println(str.indexOf("t")); //4 buldugu ilk t nin indexini yazdırır
        System.out.println(str.indexOf("Ali")); //0
        System.out.println(str.indexOf("pu at")); //6

        System.out.println(str.indexOf("t", 7)); // 10
        // 7.index ve sonrasındaki ilk t nin indexini verir.
        // "u at, at Ali at"



        //SORU : kullanıcıdan bir metin isteyin, girilen metindeki 2.a nın indexini yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String metin= scan.nextLine();

        int ilkındex = metin.indexOf("a");
        System.out.println(metin.indexOf("a",ilkındex +1));

        //gulele sana
        //
        // -1
    }
}
