package day08_stringManipulations;

public class C09_isEmpty_isBlank {
    public static void main(String[] args) {


        // ISEMPTY - ISBLANK

        String str="";
        System.out.println(str.length()); //0
        System.out.println(str.isEmpty()); // boş mu(lengt sıfır mı) true
        System.out.println(str.isBlank()); // buna da true donuyor


        String str1=" ";
        System.out.println(str1.length());  //1
        System.out.println(str1.isEmpty()); //false
        System.out.println(str1.isBlank()); //true
        //length 0 olmasa da sadece space lerden oluşuyorsa ture doner

        String str2="    a";
        System.out.println(str2.isBlank()); //false
        // bir metnin sadece spacelerden olustugunu kontrol ediyor



    }
}
