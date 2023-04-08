package day16exception;

public class E01 {
/*
1)Exception (istisnai hata) javada kodlarımızo calıştırirken meydana gelen beklenmedik durumlardir.
2) Exception lar ile calışmanın iki yolu vardır
a) try-catch block kullanma ve exception oluşsa bile calışmayı devam ettirme
b) throw exception kullanarak calışmayi durdurma(mesela yazdığımız kod geregi bir dosya üzerinden okuma yapmamiz
gerekiyor ise bu dosyamiz eger slinmiş ise java dosyayı bulamaz ve uygulamanın devam etmesi gerekmez)
3) Eger exception'i handle etmez isek java çalışmayı durdurur.
4) Try-Catch kullanırken try kodunu bir  yada birden fazla catch ile birlikte kullanabiliriz
5) try, catch olmaksizin yalnız kullanılamaz
6) Eger  yazmış olduğunuz herhangi bir kod satırında  problem olabiliceğini düşünüyorsunuz try-catch block icine
koymalisiniz
7) catch block parantezi icerisinde olması muhtemel exception class ismi yazilır
8) e.getMessage(), methodunu kullanarak teknik mesajlar elde edebiliriz
system.out.println(); burada yazmış olduğum mesajlar benim teknik olmayan acıklamalardır
e.printStackTrace() methodu EXception ile ilgili detaylica teknik mesaj verir. kod çalışmaya devam eder
System.err.println() hata mesajini renkli olarak verir bu sayede consolda diğer mesajlardan ayırmak için kullanırız
9) Eger try body içindeki kod sorunsuz calışırsa catch devreye girmez
 */
    public static void main(String[] args) {
  //      divide(6, 2);//3
    //    divide(0, 2);//0
      //  divide(6, 0);


        divide2(5,0);
        divide2(12,0);

    }
//1.yol tavsiye edilmez

    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Bir sayi sifir ile bölünemez");
        } else {
            System.out.println(a / b);
        }
    }
    // 2.YOl try-catch kullanarak exception'i handle etmek tavsiye edilir.

    public static void divide2(int a,int b) {

    try {
        System.out.println(a / b);
        System.out.println("hi excepution");
        System.out.println("bye exception");
    } catch (ArithmeticException e) {
        System.out.println("Bölme işleminde bir problem oluştu==>"+e.getMessage());
        e.printStackTrace();
        System.err.println("Bölme işleminde bir problem oluştu");
    }
//java matematik ile ilgili karşılasılması muhtemel tum istisnaları hataları ArtimetikException class'ina koymuştur.
        //Matematik tüm istisnaları detayları bilmek zorunda değiliz

    }

}