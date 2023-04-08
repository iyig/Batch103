package praticejava;

import java.util.Arrays;
import java.util.Scanner;

public class C019_MultidimensionalArrays {
/*
Kullanicının girdiği bir array'in en buyuk elemani ile
en kücük elemanının farkını bulan kodu yazınız

 */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("arrayin uzunluğunu giriniz");

           int uzunluk=input.nextInt();
            int arr[]=new int[uzunluk];


        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Array'in " + (i + 1) + " elemanını giriniz");
            arr[i] = input.nextInt();

        }
        Arrays.sort(arr);
            System.out.println("Array'in en buyuk elemanı :" + arr[uzunluk-1]);// Arrayin en buyük elemanını verir
            System.out.println("Array'in en kucuk elemanı :" + arr[0]);// Arrayin en kücük elemanını verir;

            System.out.println(arr[uzunluk-1]-arr[0]);
        }
    }


