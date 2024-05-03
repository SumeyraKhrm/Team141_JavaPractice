package day06_switchStatements;

import java.util.Locale;

public class C07_toUpperCase_toLowerCase {
    public static void main(String[] args) {

        String str = "Java Candır";

        System.out.println(str.toUpperCase());

        System.out.println( str.toLowerCase());


        // String'de variable'a atama yapilmadikca
        // method'larla yapilan degisiklikler kalici olmaz

        System.out.println(str); // Java Candir

        // Eger method ile yapilan degisikligin kalici olmasini isterseniz
        // variable'a yeni halini atamalisiniz

        str =  str.toUpperCase();

        System.out.println(str); // JAVA CANDIR

        // Eger kucuk harfe veya buyuk harfe cevirirken
        // local bir alfabeye uygun olarak
        // cevirme yapmak isterseniz

        System.out.println(str.toLowerCase());

        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR"))); //java candır

    }
}
