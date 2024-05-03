package day09_forLoop;

public class C01_stringdenSayıToplama {
    public static void main(String[] args) {

        //SORU :- Kullanicinin belirli bir formatta verdigi
        //      String fiyatlari toplayip yazdirin.
        //		input1 : “15.30 €” , input2 : “11.45 €”
        //		output : 26.75 €


        String fiyatStr1 ="15.30";
        String fiyatStr2 ="11.45";

        System.out.println(fiyatStr1+fiyatStr2); //15.3011.45

        fiyatStr1=fiyatStr1.replaceAll("\\D","");
        fiyatStr2= fiyatStr2. replaceAll("\\D","");

        System.out.println(fiyatStr1+fiyatStr2); //15301145

        System.out.println("verilen fiyatların toplama :" +
                (Double.parseDouble(fiyatStr1)+ Double.parseDouble(fiyatStr2))/100 + " Euro");

        //verilen fiyatların toplama :26.75 Euro

        // noktalarda yok edildigı ıcın vırgulu belırlemek ıcın 100 e bolduk




    }
}
