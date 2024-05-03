package day28_dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class C02_LocalDate {

    public static void main(String[] args) {


        LocalDate tarih = LocalDate.now();

        System.out.println(tarih); //2024-05-01

        // Japanya'daki tarihi yazdiralim

        LocalDate japonyaTarih = LocalDate.now(ZoneId.of("Japan"));
        System.out.println("Japonya tarih : " + japonyaTarih); // 2024-04-03

        // istenen tarihi olusturma

        LocalDate dogumTarihi1 =LocalDate.of(1997, Month.AUGUST,19);
        LocalDate dogumTarihi2 =LocalDate.of(1997, 8,20);


        System.out.println(tarih.plusYears(5).plusMonths(7).plusDays(10)); //2029-12-11

        // verilen iki dogum tarihinden eski olani yazdirin

        System.out.println(dogumTarihi1.isBefore(dogumTarihi2) ? dogumTarihi1 : dogumTarihi2); // 1997-08-19



        // verilen yilin artik yil olup olmadigini yazdirin

        System.out.println(dogumTarihi1.isLeapYear()); // false





    }
}
