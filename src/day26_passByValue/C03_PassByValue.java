package day26_passByValue;

public class C03_PassByValue {

    // Java’da bir variable’i method’a gonderdiginde, direk orjinal variable’i gondermeyi,
    //orada yapilan degisikligin kalici olmasini istedigimizde ise main method icerisinde
    // method’dan gelen degeri, orjinal variable’a atamayi tercih etmistir.

    // once scope a bakılır yoksa class levele bakılır

    static int sayi = 50;

    public static void main(String[] args) {

        int sayi = 10;

        // int sayi = 20; // Variable 'sayi' is already defined in the scope

        // boolean sayi = false ; // Variable 'sayi' is already defined in the scope

        sayi = 30;

        System.out.println(sayi);
    }


    public static void method1(){

        int sayi  = 40;
        System.out.println(sayi); // 40
    }

    public static void method2 (int s){
        System.out.println(sayi); // 50
    }
}
