package day23_constructors;

public class C01_Araba {

    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    int yil = 1900;
    int fiyat;

    C01_Araba(){
        // Biz bir class'da gorunur bir constructor olusturdugumuzda
        // Java default constructor'i SILER
        // Bu durumda daha onceden default cons.'i kullanarak
        // olusturulan objeler CTE verir
        // Kodun problem yasamamasi icin
        // gorunur bir cons olusturdugumuzda
        // HEMEN default cons. yerine de
        // gorunur bir parametresiz cons. olusturmaliyiz
    }

    C01_Araba(String mrk, String mdl ,int yl , int fyt){   //>2
        marka = mrk;  //marka variable, instance variable dır yani objeye ait >3
        model = mdl; //>4
        yil = yl;   //>5
        fiyat = fyt;  //>6
    }   //>7 geldigın yere don


    // non primitive olduğu için direk yazdırmak icin  !!
    // code alanından => generate tıklayarak => to_String
    @Override
    public String toString() {
        return "C01_Araba =>" +
                "marka :'" + marka + '\'' +
                ", model :'" + model + '\'' +
                ", yil :" + yil +
                ", fiyat :" + fiyat;
    }
}
