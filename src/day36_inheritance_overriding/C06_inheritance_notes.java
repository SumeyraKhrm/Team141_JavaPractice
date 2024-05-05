package day36_inheritance_overriding;

public class C06_inheritance_notes {

      /*
        Onceki gun ozellikleri variable olarak olusturmustuk,
        ozellikler variable ise,
        dikkat etmemiz gereken en onemli konu DATA TURU secilen class'dir
        data turu secilen class'dan aramaya baslayip,
        ilk buldugumuzu kullaniriz

        ANCAK,
        ozellikler method olarak olusturuldugunda
        overridding(gecersiz kilmak) devreye girer
        override eden method'lar ve override edilen method'lar
        intelliJ'de asagi veya yukari yonlu oklarla gosterilirler

        ozellikleri belirlemede
        data turu secilen class ve constructor
        birlikte etkili olurlar

        aramaya data turu secilen class'dan baslariz
        aranan ozellik bulununca,
        hemen ilk bulunani kullanmayiz,
        buldugumuz method, constructor'in oldugu class'a kadar
        ovverride edilmisse,
        daha guncel bilgiyi kullaniriz

        Farkli bir bakis acisiyla soylersek;
        EGER constructor ve data turu ayni class'dan ise
        ozelliklerin variable veya method olmasi farketmez
        o class'dan aramaya baslar, ilk buldugumuzu kullaniriz

        EGER constructor ve data turu farkli ise
        variable ve method'lar farkli davranir
        ikisinde de aramaya data turunden baslariz,
        variable ilk buldugunu kullanir,
        method ise bulduktan sonra constructor'a kadar daha gunceli var mi diye bakar
         */

}
