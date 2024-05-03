package day01_JavaGırıs;


import java.util.Scanner;

public class C03_Scanner_Sorular {
    public static void main(String[] args) {

    /*
        //Soru : kullanıcıdan bir dikdörtgenin 2 kenar uzunluğunu alıp, alanını yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("dikdörtgenin kenar uzunluklarını giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println(kenar1*kenar2);

        //Soru : kullanıcıdan bir çemberin yarıçapını alıp, alanını ve çevreisini yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen cemberin yarıçabını giriniz");

        Double yarıcap =scanner.nextDouble();

        System.out.println("cemberin cevresi: " + 2*3.14*yarıcap);
        System.out.println("dairenin alanı: " + 3.14*yarıcap*yarıcap);

     */

        //Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John,  Soyisminiz : Doe ,Yasiniz : 44  ,Kaydiniz basariyla tamamlanmistir.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");

        String isim= scanner.next();

        System.out.println("Lütfen soy isminizi giriniz");

        String soyad= scanner.next();

        System.out.println("Lütfen yasınızı giriniz");

        int yas= scanner.nextInt();

        System.out.println("Isminiz : "+ isim +
                "\nSoyisminiz : " + soyad +
                "\nYasiniz : " + yas +
                "\nKaydiniz basariyla tamamlanmistir");    // alt satıra inmek için  (option + soru işareti)


    }
}
