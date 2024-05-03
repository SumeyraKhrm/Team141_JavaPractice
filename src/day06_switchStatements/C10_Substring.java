package day06_switchStatements;

public class C10_Substring {
    public static void main(String[] args) {

        String str = "Java guzeldir";  // length yani karakter sayisi 13

        System.out.println(str.substring(2)); //va guzeldir

        System.out.println(str.substring(0));  //Java guzeldir

        System.out.println(str.substring(str.length()-1)); //sondan itibaren r

        System.out.println(str.substring(13)); // "" verir, bos satır yazdırır

        //System.out.println(str.substring(  str.length()+1  ));
        // StringIndexOutOfBoundsException
        // length()-1   son index'deki harfi verir
        // length()     son harften sonraki hicligi yazdirir
        // length()+1 ve daha buyuk sayilar StringIndexOutOfBoundsException


        // System.out.println(str.substring(-3)); // StringIndexOutOfBoundsException


        // son 3 harfi yazdirin

        System.out.println(str.substring(str.length() - 3)); // dir

        // bir String'deki karakter sayisina o String'in length'i denir
        // length 1'den baslar, index 0'dan
        // str icin dusunursek length==> 11 , son karakterin index'i ==> 10 (length - 1)



    }
}
