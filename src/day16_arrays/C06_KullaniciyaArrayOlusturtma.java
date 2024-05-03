package day16_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaArrayOlusturtma {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan
        //         ve bize donduren bir method olusturun.

        System.out.println(Arrays.toString(arrayOlustur()));

    }

    public static int[]arrayOlustur(){

        Scanner scanner=new Scanner(System.in);       // kullanıcı vereceği için değerleri burda istiyoruz
        System.out.println("lütfen array in kaç elemanlı olcağını giriniz..");
        int length =scanner.nextInt();

        int []arr= new int[length];

        for (int i = 0; i <length ; i++) {

            System.out.println(i +". index deki eleman için bir deger giriniz..");

            arr[i]=scanner.nextInt();

        }
        return arr;

    }
}
