package day17_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C03_Sort {

    public static void main(String[] args) {

        int[]sayilar = {2,9,4,7,1};

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));  //[1, 2, 4, 7, 9]

        String[] isimler = {"Mehmet","Mahmut","Mustafa","Mansur","melik","MEMET"};

        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler));
        //[MEMET, Mahmut, Mansur, Mehmet, Mustafa, melik]

        //küçük harfler büyük harflerden ascı tabloda sonra gelir
    }
}
