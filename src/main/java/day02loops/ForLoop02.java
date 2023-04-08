package day02loops;

public class ForLoop02 {

    public static void main(String[] args) {
        // Bir Strindeki "m" karakteri haric tum karakterleri yazdırınız
        // Andromeda==> Androeda

        String str = "Andromeda";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c != 'm') {
                System.out.println(c);
            }
        }
        // 2.yol
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == 'm') { // loopun içinde bazi değerler için loopun çalısmamasını isterseniz "continue" kullanınız
                continue;
            }
            System.out.println(c);
        }
// 1'den 100 kadar 6 ile bolunenler haric tum tamsayıları ekrana yazdırınız

        for (int i = 1; i < 101; i++) {
            if (i % 6 == 0) {
                continue;
            }
            System.out.print(i + " ");

        }
        System.out.println();

        // size verilen bir stringdeki "m" den önceki karakterleri yazdırınız

        String s = "Luxemburg";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'm') {

                break;
            }
            System.out.println(c);
        }



    }
}