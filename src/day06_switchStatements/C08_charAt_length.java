package day06_switchStatements;

public class C08_charAt_length {
    public static void main(String[] args) {

        String str = "Java Candır";

        //metindeki 2. harfi buyuk yazdırın

        System.out.println(str.toUpperCase().charAt(1));   // touppercase string metodu olduğu için chardan önce kullanılır


        // sonuncu harfi yazdirin
        // bu yazim dinamik bir kod degildir
        // str degistirilse de bu kod hep 10.index'deki harfi yazdirir
        System.out.println(str.charAt(10)); // r


        // bir String'deki karakter sayisina o String'in length'i denir
        // length 1'den baslar, index 0'dan
        // str icin dusunursek length==> 11 , son karakterin index'i ==> 10 (length - 1)

        // Dinamik kod
        // kullanicidan alinan input'a bagli olmaksizin
        // her zaman kendini dinamik olarak duzenleyip
        // istenen sonucu verebilen koddur


        // sonuncu harfi yazdirin
        System.out.println(str.charAt( str.length()-1  )); // r

        // sondan 3.harfi yazdirin
        System.out.println(str.charAt( str.length()-3  )); // r


        System.out.println("length : "+ str.length()); // length : 16

        // System.out.println(str.charAt(16)); // 16 ==> length (hata alıyor )
        // StringIndexOutOfBoundsException ==> girilen index sinirlarin disinda


        // Java Compile Time(kodu calistirmadan once)'da
        // kullanilan variable'larin degerlerini goremez
        // sadace data turlerini gorur

        // data turleri acisindan kod'da bir sorun varsa
        // compile time'da bunu farkeder ve altini cizer
        // Compile Time Error (CTE) diyoruz

        // ama degeri goremedigi icin
        // yanlis degerlerin sebep olacagi hatalari
        // Compile Time'da farkedemez
        // deger hatalarini kodlari calistirmaya basladiktan sonra farkeder
        // Bu tur hatalara calismaya basladiktan sonra farkedildigi icin
        // Run Time Error (RTE)



    }
}
