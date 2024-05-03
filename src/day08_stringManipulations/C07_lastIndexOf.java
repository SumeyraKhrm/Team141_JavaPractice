package day08_stringManipulations;

public class C07_lastIndexOf {
    public static void main(String[] args) {

        String str = "Java çok zevkli";

        System.out.println(str.length()); //15

        //son karakteri yazdırma
        System.out.println(str.charAt(str.length() - 1)); //i

        //str de z harf kullanılmış mı ?
        System.out.println(str.contains("z"));

        // str de ilk k nın indexini yazdırın
        System.out.println(str.indexOf('k'));  // 7 boşlukları  saymakda dahil

        // str de ilk cok nun indexini yazdırın
        System.out.println(str.indexOf("çok")); // 5 kelimenin ilk harfinin indexini verir

        //str de kullanılan son k yı yazdırın
        System.out.println(str.lastIndexOf("k")); //12 (sondan bulur fakat index hem baştan sıralanır)

        // str in son kullanımından bir önceki k nın indexi
        System.out.println(str.lastIndexOf("k", 12 - 1)); //7 (12 dersek yine ilk k yı bulur )

        // metinde kullanılan son "cok" kelimesinin index ini yazdırın
        System.out.println(str.lastIndexOf("çok")); // yine 5

        // metinde kullanılan 'x' harfinin indexini yazdırın
        System.out.println(str.indexOf('x'));   // -1 olmadığı için eksi gösterır




    }
}
