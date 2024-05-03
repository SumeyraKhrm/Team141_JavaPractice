package day05_NestedifElseStatements;

public class C03_TernarySoru {
    public static void main(String[] args) {

        /*
            - Ternary'de iki olasilik olur eger bu iki olsilikdan birinde atama yapmamiz,
            digerinde yazdirmamiz isteniyorsa ternary yerine if tercih edilebilir

            - Ikiden fazla sonuc olasiligi olan gorevlerde
            Ternary pek tercih edilmez
         */

        // SORU: verilen sayi icin asagidaki 3 durumdan uygun olani yazdirin
        // - sayi pozitif
        // - sayi negatif
        // - 0 pozitif veya negatif degildir


        int sayı = 10;

        if(sayı>0) System.out.println("sayı pozitif");
            else if (sayı<0)
                System.out.println("sayı negatif");
            else System.out.println("0 pozitif veya negatif degildir");

        System.out.println( sayı >0 ? "sayı pozitif" : "sayı 0 veya negatif olabilir");
        System.out.println( sayı >0 ? "sayı pozitif" : sayı==0 ? "sayı 0 veya negatif olabilir" :"Sayi negatif");
    }
}
