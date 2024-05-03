package day32_accessModifiers;

public class C03_AyniPackageFarkliClass {

    public static void main(String[] args) {

        // System.out.println(C02_Depo.privateStr); bu görünmuyor
        System.out.println(C02_Depo.defaultStr);
        System.out.println(C02_Depo.protectedStr);
        System.out.println(C02_Depo.publicStr);

        C02_Depo depo = new C02_Depo();
        //System.out.println(depo.privateSayi);
        System.out.println(depo.defaultSayi);   //static olmayanları obje uzerinde gerebilriz
        System.out.println(depo.protectedSayi);
        System.out.println(depo.publicSayi);

    }
}
