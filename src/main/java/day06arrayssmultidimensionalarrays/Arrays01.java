package day06arrayssmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //binarySearch() Methodu: Bu methodu kullanarak bir elemanın Array'de olup olmadığını anlarız
//binarySearch() methodunu kullanmadan önce mutlaka "Arrays.sort()" kullanılmalıdır
// binarySearch() Methodu aradığınız eleman Arrayde varsa  ol elemanın indexini returne eder
        //    binarySearch() Methodu u aradığınız eleman Array^de yoksa "-a" şeklinde bir negatif sayi alırsınız
        //Bu sayıdai "-"  işaretinin anlamı bu eleman Arrayda yok demektir."a" nın anlamı olsaydı kacinci sırada olurdu demeketir
        //binarySearch() methodu tekrarlanyan elemanlar için kullanılmaz

        int arr[] = {12, 31, 43, 14};
        int sayi = 12;

        Arrays.sort(arr);//[12,14,31,43]

        int idx1 = Arrays.binarySearch(arr, sayi);//3

        System.out.println(idx1);

        int sayi2 = 58;
        int sonuc = Arrays.binarySearch(arr, sayi2);
        System.out.println(sonuc); //-5 anlamı olmadığı

    }
}