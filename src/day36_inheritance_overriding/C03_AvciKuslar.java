package day36_inheritance_overriding;

public class C03_AvciKuslar extends C02_Kuslar{

    public void hareket() {
        System.out.println("ucarlar");
    }

    public void beslenme() {
        System.out.println("et yerler");
    }

    public void pence() {
        System.out.println("pencelidir");
    }

    public void gaga() {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {


        C03_AvciKuslar kartalAvK = new C03_AvciKuslar();
        //data turu ve cons. aynı classdan secilmis ise method yada variable olmasında hıcbır fark yok

        kartalAvK.omur(); // H yasar ve olurler

        kartalAvK.solunum(); // K akcigerle nefes alir
        kartalAvK.cogalma(); // K yumurtayla cogalir
        kartalAvK.kanat(); // K kanatlidir

        kartalAvK.hareket(); // AvK ucarlar
        kartalAvK.beslenme(); // AvK etle beslenir
        kartalAvK.pence(); // AvK pencelidir
        kartalAvK.gaga(); // AvK sivri gagalidir



        C02_Kuslar kartalKus = new C03_AvciKuslar();
        // kuslardan aramaya baslar, buldugu yere noktayı  koyar ve avcıkuslara kadar daha gunceli varsa onu alır !!

        kartalKus.omur(); // H yasar ve olurler

        kartalKus.solunum(); // K akcigerle nefes alir
        kartalKus.cogalma(); // K yumurtayla cogalir
        kartalKus.kanat(); // K kanatlidir

        kartalKus.hareket(); // AvK ucarlar
        kartalKus.beslenme(); // AvK etle beslenir
        //kartalKus.pence(); // CTE kuslar veya hayvanlarda yok
        kartalKus.gaga(); // AvK sivri gagalidir


        C01_Hayvanlar kartalHayvan = new C03_AvciKuslar();

        kartalHayvan.omur(); // H yasar ve olurler

        kartalHayvan.solunum(); // K akcigerle nefes alir
        kartalHayvan.cogalma(); // K yumurtayla cogalir
        //kartalHayvan.kanat(); // CTE hayvanlarda yok

        kartalHayvan.hareket(); // AvK ucarlar
        kartalHayvan.beslenme(); // AvK etle beslenir
        //kartalHayvan.pence(); // CTE hayvanlarda yok
        //kartalHayvan.gaga(); // CTE hayvanlarda yok



        C02_Kuslar kus1 = new C02_Kuslar();
        kus1.omur(); // H yasar ve olurler

        kus1.solunum(); // K akcigerle nefes alir
        kus1.cogalma(); // K yumurtayla cogalir
        kus1.kanat(); // K kanatlidir

        kus1.hareket(); // H hareket eder
        kus1.beslenme(); // H beslenir
        // kus1.pence(); // CTE kuslar veya hayvanlarda yok
        kus1.gaga(); // K gagalidir


        C01_Hayvanlar kusHayvanlar = new C02_Kuslar();
        // hayvanlardan aramaya baslar, ve kuslara kadar daha gunceli varsa onu alır !!

        kusHayvanlar.omur(); // H yasar ve olurler

        kusHayvanlar.solunum(); // K akcigerle nefes alir
        kusHayvanlar.cogalma(); // K yumurtayla cogalir
        //kusHayvanlar.kanat(); // CTE hayvanlarda yok

        kusHayvanlar.hareket(); // H hareket eder
        kusHayvanlar.beslenme(); // H beslenir
        //kusHayvanlar.pence(); // CTE hayvanlarda yok
        // kusHayvanlar.gaga(); // CTE hayvanlarda yok


        C01_Hayvanlar hayvan1 = new C01_Hayvanlar();
        hayvan1.omur(); // H yasar ve olurler

        hayvan1.solunum(); // H nefes alir
        hayvan1.cogalma(); // H  cogalir
        //hayvan1.kanat(); // CTE hayvanlarda yok

        hayvan1.hareket(); // H hareket eder
        hayvan1.beslenme(); // H beslenir
        //hayvan1.pence(); // CTE hayvanlarda yok
        //hayvan1.gaga(); // CTE hayvanlarda yok




    }
}
