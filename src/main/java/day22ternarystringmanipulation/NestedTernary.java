package day22ternarystringmanipulation;

public class NestedTernary {


    public static void main(String[] args) {
        /*
        verilen yilin "leap year" olupo olmadığını kontrol eden kodu yazınız

        i) yil 100 e bölünürse 400 2 de bölünmelidir===>1600    1800-
        ii) yıl 100e bölünmezse 4 e bölünmelidir==>1996+  2001-
         */

        int year = 2021;
        String leap = year % 100 == 0 ? (year % 400 == 0 ? "Leap year" : "Leap year değil") : (year % 4 == 0 ? "Leap year" : "Leap year değil");
        System.out.println(leap);

        /*
        Aşağıdaki kurallara göre password'un gecerli olup olmadığını kontrol eden kodu yazınız

        i)sekiz karakterden fazla veya sekiz karakter varsa ilk harfi 'i' olmalidir
        ii)sekiz karakterden  az karakter varsa ilk harfi 'K' olmalidir
         */

        String pwd= "i2a3ed54";
char ilkHarf=pwd.charAt(0);
     String gecerli=  pwd.length()<8 ? (ilkHarf=='K'?"Gecerli " : "Gecersiz  ") : (ilkHarf=='i'? "Gecerli"  : "Gecersiz");

        System.out.println(gecerli);

    }
}