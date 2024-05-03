package day12_methodOverloading_whileLoop;

public class C03_WhileLoop {
    public static void main(String[] args) {

        // 1'den 10'a kadar olan sayilari (sinirlar dahil)
        // aralarinda bir bosluk birakarak yan yana yazdirin


        for (int i = 1; i <=10 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("   ");

        // aynı soruyu whilee loop ile yapın


        int sayi =1 ;
        while (sayi <=10){
            System.out.print(sayi +" ");
            sayi ++;

        }

    }
}
