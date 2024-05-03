package day25_staticKeyword;

public class C02_ObjelerleStaticVariableKullanimi {

    public static void main(String[] args) {

    C01_Hastane hemsire1 = new C01_Hastane();
    //class ismi  obje ismi

        // class ismini yazınca static variables getirir
        // obje adını yazarsak instance varibleri getirir

        System.out.println(hemsire1.personelIsmi); // Deger atanmadi
        System.out.println(hemsire1.personelAdres); // Adres girilmedi
        System.out.println(hemsire1.personelTel); // Telefon girilmedi


        System.out.println(hemsire1.hastaneIsmi); // Yildiz hastanesi
        // Static member 'hastaneIsmi' accessed via instance reference
        System.out.println(C01_Hastane.hastaneIsmi); // Yildiz hastanesi

        System.out.println(hemsire1.bashekimIsmi); // Ilgar
        System.out.println(C01_Hastane.bashekimIsmi); // Ilgar

        hemsire1.personelIsmi ="Meltem";
        hemsire1.personelAdres = "Sincan";
        hemsire1.hastaneAdres = "Yenimahalle";


        C01_Hastane hemsire2 = new C01_Hastane();

        System.out.println(hemsire2.personelIsmi); // Deger atanmadi
        System.out.println(hemsire2.personelAdres); // Adres girilmedi
        System.out.println(hemsire2.personelTel); // Telefon girilmedi
        // yeni objede instance variabler sıfırlanır
        System.out.println(hemsire2.hastaneAdres); // Yenimahalle
        // fakat static variabler daki yapılan deeğişiklikler kalıcıdır herkesi etkiler


        hemsire2.personelIsmi = "Sumeyra";
        hemsire2.personelAdres = "Altindag";
        hemsire2.personelTel = "3122343434";
        hemsire2.bashekimIsmi = "Ramazan";
        hemsire2.hastaneAdres = "Altindag";


        C01_Hastane hemsire3 = new C01_Hastane();

        System.out.println(hemsire3.personelIsmi); // Deger atanmadi
        System.out.println(hemsire3.personelAdres); // Adres girilmedi
        System.out.println(hemsire3.personelTel); // Telefon girilmedi


        System.out.println(hemsire1.hastaneAdres); // Altindag
        System.out.println(hemsire2.hastaneAdres); // Altindag
        System.out.println(hemsire3.hastaneAdres); // Altindag

        System.out.println(hemsire1.personelIsmi); // Meltem
        System.out.println(hemsire2.personelIsmi); // Sumeyra
        System.out.println(hemsire3.personelIsmi); // Deger atanmadi








    }
}
