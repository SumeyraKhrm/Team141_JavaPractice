package day05_NestedifElseStatements;

import java.util.Scanner;

public class C04_TernarySwitch {
    public static void main(String[] args) {

        /*
            //SORU :- Kullanicidan notunu alin
            //       50 veya daha buyukse ”Sinifi Gectin”,
            //       50’den kucukse “Maalesef kaldin” yazdirin.

            Scanner scanner = new Scanner(System.in);

            System.out.println("Lutfen notunuzu giriniz...");

            double not = scanner.nextDouble();

            System.out.println( not >=50 ? "Sinifi Gectin"  : "Maalesef kaldin"  );


         */

            //SORU :- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

           Scanner scanner = new Scanner(System.in);
           System.out.println("Lutfen iki sayi giriniz...");
           double sayi1 = scanner.nextDouble();
           double sayi2 = scanner.nextDouble();

           System.out.println( sayi1 > sayi2 ? sayi2 : sayi1);








    }
}
