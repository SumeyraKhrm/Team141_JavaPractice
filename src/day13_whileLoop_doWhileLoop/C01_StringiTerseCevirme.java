package day13_whileLoop_doWhileLoop;

public class C01_StringiTerseCevirme {

    public static void main(String[] args) {

        //Soru 3- While loop kullanarak verilen bir String’i terse cevirip,
        //        bu halini bize donduren bir method olusturun.

        System.out.println(metniTerseCevir("ali topu tut"));   // tut upot ila


    }


    public static String metniTerseCevir (String metin){

        int index = metin.length()-1;
        String tersMetin = "";

        while (index >=0 ){

            tersMetin += metin.charAt(index);
            index--;
        }

        return tersMetin;
    }

}
