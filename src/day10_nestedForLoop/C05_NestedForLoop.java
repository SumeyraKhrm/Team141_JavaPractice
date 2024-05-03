package day10_nestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <=4  ; i++) {
            System.out.print( i + " ");
        }

        System.out.println(" ");

        for (int i = 1; i <=4  ; i++) {
            System.out.print( 2*i + " ");
        }

        System.out.println(" ");

        for (int i = 1; i <=4  ; i++) {
            System.out.print( 3*i + " ");
        }


        System.out.println("");
        System.out.println("Dikdortgen biciminde konsol ciktisi icin nested for loop kullanilir");


        for (int i = 1; i <=3 ; i++) { // outer for loop, satirlari kontrol eder

            for (int j = 1; j <=4 ; j++) { // inner for loop, her satirdaki sutunlari kontrol eder

                System.out.print(i*j + " ");

            }
            System.out.println("");
        }
    }
}
