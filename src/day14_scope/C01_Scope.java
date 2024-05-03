package day14_scope;

public class C01_Scope {

    /*
        Scope :
        variable ve method'larin nerelerden kullanilabilecegini
        ve bir kod blogu icerisinde hangi class uyelerinin kullanilabilecegini
        belirleyen kurallardir
     */

    int a =20;     //class level varible ve scopeları tum classdır
    static String b;

    public static void main(String[] args) {   //local variable


        int sayi =10;
        System.out.println(sayi);
        System.out.println(b);

        for (int i = 0; i < 10; i++) {       // local variableların scope u içerisinde olusturdukları kod bloklarıdır

            int c=20;
        }

    }

    public static void method1(){      //local variable

        System.out.println(b);

    }

    public void method2(){      //local variable
        System.out.println(b);
        System.out.println(a);



    }
}
