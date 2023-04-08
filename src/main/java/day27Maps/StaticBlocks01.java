package day27Maps;

public class StaticBlocks01 {

    public static double pi;
// static blocklar ihtiyacımız olan variable'ların class olusturma safhasında elimizde olmasını sağlar
    //static blocklar Class içindeki herşey'den önce calıştırılır."main method" dan ve diger tüm methodlarlardan önce calıştırılir
    //static block'lar içinde sadece "static variable"lara deger atanabilir
    //Birden fazla "static Block"varsa ustteki önce çalıştırılır.
static{
    System.out.println("Static block 2");
}

    public static void main(String[] args) {
        System.out.println("Main method");
    }

        static {
            pi = 3.14;
            System.out.println("static block 1");
        }
    }
