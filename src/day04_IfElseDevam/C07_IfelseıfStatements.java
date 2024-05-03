package day04_IfElseDevam;

import java.util.Scanner;

public class C07_IfelseıfStatements {
    public static void main(String[] args) {
        // SORU :- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        // vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen kilonuzu ve boyunuzu giriniz");

        double kilo= scan.nextDouble();
        double boy=scan.nextDouble();
        double kıtlendeksı=(kilo*10000 / (boy *boy));

        System.out.println(kıtlendeksı);

        if(kıtlendeksı>30){
            System.out.println("obez");}
        else if (kıtlendeksı < 30 & kıtlendeksı>25) {
            System.out.printf("kilolu");}
        else if (kıtlendeksı < 25 & kıtlendeksı>20) {
            System.out.printf("normal");}
        else
            {System.out.printf("zayıf");}
    }
}
