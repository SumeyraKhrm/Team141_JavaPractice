package day39_interfaces;

public interface I_interfaceInformations {


    // Interface ozel yapisindan dolayi icinde bulunan variable ve
    // method’larin tamami aynı yapidadir.
    // 1-Tum variable’lar public, static ve final’dir.

    public static final int sayi1=10;
    public int sayi2 =20;   // public, static ve final'dir
    static final int sayi3=30;  // public, static ve final'dir


    // 2-Tum method’lar public ve abstract’dir.
    // Bu keywor’ler yazilsa da yazilmasa da farketmez


    //Tum variable’lar final oldugundan
    //olusturulurken deger atanmasi
    //zorunludur, cunku final variable’larda
    //sonradan deger degistirilemez.


    public abstract void method1();
    public void method2();  // public ve abstractır
    abstract String method3(); // public ve abstractır
    int method4();  // public ve abstractır




}
