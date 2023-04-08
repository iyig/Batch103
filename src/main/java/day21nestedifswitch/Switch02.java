package day21nestedifswitch;

import java.util.Locale;
import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {
        /*

        Kullanicıya ay ismi sorunuz ve kullanıcının verdiği ay isminden son aya kadar ekrana yazdırınız


        Not: toLowerCase() methodu bir Stringideki tüm characterleri kücük harfe cevirir
      toUpperCase  methodu bir Stringideki tüm characterleri büyük harfe cevirir

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ay ismi  giriniz...");
        String ayIsmi = input.next().toLowerCase();

        switch (ayIsmi) {
            case "ocak":
                System.out.println("ocak");

            case "şubat":
                System.out.println("şubat");

            case "mart":
                System.out.println("Mart");
            case "nisan":
                System.out.println("Nisan");
            case "mayıs":
                System.out.println("Mayıs");
            case "haziran":
                System.out.println("Haziran");
            case "temmuz":
                System.out.println("Temmuz");
            case "ağustos":
                System.out.println("Ağustos");
            case "eylül":
                System.out.println("Eylül");
            case "ekim":
                System.out.println("Ekim");
            case "kasım":
                System.out.println("Kasım");
            case "aralık":
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Geçerli ay ismi giriniz");
        }
    }
}