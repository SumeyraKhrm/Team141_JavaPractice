package day16_arrays;

import java.util.Arrays;

public class C02_ElemanlariToplama {

    public static void main(String[] args) {

        // Verilen bir int array'deki tum elementleri toplayip yazdiran bir method olusturun

        int[] sayilar = {3,4,5,6};  // burada ise yazdıran bir methodu çağırıyoruz

        elementToplamiYazdir(sayilar);  //verilen array daki elementlerin toplamı :18

        int[] yeniArr = {3,4,5,6,8};

        sayilar = yeniArr;

        System.out.println("Sayilar array'inin yeni hali : " + Arrays.toString(sayilar));

        elementToplamiYazdir(sayilar); // Verilen array'deki elementlerin toplami : 26


    }

    public static void elementToplamiYazdir( int [] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

           toplam += arr[i];

        }

        System.out.println("verilen array daki elementlerin toplamı :" + toplam); // yazdırma method da burada
    }
}
