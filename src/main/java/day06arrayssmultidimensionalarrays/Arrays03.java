package day06arrayssmultidimensionalarrays;

import java.util.Arrays;
import java.util.Locale;

public class Arrays03 {
    public static void main(String[] args) {


        //Example1: Bir Stringdeki sesli harflerin sayisini bulan kodu yazınız
        // a-e-o-u-A-E-O-U
        String str= "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";
str=str.toLowerCase();

        String harfler[]= str.split("");
       int counter=0;
        System.out.println(Arrays.toString(harfler));

        for(String w: harfler){
            switch (w){

                case "a":

                case "e":

                case "i":

                case "o":

                case "u":
                    counter++;



            }
        }
        System.out.println(counter);

    }

}
