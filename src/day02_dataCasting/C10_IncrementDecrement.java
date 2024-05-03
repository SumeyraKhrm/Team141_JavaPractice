package day02_dataCasting;

public class C10_IncrementDecrement {
    public static void main(String[] args) {

        int sayı =10 ;
        sayı = sayı + 5;
        System.out.println(sayı); //15

        sayı+=5;
        System.out.println(sayı); //20

        sayı ++;
        System.out.println(sayı); // 21

        sayı --;
        System.out.println(sayı); //20

        sayı -=5;
        System.out.println(sayı); //15


         //PRE-POSTINCREMENT



        int e = 20;
        // e'nin degerini yazdirin, sonra e'nin degerini 1 artirin
        System.out.println("e : " + e); // e : 20
        e++;
        // bu satira geldigimizde e 21 olur, ama artisdan once e'yi yazdirdigimiz icin e : 20


        int f = 20;
        // f'nin degerini 1 artirin, sonra f'nin degerini yazdirin
        f++;
        System.out.println("f : " + f);
        // bu satira geldigimizde f'nin degeri 21, yazdirmayi artisdan sonra yaptigimiz icin f : 21



        // Java sayi++ ve sayi-- islemlerine ozel olarak
        //      ++sayi ve --sayi seklinde yazilabilme ozelligi vermistir
        //      sayi++ ve ++sayi sonuc olarak ayni islemi yapar ve sayiyi 1 artirir
        //      aralarindaki fark islemin yapildigi satirda, ikinci bir islem olursa ortaya cikar


        int sayi = 20;
        sayi++;

        // bir sonraki satirda yazdirirsak
        System.out.println(sayi); // 21


        int a = 20;
        ++a;
        // bir sonraki satirda yazdirirsak
        System.out.println(a); // 21


        int b = 20;
        System.out.println("b : " + b++); // b : 20  önce b nin değeri yazdırılıyor, sonra değeri artıyor

        int c = 20;
        System.out.println("c : " + ++c ); // c : 21  önce c nin değeri artıyor, sonra değeri yazdırılıyor

        // islemin yapildigi satirdan sonra aralarinda hic bir fark yoktur
        // ikisi de variable'lari 1 artirdi
        System.out.println("b : " + b + ",c : " + c); // b : 21,c : 21


    }
}
