package day08arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {
        //Example 1: Verilen bir listeki elemanları tekrarsiz olarak yaziniz
       // [2,3,3,3,5]==>[2,3,5]

   List<Integer> a= new ArrayList<>();
   a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
   List<Integer>yeni= new ArrayList<>();

   for(Integer w: a){
       if (!yeni.contains(w)) {
           yeni.add(w);
       }
   }
        System.out.println(yeni);


    //Example 2: Kullanicidan bir harf alınız, harf sizdeki Liste'in icinde varsa o harfi "Bulundu" ya ceviriniz yoksa
        // o harfi List'e ekleyeniz
        // [A, K ,R ,S] ==> R ==>[A,K; Bulundu, S]
        // [A ,K ,R ,S] ==>X ==>[A,K; R,S,X]

       Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        String harf=input.next().substring(0,1);


        List<String>c =new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");

        if(c.contains(harf)){

            c.set(c.indexOf(harf),"Bulundu");
        }else{
            c.add(harf);
        }

        System.out.println(c);

        System.out.println();


    }

}
