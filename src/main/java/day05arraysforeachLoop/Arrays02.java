package day05arraysforeachLoop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {

    public static void main(String[] args) {
        // EXample 1: [0,2,3,0,12,0] sıfırları en sona koyunuz
        //[2,3,12,0,0,0]
        int original[] = {0, 2, 3, 0, 12, 0};
        int yeni[] = new int[original.length];
        int idx = 0;
        for (int i = 0; i < original.length; i++) {

            if (original[i] != 0) {
                yeni[idx] = original[i];
                idx++;

            }
        }
        System.out.println(Arrays.toString(yeni));
//Example2: Bir Arrayîn icinde herhangi bir elemanin olup olmadığını kontrol eden ve kac kere tekrarlandığını gösteren kodu yazını
        //[]==> Kullnici 2'yi sordu ==>2 elemani var ve 3 dkere tekrarlandı
// Kullnici 6'yi sordu ==>2 elemani var ve 6 array de yok

        int arr[] = {2, 1, 2, -3, 2};

        int eleman = 2;
        int counter = 0; // flag": Bazi durumların olup olmadığını kontrol etmek içi "flag" kullanilir.

        for (int w : arr) {
            if (w == eleman) {
            }
        }

        if (counter > 0) {
            System.out.println(eleman + "array'de " + counter + "defa var");
        } else {
            System.out.println(eleman + "arrayda de yok");
        }


        // Example 3: } Size verilen bir cümledeki en uzun kelimeyi bulan kodu yazınız
        // "Java kolaydir calısana, ne kolay ki calısmayana==> calısmanayana

        String sentence= "Java kolaydir calısana, ne kolay ki calısmayana.";
        System.out.println(sentence);

 sentence= sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);


       String words []=sentence.split(" ");
       Arrays.sort(words, Comparator.comparingInt(String::length));//[ne,ki, kolay,kolaydir,calısana,calısmayana]

       System.out.println(Arrays.toString(words));;//[ne,ki, kolay,kolaydir,calısana,calısmayana]

        System.out.println(words[words.length-1]); //calısmayana





    }
}