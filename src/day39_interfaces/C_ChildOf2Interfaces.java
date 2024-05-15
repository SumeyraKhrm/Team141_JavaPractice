package day39_interfaces;

public class C_ChildOf2Interfaces implements B_ParentInterface02 {

    //Interface’in en buyuk avantaji coklu inheritance’i desteklemesidir.
    //1- Bir class’dan bir class’i inherit etmek istendiginde extends keyword kullanilir.
    //Class’dan Interface’i inherit etmek icin ise implements keyword kullanilir.
    //Bir class baska bir class’a extends ile child olup ayni zamanda implements keyword
    //ile aralarinda virgul kullanarak birden fazla interface’i de implement edebilir.


    // parent'i olan tum abstract yapilardaki
    // concrete olmayan method'lari
    // implement etmek ZORUNDADIR


    public void method1(){

    }

    public String method2(){

        return null;
    }


    public String method3(){

        // bir class birden fazla parent edinirse
        // (bir class ve/veya istedigi kadar interface)
        // ve bu parent'larda ayni isimde method'lar varsa
        // - parent class'lardaki ayni isimde olan method'larin
        //   return type'lari ayni ise sorun olmaz
        // - return type'lari farkli ise iki parent'i da mutlu etme sansi olmadigindan
        //   ya parent'lardan birinden vazgecmelisiniz
        //   ya da parent'larda degisiklik yapmalisiniz

        // parent edilnilen interface'lerde degisiklik yapmak
        // o interface'i daha once implement eden pek cok class'da
        // degisikliklere sebep olacagindan
        // ZORUNLU KALMADIKCA tercih edilmez

        return null;
    }

    public int method4(){
        return 8;
    }


}
