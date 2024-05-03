package day01_JavaGırıs;

import java.util.Scanner;

public class C02_Scanner_objesı {
    public static void main(String[] args) {

        // kullanıcıdan bilgi almak için kullanılır
        // kullanıcıdan isimi alıp, ismi büyük harf olarak yazdırın


        //1- bir scanner objesi oluşturulur
        Scanner scanner =new Scanner(System.in);

        //2- kullanıcıdan ne istediğinizi söylemeliyiz
        System.out.println("lütfen isminizi giriniz");

        //3- girilen ifadeyi kayıt edecek bir variable oluşturmalıyız
        // oluşturduğumuz scanner objesi ile uygun hazır method kullanın

        String kullanıcıısım =scanner.nextLine(); // birden fazla isim girebileceği için line

        System.out.println("girilen ismin buyuk harf ile yazımı:"+kullanıcıısım.toUpperCase());


       // Ex: kullanıcıdan bir tamsayı isteyip, sayının  karesini yazdırın

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("lütfen bir tamsayı giriniz..");

        int girilenSayı = scanner1.nextInt();

        System.out.println("Girilen sayının karesi : "+ girilenSayı*girilenSayı);


       // Ex: kullanıcıdan bir metin isteyip,metnin sadece ilk harfini büyük harf olarak yazdırın

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("lütfen bir metin giriniz");

        String metin = scanner2.nextLine(); // burada tüm metni kaydettik

        System.out.println(metin.toUpperCase().charAt(0)); // ilk harfi alıyoruz


        // 2. yöntem olarak sadece ilk harfi alıp kaydedelim

        System.out.println("lütfen bir metin daha giriniz");

        char ilkharf = scanner2.nextLine().toUpperCase().charAt(0);

        System.out.println("ikinci metnin ilk harfi:" + ilkharf);



    }
}