package day06_switchStatements;

import java.util.Scanner;

public class C06_Haftaıcıhaftasonu {
    public static void main(String[] args) {

   /*
        // SORU : kullanicidan gun numarasini isteyin
        // 1- pazartesi .... 7 pazar olacak sekilde
        // girilen numaraya karsilik hafta ici veya hafta sonu
        // seceneklerinden uygun olani yazdirin
        // Kullanici 1-7 arasinda sayi girmezse hata mesaji verin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Gun ismini yazdirmak icin 1-7 arasi bir tamsayi giriniz...");
        int gunNo = scanner.nextInt();

        switch (gunNo){

            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("hafta ici");
                break;
            case 6 :
            case 7 :
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("gecerli bir gun numarasi giriniz");

               */

                //SORU :- Kullanicidan ISTQB kisaltmasindaki harflerden anlamini ogrenmek istedigini alin
                // ve girilen harfin karsiligini yazdirin.
                //	      I : International
                //	      S : Software
                //	      T : Testing
                //	      Q : Qualifications
                //	      B: Board


                Scanner scan = new Scanner(System.in);
                System.out.println("ISTQB kısaltmasından istediğiniz harfi giriniz....");
                char girilenharf = scan.nextLine().toUpperCase().charAt(0);

            switch (girilenharf){

                case 'I' :
                    System.out.println("International");
                    break;
                case 'S' :
                    System.out.println("Software");
                    break;
                case 'T' :
                    System.out.println("Testing");
                    break;
                case 'Q':
                    System.out.println("Qualifications");
                    break;
                case 'B':
                    System.out.println("Board");
                    break;
                default:
                    System.out.println("Lütfen kısaltmadaki harflerden giriniz");



            }
    }
}
