package day07_stringManipulations;

import java.util.Scanner;

public class C05_soruJava {
    public static void main(String[] args) {

        //SORU : kullanicidan bir mail alin
        //        - mail @ icermiyorsa "gecersiz mail"
        //        - mail @gmail.com icermiyorsa, "mail gmail olmali"
        //        - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        //        yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir mail giriniz...");
        String mail= scan.nextLine();


        // bagimsiz if else kullanirsak tum hatalari yazdirir
        // if-else kullanirsak ilk hatayi yazdirir, kalan calismaz

        // gorevde net olarak tercih belirtilmediginden
        // biz if-else tercih ettik

        if (!mail.contains("@")){          // içermiyorsa demek icin ! koyuyoruz
            System.out.println("gecersiz mail");
        } else if ( !mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        }

    }
}
