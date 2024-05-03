package day12_methodOverloading_whileLoop;

public class C01_MethodOverloading {

    public static void main(String[] args) {

        String str= "Java Candır";
        System.out.println(str.substring(5)); //Candır
        System.out.println(str.substring(5, 8));  //Can

        // Bir class'da ayni isimde birden fazla method olusturulmasina
        // METHOD OVERLOADING denir
        // method ların isimlerinin aynı olması gerekir


        toplam(3,4); // toplama int int ==> Iki integer'in toplami : 7
        toplam(3,4,6); // toplama int int int ==> Uc integer'in toplami : 13
        toplam(4,4.5); // toplama int double ==> integer ve double'in toplami : 8.5
        toplam(5.6,4); // toplama double int ==> double ve integer'in toplami : 9.6
        toplam(5.6,4.4); // toplama double double ==> Iki double'in toplami : 10.0


    }

    // Kural1 : Bir class'in icinde herseyi ayni olan 2 method olusturamazsiniz
    //          parametre isimlerini, access modifier'i veya static durumunu degistirmek yeterli Olmaz

    // Kural2 : Bir class icinde ayni isimde birden fazla method olusturabilmek icin (overloading)
    //          method'larin SIGNATURE'lari farkli olmalidir

    // Method Signature : Method ismi + parametrelerin data turleri  !!!!!!
    // Overloading olmasi icin ismi degistirmememiz gerekiyor,
    // Signature'i degistirmek icin 3 ihtimalimiz var
    //  - parametre sayisini degistirmek
    //  - data turlerini degistirmek
    //  - farkli data turundeki parametrelerin yerlerini degistirmek



    public static void toplam (int a, int b){  // toplam int int
        System.out.println("iki sayının toplamı :"+ (a+b));
    }
    public static void toplam (int a, int b, int c){  // toplam int int int
        System.out.println("iki sayının toplamı :"+ (a+b+c));
    }

    public static void toplam (double a, int b){  // toplam double int
        System.out.println("iki sayının toplamı :"+ (a+b));
    }

    public static void toplam (double a, double b){  // toplam double int
        System.out.println("iki sayının toplamı :"+ (a+b));
    }



}
