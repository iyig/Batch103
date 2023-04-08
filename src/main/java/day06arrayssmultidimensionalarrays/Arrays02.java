package day06arrayssmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {


    public static void main(String[] args) {
        //Example1: Size veilen pozitif ve negatif sayilar iceren bir integer arraydeki "en buyuk negatif ve "en kücük pozitif" elemanı bulunuz

        int arr[] = {-12, 18, -5, 23, -2, 0};
        Arrays.sort(arr);//[-12,-5,-2,0,18,23]
        int maxNegative = arr[0];
   int minPositive=arr[arr.length-1];
        for (int w : arr) {

            if (w < 0) {
                maxNegative = Math.max(maxNegative, w);
            }
            if (w > 0) {
                minPositive = Math.min(minPositive, w);
            }
        }
        System.out.println(maxNegative + "and" + minPositive);

    }
}