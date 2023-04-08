package day17exceptions;
// Exception= beklenmedik problem

public class Exceptions01 {
    public static void main(String[] args) {

        String str = "123";
        int result = convertStringToInteger(str);
        System.out.println(result + 5);

        String st = "1a2b";
        int r = convertStringToInteger(st);
        System.out.println(r + 10);//NumberFormatException: Eger içinde rakamdan farklı charakter barindıran
        // bir String  i valueOf() kullanarak Integer'a çevirmek isterseniz NumberFormatException alirsınız

    }

    public static int convertStringToInteger(String str) {
        int i = 0;
        try {

          //Herhangi bir satirda "Exception" atılırsa Java direkt catch bölümüne gecer try icindeki sonraki kod
         // ları calıstırmaz

            i = Integer.valueOf(str);

            System.out.println("Burasi try bolumu");
        } catch (NumberFormatException e) {
            System.out.println("Rakam olmayan karakter iceren Stirngler Integer'a cevrilemez");
        }
      return i;

        // return Integer.valueOf(str);//İnteger e çeviriyor

    }
}