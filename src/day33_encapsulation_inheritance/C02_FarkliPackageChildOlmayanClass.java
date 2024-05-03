package day33_encapsulation_inheritance;

import day11_methodOlusturmaVeKullanma.C04_Palindrome;
import day32_accessModifiers.C02_Depo;

public class C02_FarkliPackageChildOlmayanClass {

    public static void main(String[] args) {
        // static class uyelerini classIsmi.staticClassUyesiIsmi;

        //System.out.println(C02_Depo.privateStr);
        //System.out.println(C02_Depo.defaultStr);
        //System.out.println(C02_Depo.protectedStr); // sadece child olanlar ulasır
        System.out.println(C02_Depo.publicStr);

        C02_Depo depo = new C02_Depo();
        // static olmayan class uyelerini objeIsmi.staticOlmayanClassUyesiIsmi;

        //System.out.println(depo.privateSayi);
        //System.out.println(depo.defaultSayi);
        //System.out.println(depo.protectedSayi);
        System.out.println(depo.publicSayi);

        System.out.println(C04_Palindrome.isPalindrome("Java Candir")); // false

    }
}
