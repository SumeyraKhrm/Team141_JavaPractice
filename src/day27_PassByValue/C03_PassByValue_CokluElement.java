package day27_PassByValue;

import java.util.Arrays;

public class C03_PassByValue_CokluElement {

    public static void main(String[] args) {

        int[] arr = {6,9,2};

        // arr'in tum elementlerini bir azaltip yazdiran bir method olusturun

        elemanlariAzalt(arr); // method'da [5, 8, 1] yazdirdi

        // method call'dan sonra array'i yazdiralim

        System.out.println(Arrays.toString(arr)); // [5, 8, 1]
        // arr ye değil elementlerine atama var yani indexlere bu sebeple bu değisiklik kalıcı olur !!!!
        // arr ye atama olsaydı mettod da oldugu icın kalıcı olmazdı orda kalırdı

        // yeni bir method olusturun
        // method'da uzunlugu 4 olan yeni bir array olusturup, arr'deki elemanlari yeni array'e tasiyin
        // 4. eleman olarak 3 atayin ve islem bittikten sonra, yeni array'i arr'ye atayip yazdirin

        elemanEkle(arr); //  [5, 8, 1, 3]
        System.out.println("eleman ekle method'undan sonra arr : " + Arrays.toString(arr)); // [5, 8, 1]

}

    public static void elemanEkle(int[] arr){ // [5, 8, 1]

        int[] yeniArr = new int[4]; // [0, 0, 0, 0]

        for (int i = 0; i < arr.length ; i++) {

            yeniArr[i] = arr[i];
        }

        yeniArr[3] = 3;

        arr = yeniArr;

        System.out.println(Arrays.toString(arr));

    }


    public static void elemanlariAzalt(int[] arr){

        for (int i = 0; i < arr.length ; i++) {

            arr[i] -= 1;
        }

        System.out.println(Arrays.toString(arr));
    }

}
