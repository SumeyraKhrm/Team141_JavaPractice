package day02_dataCasting;

public class C08_WrapperClass {
    public static void main(String[] args) {

        // primitive data turleri sadece deger barindirir,
        // non primitive data turleri ise hem deger, hem de hazir method'lar barindirir

        // Java primitive data turleri ile de bazi method'lari kullanabilmemiz icin Wrapper class'lari olusturmustur.
        // Wrapper class'lar primitive'ler ile ayni isimlere sahiptir
        // ancak non-primitive olduklari icin class isimleri buyuk harfle baslar
        // Boolean, Character, Byte, Short, Integer, Long, Float ve Double

        char chr1 = 'a';

        // chr1 primitive char oldugundan hazir method'lari olmaz

        Character chr2 = 'b';

        System.out.println(chr2.charValue()); // b

        System.out.println(Character.isLowerCase(chr1)); // true
        System.out.println(Character.isDigit(chr1)); // false


        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Short.MIN_VALUE); // -32768


        // String olarak verilen iki tamsayiyi toplayin


        String fiyatStr1 = "23";
        String fiyatStr2 = "45";

        System.out.println(fiyatStr1+fiyatStr2); //  2345

        // toplamayi yapabilmek icin once String olarak verilen fiyatlari
        // Integer'a cevirmeliyiz

        System.out.println(Integer.parseInt(fiyatStr1) + Integer.parseInt(fiyatStr2)); // 68


        String fiyatStr3 = "23.56";
        String fiyatStr4 = "45.21";

        System.out.println(Double.parseDouble(fiyatStr3) + Double.parseDouble(fiyatStr4)); //68.77

    }
}
