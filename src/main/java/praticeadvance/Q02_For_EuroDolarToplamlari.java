package praticeadvance;

import java.util.Arrays;

public class Q02_For_EuroDolarToplamlari {
    /*
    Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamların bulan bir kod yazızı

    String str=$1 $12 €34 €56 $45 €78;
    dolarToplam=58
    euroToplam=168
     */
    public static void main(String[] args) {
        String str = "$1 $12 €34 €56 $45 €78";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        int dolar = 0;
        int euro = 0;

        for (String w : arr) {
            if (w.contains("$")) {
                dolar+=Integer.parseInt((w.replace("$","")));
            }else {


                euro += Integer.parseInt((w.replace("€", "")));

            }
        }
        System.out.println("dolar= " +  dolar);
        System.out.println("euro= " +  euro);
    }


}