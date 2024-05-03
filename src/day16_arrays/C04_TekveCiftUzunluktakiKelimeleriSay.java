package day16_arrays;

public class C04_TekveCiftUzunluktakiKelimeleriSay {

    public static void main(String[] args) {

        // verilen bir String array'deki her bir kelimeyi kontrol edip,
        // array'de kac tane tek sayi uzunlugunda,
        // kac tane cift sayi uzunlugunda kelime bulundugunu yazdiran bir method olusturun

        String[] isimler = {"Meltem","Seren","Emrah","Ali","Ahmet","Semih"};

        kelimeSayilariniyazdir(isimler);

    }

    public  static void kelimeSayilariniyazdir(String[]arr){
        
        int teksayiadedi=0;
        int çitfsayiadedi=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].length() %2 == 0) çitfsayiadedi ++;
            else teksayiadedi++;
            }

        System.out.println("array'de " + teksayiadedi + " adet uzunlugu tek olan kelime, \n"+
                çitfsayiadedi +" adet uzunlugu cift sayi olan kelime var");
        }
    }



