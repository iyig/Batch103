package praticejava;

import java.util.Arrays;
import java.util.Scanner;

public class C016_Arrays {
    public static void main(String[] args) {
        /*
        Interview sorusu
        Kullanicıdan bir String alınız
        Stirn'de var olan her character'in sayisini ekerana yazdırınız
        alacan==> a=3, l=1, c=1,n=1
        abaa==> a=3,b=1
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String str = input.nextLine();
        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[a,a,c,i,l,n]


        int counter = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1].equals(arr[i])) {
                counter++;// aynı harflerse bir artır

            } else {
                System.out.println(arr[i - 1] +  "  karakter sayisi  "  + (counter + 1));
                counter = 0;// farklı karaktere gectiği için counteri sifirla
            }
            if (i == arr.length - 1) {
                System.out.println(arr[i] +  " karakter sayisi  "  + (counter + 1));
            }
        }
    }
}