package day17exceptions;

public class Exception03 {
    public static void main(String[] args) {
        double d = divideStringByTheNumOfChar("124");
        System.out.println(d);
    }

    //String'deki character sayisini bulunuz.String'i integer'e çeviriniz,Integer'i character sayisina bölünüz
//1.Yol
    public static double divideStringByTheNumOfChar(String str) {
        int length = 0;
        int i = 0;

        double sonuc = 0;
        try {

            length = str.length();//NullPointerException: "null" string ile "length()" kullanıldığında alinir
            i = Integer.valueOf(str);//NumberFormatException:İçinde rakamdan farkli character alan Stringler valueOf()
            //ile kullanildğında
            sonuc = i / length;// AritmethikException:bölen sayı sifir olduğunda alinir

        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

return sonuc;
    }
       //2.Yol
    public static double divideStringByTheNumOfCharacter(String str) {
        int length = 0;
        int i = 0;

        double sonuc = 0;
        try {

            length = str.length();//NullPointerException: "null" string ile "length()" kullanıldığında alinir
            i = Integer.valueOf(str);//NumberFormatException:İçinde rakamdan farkli character alan Stringler valueOf()
            //ile kullanildğında
            sonuc = i / length;// AritmethikException:bölen sayı sifir olduğunda alinir

        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

        return sonuc;
    }
    public static double divideStringByTheNumOfCharacters(String str) {
        int length = 0;
        int i = 0;

        double sonuc = 0;
        try {

            length = str.length();//NullPointerException: "null" string ile "length()" kullanıldığında alinir
            i = Integer.valueOf(str);//NumberFormatException:İçinde rakamdan farkli character alan Stringler valueOf()
            //ile kullanildğında
            sonuc = i / length;// AritmethikException:bölen sayı sifir olduğunda alinir
        }catch (NullPointerException e){
            System.out.println("NullPointer'a özel");
        }catch(Exception e) {
            System.out.println("Diğer tüm exceptionlar için...");
        }

        return sonuc;
    }
/*
Not: 1) Aralarında"parent-child"relationship olan Excepton Classları multiple catchlere kullanmak isterseniz "child" olan
önce kullanılmalidır, aksi takdirde hata verir.
2) aralarında "parent child" relationship olmayan Exception Classları multıple catchlerde kullanmak isterseniz siralama
bir önemi yoktur
 */

}