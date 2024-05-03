package day03_matematiksel;

public class C01_concatenation {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Candir";

        // String metin ifadeler barindirdigindan
        // matematiksel islemlerde KULLANILAMAZ
        // System.out.println( str1 - str2 ); // Operator '-' cannot be applied to 'java.lang.String', 'java.lang.String'

        // Java'da metinsel ifadeler sadece + islemine tabii tutulabilir
        // + ile yazilan metinler, yan yana birlestirilir

        System.out.println( str1 + str2 ); // JavaCandir

        System.out.println( str1 +" "+ str2 ); // Java Candir

        // String ile + islemine hangi data turu girerse girsin
        // String onu metne cevirir


        System.out.println(str1 + 5); //  "Java5"

        System.out.println(str1 + 5 + 6 + str2); //

        String  s1 = "Java";
        String  s2 = "Candir";
        String  s3 = " ";
        String  s4 = "";

        int a = 5;
        int b = 4;

        // sadece yukardaki variable'lari kullanarak
        // asagida verilen metinleri yazdirin

        // Java 54
        System.out.println(s1+s3+a+b); // Java 54

        // 1 Java
        System.out.println(a-b + s3 + s1); // 1 Java

        // Java 9
        System.out.println(s1+s3+ (a+b) ); // Java 9

        // Candir20
        System.out.println(s2 + a*b ); // Candir20

        // 45Java
        System.out.println(b+a+s1); // 9Java
        System.out.println(b+ (a+s1) ); // 45Java
        System.out.println(   s4+b+a+s1    ); // "4"+ 5 + "Java" ==>45Java



        // "45"'i nasil integer'a cevirip 1 ekleriz
        String str = "45";
        System.out.println( Integer.parseInt(str)  +  1   );


        // Integer olarak verilen bir sayiyi nasil String'e ceviririm (hiçlik ekleriz) başta bunu girmek metinleştiriyor
        String ab = ""+ 59 ;


    }
}
