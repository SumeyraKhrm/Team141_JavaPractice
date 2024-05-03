package day29_dateTime_Varargs;

import java.time.LocalDate;
import java.time.Period;

public class C01_LocalDate {

    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate dogumtarihi = LocalDate.of(1997,8,19);

        System.out.println(dogumtarihi.until(bugun)); //P 26Y 8M 12D
        System.out.println(dogumtarihi.until(bugun).getYears()); //26

        // verilen zamanlar arasindaki farki bir variable'a kaydetmek isterseniz
        Period yasim = dogumtarihi.until(bugun);
        System.out.println(yasim.getYears()); // 33

        // içinde oldugumuz ay ve yıl kac gün
        System.out.println(bugun.lengthOfMonth());  //31
        System.out.println(bugun.lengthOfYear()); //366

        // verilen tarihin yilin kacinci gunu oldugunu dondurur
        System.out.println(bugun.getDayOfYear()); //366


    }

}

