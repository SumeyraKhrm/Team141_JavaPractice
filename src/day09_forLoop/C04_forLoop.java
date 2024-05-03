package day09_forLoop;

public class C04_forLoop {
    public static void main(String[] args) {

        // Soru: 1 den 100 e kadar olan sayıları yazdırın
        // java da tekrar eden ıslemler ıcın loop lar kullanılır

        for (int i =1 ;i <=100; i++) {
            System.out.println(i + "");
        }

        System.out.println(""); // alt satıra gecmeyi sağlar


        // Soru: 34 den baslayıp ,3 er 3 er arttıracak
        //100 e kadar (100 harıc) sayıları yazdırın

        for (int i =34 ;i <100; i+=3) {
            System.out.println(i + "");
        }

        System.out.println("");


        // Soru: 2 basamaklı sayılardan 7 ile bolunebilenlerı yazdırın

        for (int i =10 ;i <100; i++) {

            if (i%7==0)
            System.out.println(i + "");
        }


        // Soru: iki basamakli pozitif tamsayilarin toplamini yazdirin

        int toplam = 0;

        for (int i = 10; i <100 ; i++) {
            toplam += i ;
        }

        System.out.println( "iki basamakli pozitif sayilarin toplami : " + toplam); // 4905



    }

}
