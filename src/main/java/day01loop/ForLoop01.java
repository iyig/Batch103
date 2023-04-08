package day01loop;

public class ForLoop01 {

    public static void main(String[] args) {
        //Example1 Ekran 5 kere Hi yazdırınız
//Tekrarlı isler için loop kullanırız
        //dört çeşit loop vardır

        //i)for-loop
        //Example2 Ekrana 5 kere "hi" yazdırınız

        for (int i = 1; i < 6; i++) {
            System.out.println("Hİ");
        }
        // 4 den 7 de kadar tüm tamsayıları ekrana yazdırın

        for (int i = 4; i < 8; i = i + 1) {
            System.out.println(i);
        }
        // 14 den 5 e kadar tüm sayıları yazdırınız

        for (int i = 14; i > 4; i--) {
            System.out.println(i + " ");

        }

// 14den 5 e kadar çift sayılrı yazdırınız

        for (int i = 14; i > 4; i = i - 2) {
            System.out.println(i + " ");
        }
// 2.yol
        for (int i = 14; i > 4; i--) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        // 28 den 157 kadr tüm tek tamsayıları{

        for (int j = 28; j < 158; j++) {
            if (j % 2 != 0) {
            }

        }
        System.out.println();
// "java" Stringini  j*a*v*a*" Stringine ceviren kodu

        String str = "Java";
        for (int k = 0; k < str.length(); k++) {
            System.out.println(str.charAt(k) + "*");
        }
        // size verlen Stringde tekrarsiz karakterleri ekrana yazdırını
        // "Hellooo Ali==>HeAi

        String s = "Hellooo Ali";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.print(c);

            }
        }

    }

}