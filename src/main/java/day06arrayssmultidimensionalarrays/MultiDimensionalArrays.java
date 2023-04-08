package day06arrayssmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    // Bir Arrayin elemanları array ise bu Arrayler "Multidimensional Array"dir

    public static void main(String[] args) {
        // Multidimensional Array nasil olusturulur?

        int arr[][] = new int[3][2];
        System.out.println(Arrays.deepToString(arr));
        //Multidemensional Arraylere eleman ekleme nasil yapılır?
        arr[1][0] = 6;
        arr[0][0] = 3;
        arr[1][1] = 18;
        arr[0][1] = -4;
        arr[2][0] = -7;
        arr[2][1] = 0;
//Multideimensional Array console nasıl yazdırılır
        System.out.println(Arrays.deepToString(arr));

        //Multidimensional arraylerde Array elemanlarıdan biri nasil yazdırılır
        System.out.println(Arrays.toString(arr[1]));//[6][18]

        //Multidimensional Arraylerde iç Array elemanlar  nasil yazdırılır
        System.out.println(arr[1][0]);


        //Example 1: String bir Multidemesional Array olusturunuz
        //Elemanları ekleyiniz
        // Toplam eleman sayisini ekrana yazdıran kodu yaziniz

        //String bir Multidemensional Array olusturunuz
        String brr[][] = new String[4][3];
        brr[0][0] = "A";
        brr[0][1] = "B";
        brr[0][2] = "C";

        brr[1][0] = "D";
        brr[1][1] = "E";
        brr[1][2] = "F";

        brr[2][0] = "G";
        brr[2][1] = "H";
        brr[2][2] = "I";

        brr[3][0] = "J";
        brr[3][1] = "K";
        brr[3][2] = "L";

        System.out.println(Arrays.deepToString(brr));//[[A, B, C], [D, E, F], [G, H, I], [J, K, L]]
      //Toplam eleman sayisini ekrana yazdıran kodu yazınız

        int sum = 0;
        for (String[] w : brr) {
            sum = sum + w.length;
        }
        System.out.println(sum);
    }
}